package insurance_credit_score;



import org.bson.Document;
import com.mongodb.BasicDBObject;


public class ProductChoice   {
	String riskGrade;
	DocumentHandler pdh;
	
	
	public ProductChoice(String riskGrade, DocumentHandler pdh) {
		super();
		this.riskGrade = riskGrade;
		this.pdh = pdh;
	}


	public void fetchProductAsPerGrade() {
		BasicDBObject query = new BasicDBObject();
		
		query.put("prod_grade",riskGrade);
		pdh.it = pdh.collection.find(query).iterator();
		System.out.println();
		System.out.println("The Insurance Products recommended to the user are as below - ");
		System.out.println();
		
		while(pdh.it.hasNext()) {
			Document mydoc = (Document)pdh.it.next();
			System.out.println(mydoc.getString("prod_name"));
		}
		System.out.println();
		
	}
}
