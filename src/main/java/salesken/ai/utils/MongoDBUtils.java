package salesken.ai.utils;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;




public class MongoDBUtils {
	static MongoClient client;
	static MongoDBUtils db;
	static MongoDatabase mongoDB;
	private static Object mutex = new Object();


	private MongoDBUtils()  {
		client = getDataSource();
	}
	
	public static MongoDBUtils getInstance() {
		try {
			MongoDBUtils result = db;
			if (result == null) {
				synchronized (mutex) {
					result = db;
					if (result == null)
						db = result = new MongoDBUtils();
				}
			}
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db; 
	}

	private synchronized static MongoClient getDataSource() {
		MongoClient mongoClient = null;
		try {
			MongoClientURI connectionString = new MongoClientURI(DBProperties.getProperty("MONGO_CLIENT_URI"));
			mongoClient = new MongoClient(connectionString);
		    mongoDB = mongoClient.getDatabase(DBProperties.getProperty("MONGO_DATABASE"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mongoClient;
	}
	
	public MongoDatabase getDatabase() {
		return mongoDB;
		
	}
}
