package lt.code.academy;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import lt.code.academy.client.MongoObjectClientProvider;
import lt.code.academy.data.User;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;

public class MongoObjectCollectionExample {
    public static void main(String[] args) {
        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("myMongoDB");
        MongoCollection<User> userCollection = database.getCollection("users", User.class);

        MongoObjectCollectionExample example = new MongoObjectCollectionExample();
        example.printUsers(userCollection);

        List<User> data = List.of(new User(null, "Andrius", "Baltrunas", 35, "a.b@codeacademy.lt", "37048579665"),
                new User(null, "Jonas", "Jonaitis", 62, "Jonas.Jonaitis@codeacademy.lt", "37048579665"),
                new User(null, "Ona", "Ona", 49, "Ona.Ona@codeacademy.lt", "37048579665"),
                new User(null, "Birute", "Bireute", 38, "Birute.Bireute@codeacademy.lt", "37048579665"));
        userCollection.insertMany(data);

        example.printUsers(userCollection);

        //userCollection.updateOne(Filters.eq("_id", new ObjectId("63fe2ad82ffd33452a6b7236")), Updates.set("age", 28));
        userCollection.updateOne(eq("_id", new ObjectId("63fe2ad82ffd33452a6b7236")),
                combine(set("age", 28), set("email", "ona.onaite@codeacademy.lt"), set("phone", "111111")));

	/*	Document document = new Document("age", 33)
				.append("email", "ona.onaite@codeacademy.lt")
				.append("phone", "222222");
		userCollection.updateOne(eq("_id", new ObjectId("63fe2ad82ffd33452a6b7236")), new Document("$set", document));*/

        User user = new User(new ObjectId("63fe2ad82ffd33452a6b7236"), "Onyte", "Onaite", 54, "test@codeacademy.lt", "+397544555");
        userCollection.updateOne(eq("_id", user.getId()), new Document("$set", user));

        example.printUsers(userCollection);
    }

    private void printUsers(MongoCollection<User> userCollection) {
        FindIterable<User> users = userCollection.find();
        for(User user: users){
            System.out.println(user);
        }
    }
}