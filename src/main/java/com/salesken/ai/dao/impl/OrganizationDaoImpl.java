package com.salesken.ai.dao.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.salesken.ai.dao.OrganizationDao;
import com.salesken.ai.model.Organization;
import com.salesken.ai.utils.MongoDBUtils;

public class OrganizationDaoImpl implements OrganizationDao {

	@Override
	public void insertOne(Organization organization) {
		MongoDatabase mongoDatabase = MongoDBUtils.getInstance().getDatabase();
		MongoCollection<Organization> orgCollection = mongoDatabase.getCollection("organization", Organization.class);
		orgCollection.insertOne(organization);
	}

}
