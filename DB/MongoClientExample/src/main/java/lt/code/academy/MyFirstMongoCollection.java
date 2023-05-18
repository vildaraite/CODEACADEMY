package lt.code.academy;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import static lt.code.academy.client.MongoClientProvider.*;
import org.bson.Document;

public class MyFirstMongoCollection {
    public static void main(String[] args) {
        MongoClient client = getClient();
        MongoDatabase database = client.getDatabase("testDB");
        MongoCollection<Document> myCollection = database.getCollection("testCollection");

        //FindIterable<Document> results = myCollection.find(gt("salary", 85000));
        //FindIterable<Document> results = myCollection.find().sort(new BasicDBObject("salary", -1)); //-1 nuo didziausos, o 1 nuo maziausios
        FindIterable<Document> results = myCollection.find(and(gt("salary", 85000), eq("name", "Andrius")));
        for(Document r: results) {
            System.out.printf("%s %s %s %seu%n", r.get("name"), r.get("surname"), r.get("responsibility"), r.get("salary"));
        }

		/*Iterator<Document> iterator = myCollection.find().iterator();
		while(iterator.hasNext()) {
			Document r = iterator.next();
			System.out.printf("%s %s %s %seu%n", r.get("name"), r.get("surname"), r.get("responsibility"), r.get("salary"));
		}*/
    }
}