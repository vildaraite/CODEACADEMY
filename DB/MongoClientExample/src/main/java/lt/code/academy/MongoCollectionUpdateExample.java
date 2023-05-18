package lt.code.academy;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import com.sun.tools.jconsole.JConsoleContext;
import lt.code.academy.client.MongoClientProvider;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.function.Consumer;

public class MongoCollectionUpdateExample {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClientProvider.getClient();
        MongoDatabase database = mongoClient.getDatabase("myMongoDB");
        MongoCollection<Document> userCollection = database.getCollection("users");

        MongoCollectionUpdateExample example = new MongoCollectionUpdateExample();
        example.printCollection(userCollection);

        // updeititina tik pirma surasta apgal filtra reiksme
        //userCollection.updateOne(eq("name", "Andrius"), set("age", 45));
        // updeitina visus irasus su ieskomom reiksmem
        //userCollection.updateMany(and(eq("name", "Petras"), eq("surname", "Petraitis")), set("age", 62));
        // atnaujinti kelias reiksmes vienu metu
        //userCollection.updateMany(eq("email", "andrius.baltrunas@codeacademy.lt"),
        // combine(set("name", "Naujas vardas"), set("surname", "nauja pavarde")));

        userCollection.updateOne(eq("_id", new ObjectId("63fcde41d6e0342c6a66754a")),
                combine(set("name", "Kazkas naujo"), set("surname", "Vel kazkas")));

        System.out.println("PO UPDAITO");

        example.printCollection(userCollection);

    }

    private void printCollection(MongoCollection<Document> collection) {
        //Consumer<Document> consumer = (document) -> System.out.println(document);
        //collection.find().forEach(consumer);

        FindIterable<Document> documents = collection.find();
        for(Document document: documents) {
            System.out.println(document);
        }
    }
}