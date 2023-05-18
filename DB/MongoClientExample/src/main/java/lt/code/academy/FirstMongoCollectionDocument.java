package lt.code.academy;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lt.code.academy.client.MongoClientProvider;
import org.bson.Document;

import java.util.List;
import java.util.Map;

public class FirstMongoCollectionDocument {
    public static void main(String[] args) {
        // 1. step
        MongoClient client = MongoClientProvider.getClient();
        // 2. step
        MongoDatabase database = client.getDatabase("myMongoDB");
        // 3. step
        MongoCollection<Document> users = database.getCollection("users");

        Document document = new Document("name", "Andrius")
                .append("surname", "Baltrunas")
                .append("age", 35)
                .append("email", "andrius.baltrunas@codeacademy.lt")
                .append("phone", "+37064254447");

        Document secondDocument = new Document("name", "Petras")
                .append("surname", "Petraitis")
                .append("age", 102)
                .append("email", "petras.petraitis@codeacademy.lt")
                .append("phone", "+38524422415");

        //users.insertOne(document);
        users.insertMany(List.of(document, secondDocument));


        FindIterable<Document> usersResults = users.find();
        for(Document d: usersResults) {
            System.out.println(d);
        }

    }
}