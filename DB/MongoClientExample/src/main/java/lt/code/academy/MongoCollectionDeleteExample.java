package lt.code.academy;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import lt.code.academy.client.MongoClientProvider;
import org.bson.Document;
import org.bson.types.ObjectId;

public class MongoCollectionDeleteExample {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClientProvider.getClient();
        MongoDatabase database = mongoClient.getDatabase("myMongoDB");
        MongoCollection<Document> userCollection = database.getCollection("users");

        //userCollection.deleteOne(new Document("_id", new ObjectId("63fcde41d6e0342c6a66754a")));
        //userCollection.deleteOne(eq("_id", new ObjectId("63fcde6ccef18e5bac53cb24")));
        userCollection.deleteMany(and(eq("name", "Naujas vardas"), eq("surname", "nauja pavarde")));

        FindIterable<Document> users = userCollection.find();
        for(Document user: users) {
            System.out.println(user);
        }
    }
}