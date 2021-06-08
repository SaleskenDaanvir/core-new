package com.salesken.ai.api.service;

import java.util.List;

import com.salesken.ai.model.DatatableModel;
import com.salesken.ai.model.FilterModel;
import com.salesken.ai.model.SaleskenResponse;
import com.salesken.ai.model.User;

public interface UserApiService {

	User createUser(User body);

	SaleskenResponse deleteUser(Long userId);

	List<User> getFilteredUsers(FilterModel body);

	List<User> getPaginatedUsers(DatatableModel body);

	User updateUser(User body);

}
