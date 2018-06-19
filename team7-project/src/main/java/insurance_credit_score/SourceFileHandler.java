package insurance_credit_score;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class SourceFileHandler {
	String fileName;
	String[] heading;
	String[] record;
	File csvfile;


	public SourceFileHandler(String fileName) {
		super();
		this.setFileName(fileName);
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String[] getHeading() {
		return heading;
	}



	public void setHeading(String[] heading) {
		this.heading = heading;
	}



	public File getCsvfile() {
		return csvfile;
	}



	public void setCsvfile(File csvfile) {
		this.csvfile = new File(fileName);	

	}



	public void getHeader() {
		try {	
			this.csvfile = new File(this.fileName);
			Scanner inputStream = new Scanner(this.csvfile);	
			String data=inputStream.next();
			this.heading = data.split(",");
			inputStream.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public MongoCollection<Document> insertDocument(MongoCollection<Document> collection) {
		int k = 0;
		Scanner inputStream;
		try {
			inputStream = new Scanner(this.csvfile);
			String data=inputStream.next();
			while(inputStream.hasNext()){
				data=inputStream.next();
				record = data.split(",");
				Document document = new Document("title", "InsuranceCreditScore");
				for (k=0; k < heading.length; k++)
				{
					document.append(heading[k], record[k]);
				}
				collection.insertOne(document);
				

			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		return collection;
	}
}
