package io.swagger.api;

import com.mongodb.client.MongoIterable;
import com.salesken.ai.utils.MongoDBUtils;

public class mongoDBTest {
	public static void main(String[] args) {
		MongoIterable<String> yo = MongoDBUtils.getInstance().getDatabase().listCollectionNames();
		for (String string : yo) {
			System.out.println(string);
		}
	}
}
