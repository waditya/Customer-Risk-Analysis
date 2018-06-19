package insurance_credit_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Entry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName="train_collapsed.csv";
		String productFileName = "insurance_product_description.csv";
		String coefficientFileName = "Coefficient_Master_01.csv";
		
		String collectionName = "Customer";
		String prodCollectionName = "Product";
		String coefficientCollectionName = "LinearCoefficient";
		
		String ipAddress = "127.0.0.1";
		String password = "istm622";
		String userName = "istm622";
		String databaseName = "team007";
		int portNumber = 27017;
		
		Document myDoc;
		Document coeffDoc;
		
		Coefficient coef;
		
		
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = false;

		// Creating a Mongo client 
		MongoClient mongo = new MongoClient( ipAddress , portNumber );

		// Creating Credentials 
		MongoCredential credential; 
		credential = MongoCredential.createCredential(userName, databaseName,
				password.toCharArray()); 

		System.out.println("Connected to the database successfully");

		// Accessing the database 
		MongoDatabase database = mongo.getDatabase(databaseName); 
		System.out.println("Credentials ::"+ credential);

			

		SourceFileHandler sfh = new SourceFileHandler(fileName);
		SourceFileHandler prodsfh = new SourceFileHandler(productFileName);
		SourceFileHandler coeffsfh = new SourceFileHandler(coefficientFileName);

		//Heading of input file
		

		sfh.getHeader();
		prodsfh.getHeader();
		coeffsfh.getHeader();
		
		
		//Create Collections
		
		database.createCollection(collectionName);
		database.createCollection(prodCollectionName);
		database.createCollection(coefficientCollectionName);

		//Create Object Reference to the collections
		MongoCollection<Document> collection = database.getCollection(collectionName);
		MongoCollection<Document> productCollection = database.getCollection(prodCollectionName);
		MongoCollection<Document> coeffCollection = database.getCollection(coefficientCollectionName);
		
		//Call the method to insert document in the MongoDB
		
		collection = sfh.insertDocument(collection);
		productCollection = prodsfh.insertDocument(productCollection);
		coeffCollection = coeffsfh.insertDocument(coeffCollection);
		
		//Create DocumentHandlers 
		
		DocumentHandler dh = new DocumentHandler(collection);
		DocumentHandler productdh = new DocumentHandler(productCollection);
		DocumentHandler cffdh = new DocumentHandler(coeffCollection);
		
		//Move to the 1st record of the collection from the Heading
		dh.setIterDoc();
		productdh.setIterDoc();
		cffdh.setIterDoc();

		
		coeffDoc = cffdh.findFirstDocument();
		

		coef = new Coefficient(coeffDoc);
		coef.calculateCoefficients();

		System.out.println("===========================================================================");
		System.out.println("----------------WELCOME TO INSURANCE RISK SCORE APPLICATION----------------");
		System.out.println("===========================================================================");

		while(!flag) {
			System.out.println("*** Please enter the documentID to be searched ***** ");
			System.out.println("");
			System.out.println("");
			
			UserInput uinp = new UserInput();
			String user_id = uinp.getSearchKey();
			try {
				myDoc = dh.findDocumentById(user_id);				
				flag = true;
				
				RiskProfile rp = new RiskProfile(myDoc,coef);
				
				rp.calculateRiskScore();
				
				System.out.println("Risk Grade is : "+rp.riskGrade);
				
				rp.displayRiskDefinition();
				ProductChoice pc = new ProductChoice(rp.riskGrade, productdh);
				pc.fetchProductAsPerGrade();
				
				
			}
			catch(Exception e) {
				System.out.println("This ID does not exists!");
				flag = false;
				
			}
			String choice="";
		    
			    while(!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")))
				    {
				    	System.out.println("Press y to Continue or Press n to exit");
			
				    	choice=in.readLine();
				    	
			
				    	if(choice.equalsIgnoreCase("y") ) {
				    		flag=false;
				    		
				    	}
				    	else if(choice.equalsIgnoreCase("n")) {
				    		
				    		collection.drop();
				    		productCollection.drop();
				    		coeffCollection.drop();
				    		
				    		flag=true;
				    		
				    	}
				    	else {
				    		System.out.println("Invalid Input; Input should be y or n");
				    		choice="";
			
				    	}
				    }
		}
		System.out.println("********* Thank you for using Risk Score Application *********");
		System.out.println("");
		System.out.println("*********              ----------<>----------        *********");
		mongo.close();

	}

}
