package lt.code.academy.client;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class MongoObjectClientProvider {
    private static MongoClient client;

    private MongoObjectClientProvider() {
        //1. uzregistruoti codec
        CodecRegistry registry = CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build());
        // 2. sukurta registry ideti i registries
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), registry);
        // 3. sudeti i setingus sukurta codec registry
        MongoClientSettings settings = MongoClientSettings.builder().codecRegistry(codecRegistry).build();

        client = MongoClients.create(settings);
    }

    public static MongoClient getClient() {
        if(client == null) {
            new MongoObjectClientProvider();
        }

        return client;
    }
}