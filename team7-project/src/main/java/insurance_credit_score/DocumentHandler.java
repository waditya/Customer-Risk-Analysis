package insurance_credit_score;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.BasicDBObject;


public class DocumentHandler {
	FindIterable<Document> iterDoc;
	MongoCollection<Document> collection;
	Iterator<Document> it;

	public DocumentHandler(MongoCollection<Document> collection) {
		super();
		this.collection = collection;
	}

	public FindIterable<Document> getIterDoc() {
		return iterDoc;
	}

	public void setIterDoc() {
		this.iterDoc = collection.find();
		this.setIt(iterDoc.iterator());
	}
	
	
	
	public Iterator<Document> getIt() {
		return getIt();
	}

	public void setIt(Iterator<Document> it) {
		this.it = this.iterDoc.iterator();
	}

	public void readDocument() {
		while(this.it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Document findDocumentById(String id) {
		Document mydoc;		
		BasicDBObject query = new BasicDBObject();
		
		query.put("Id",id);
		mydoc = (Document) collection.find(query).first();
		System.out.println(mydoc.toJson());
		
		return(mydoc);
	}
	
	public Document findFirstDocument() {
		Document mydoc;
		BasicDBObject query = new BasicDBObject();
		
		query.put("Id","1");
		
		mydoc = (Document) collection.find(query).first();
		
		
		return(mydoc);
		
	}
	
	
	

}
