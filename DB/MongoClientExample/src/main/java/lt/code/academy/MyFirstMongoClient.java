package lt.code.academy;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

public class MyFirstMongoClient {
    public static void main(String[] args) {

        // 1. sukurit mongo klienta

        // jei mongo veikia tame paciame VM
        MongoClient client = new MongoClient();
        //Jei mongo veikia kitame VM
        //MongoClient client = new MongoClient(new MongoClientURI("mongodb://127.0.0.1:27017"));

        // 2. prisijungti prie duomenu bazes
        MongoDatabase database = client.getDatabase("testDB");

        System.out.println(database.getName());

        MongoIterable<String> collectionNames = database.listCollectionNames();
        for(String name: collectionNames) {
            System.out.println(name);
        }

        ListCollectionsIterable<Document> collections = database.listCollections();
        for(Document document: collections) {
            System.out.println(document);
            System.out.println(document.get("name"));
        }
    }
}