/**
 * 
 */
package com.salesken.ai.daoImpl;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.salesken.ai.dao.UserDAO;
import com.salesken.ai.model.User;
import com.salesken.ai.utils.MongoDBUtils;

/**
 * @author salesken
 *
 */
public class UserDAOImpl implements UserDAO {

	@Override
	public void insertUser(User user) {
		MongoDatabase db = MongoDBUtils.getInstance().getDatabase();
		
		MongoCollection<User> userCollection = db.getCollection("user",
				User.class);
		userCollection.insertOne(user);
	}

}
