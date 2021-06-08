package com.salesken.ai.api.service;

import java.util.List;

import com.salesken.ai.model.DatatableModel;
import com.salesken.ai.model.FilterModel;
import com.salesken.ai.model.Organization;
import com.salesken.ai.model.SaleskenResponse;

public interface OrganizationApiService {

	List<Organization> createOrganization(List<Organization> body);

	List<Organization> getFilteredOrganizations(FilterModel body);

	List<Organization> getPaginatedOrganization(DatatableModel body);

	SaleskenResponse invokeOrganization(Long organizationId);

	List<Organization> updateOrganization(List<Organization> body);

}
