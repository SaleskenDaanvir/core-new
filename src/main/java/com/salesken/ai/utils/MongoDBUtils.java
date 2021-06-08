package com.salesken.ai.utils;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


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
			String user=DBProperties.getProperty("MONGO_USER");
			String password = URLEncoder.encode(DBProperties.getProperty("MONGO_PASS"), StandardCharsets.UTF_8.toString());
			String dataBase = DBProperties.getProperty("MONGO_DATABASE");
			String url="mongodb+srv://"+user+":"+password+"@resources.tmkqk.mongodb.net/"+dataBase+"?retryWrites=true&w=majority";
			System.out.println(url);
			MongoClientURI connectionString = new MongoClientURI(url);
			mongoClient = new MongoClient(connectionString);
			
			CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
	                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		    mongoDB = mongoClient.getDatabase(dataBase).withCodecRegistry(pojoCodecRegistry);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return mongoClient;
	}
	
	public MongoDatabase getDatabase() {
		return mongoDB;
		
	}
}
