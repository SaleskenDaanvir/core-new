/**
 * Salesken Organization APIs
 * <b>Introduction</b><br><br>This is collection of Organization APIs. These are used to create organization, fetch organization records, update organization and invoke organization.<br><br> <b>Authentication</b><br><br> Salesken Organization APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.<br><br> <b>Error Codes</b><br><br> Error codes are defined in superadmin project <a href=\"\">Error Codes</a>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: itadmin@salesken.ai
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.AuthTokenInvalidException;
import io.swagger.model.AuthTokenNotSuppliedException;
import io.swagger.model.BadRequestException;
import io.swagger.model.DatatableModel;
import io.swagger.model.FilterModel;
import io.swagger.model.InternalServerException;
import io.swagger.model.InvalidInputException;
import io.swagger.model.NotFoundException;
import io.swagger.model.Organization;
import io.swagger.model.SaleskenResponse;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Salesken Organization APIs
 *
 * <p><b>Introduction</b><br><br>This is collection of Organization APIs. These are used to create organization, fetch organization records, update organization and invoke organization.<br><br> <b>Authentication</b><br><br> Salesken Organization APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.<br><br> <b>Error Codes</b><br><br> Error codes are defined in superadmin project <a href=\"\">Error Codes</a>
 *
 * API tests for OrganizationApi 
 */
public class OrganizationApiTest {


    private OrganizationApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://virtserver.swaggerhub.com/Salesken8/Organization-DataTable-Test/1.0.0", OrganizationApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Create a organization.
     *
     * This API will take an input array as a name, website url, description, address and contact details for organization creation and returns the organization details in response.&lt;br&gt;&lt;b&gt; | Organization Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Organisation Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the name for the organization.&lt;/li&gt; &lt;li&gt;Name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.&lt;/li&gt; &lt;li&gt;It should contain a valid organization name.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain more than one space together. &lt;/li&gt; &lt;li&gt;This property should be normalized. e.g. It should not contain any kind of code into it.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ABC Organization&lt;/li&gt; &lt;li&gt;99 Acres&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ABC@ Organization&lt;/li&gt; &lt;li&gt;&lt;&lt;name&gt;ABC Organization&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Description (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the description for the organization.&lt;/li&gt; &lt;li&gt;Description property should contain at least 3 characters and a maximum of 250 characters of letters and digits and also should not contain more than one space together. &lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;This is the discription of ABC Organization&lt;/li&gt; &lt;li&gt;99 Acres is India Real Estate Property Site...&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 3. Profile (Enum) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the profile for the organization.&lt;/li&gt; &lt;li&gt;Profile enum property can have Software and IT value.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Software&lt;/li&gt; &lt;li&gt;IT&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;&lt;&lt;Sotware&gt;IT&gt;&lt;/li&gt; &lt;li&gt;&lt;&lt;Software&gt;Software&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 4. Website (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the website URL for the organization.&lt;/li&gt; &lt;li&gt;Website property should start with http or https and have a valid URL.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;https://www.example.com/&lt;/li&gt; &lt;li&gt;https://salesken.ai/&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ftp://example.com/&lt;/li&gt; &lt;li&gt;smtp://salesken.com/&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 5. Contact Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contactName of the organization. In other words, Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain more than one space together.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Abc Xyz&lt;/li&gt; &lt;li&gt;Abc 98&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Abc@98&lt;/li&gt; &lt;li&gt;Mr. Xyz&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. Contact Email (String)  - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contact email for the organization. In other words, Email of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact email property should contain at least 3 characters and a maximum of 254 characters of letters, digits, underscore, dot, hyphen and At the rate symbol.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned and also should not contain more than one space together.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;abc@xyz.com&lt;/li&gt; &lt;li&gt;xyz@salesken.ai&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;abc@salesken.&lt;/li&gt; &lt;li&gt;@abc.com&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 7. Contact Phone (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contact phone number for the organization. In other words, Phone number of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact phone number property should contain at least 4 characters and a maximum of 15 characters of digits.&lt;/li&gt; &lt;li&gt;This property should not have any character and any special characters.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;919988776655&lt;/li&gt; &lt;li&gt;9988776655&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;+919988776655&lt;/li&gt; &lt;li&gt;99887 76655&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 8. Address (Object) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the address for the organization.&lt;/li&gt; &lt;li&gt;This has four properties - AddressLine 1, AddressLine 2, Landmark, ZipCodeId&lt;/li&gt; &lt;b&gt;A. AddressLine 1 (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the address line 1 for the Address Object.&lt;/li&gt; &lt;li&gt;address line 1 property should contain at least 5 characters and a maximum  of 46 characters of letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;#1, 9 Cross Road Salesken, Bengaluru&lt;/li&gt; &lt;li&gt;Leela Palace, Bengaluru&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@1 -&gt; 9Cross Road!&lt;/li&gt; &lt;li&gt;$1 &lt;&gt; 9Cross Road@&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;B.  AddressLine 2 (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the address line 2 for the Address Object.&lt;/li&gt; &lt;li&gt;Address line 2 property should contain at least 5 characters and a maximum of 46 characters of letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Bengaluru, Karnataka&lt;/li&gt; &lt;li&gt;Bengaluru, Karnataka, India&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@1 Bengaluru!&lt;/li&gt; &lt;li&gt;Ben&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;C. Landmark (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the landmark for the Address Object.&lt;/li&gt; &lt;li&gt;Landmark property should contain  letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Salesken&lt;/li&gt; &lt;li&gt;Leela Palace&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@Salesken&lt;/li&gt; &lt;li&gt;Leela -&gt; Palace&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;D. Pincode (Integer) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the pincode for the Address Object.&lt;/li&gt; &lt;li&gt;Pincode property should contain at least 2 digits and a maximum  of 10 digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;560007&lt;/li&gt; &lt;li&gt;400076&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;1&lt;/li&gt; &lt;li&gt;99887766551&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;E. City (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the city for the Address Object.&lt;/li&gt; &lt;li&gt;City property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Bengaluru&lt;/li&gt; &lt;li&gt;Mumbai&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Mumbai&#x27;s&lt;/li&gt; &lt;li&gt;@Bengaluru&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;F. State (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the state for the Address Object.&lt;/li&gt; &lt;li&gt;State property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Maharastra&lt;/li&gt; &lt;li&gt;Karnataka&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;M@h@r@stra&lt;/li&gt; &lt;li&gt;Karnataka&#x27;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;G. Country (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the country for the Address Object.&lt;/li&gt; &lt;li&gt;Country property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;India&lt;/li&gt; &lt;li&gt;China&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;India&#x27;s&lt;/li&gt; &lt;li&gt;China&#x27;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;/ul&gt;&lt;b&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationTest() {
        List<Organization> body = null;
        //List<Organization> response = api.createOrganization(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Fetch an existing organization.
     *
     * This API will take input as a organization id and returns organization details as the response. &lt;br&gt; &lt;b&gt;&lt;br&gt; 1. Organization Id (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the id for the organization. And it will be unique for an organization&lt;/li&gt; &lt;li&gt;It should contain a valid organization Id.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 60c0b7d893016a6d857d8eda, 60c0b7d893016a6d857d8ee6 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOrganizationTest() {
        String organizationId = null;
        //Organization response = api.fetchOrganization(organizationId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Get organizations details.
     *
     * This API will take input either orgId or limit and offset and order by columns id and direction and returns the organization details according to filter properties.&lt;br&gt;&lt;b&gt; | Filter Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Id (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property is a unique identifier for organization in salesken database.&lt;/li&gt; &lt;li&gt;If passing Id then no other property need to be passed.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 60c0b7d893016a6d857d8eda, 60c0b7d893016a6d857d8ee6 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Limit (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Number of records that the table can display in the current draw.&lt;/li&gt; &lt;li&gt;It is expected that the number of records returned will be equal to this number.&lt;/li&gt; &lt;li&gt;This property can be -1 to indicate that all records should be returned&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;Please refer /organization/create to know limitation of organization name.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 1, 2, 3, 100 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Offset (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Paging first record indicator.&lt;/li&gt; &lt;li&gt;This is the start point in the current data set (0 index based - i.e. 0 is the first record).&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 0, 10, 15 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. Order (Array) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Column (Integer) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Column to which ordering should be applied.&lt;/li&gt; &lt;li&gt;This is an index reference to the columns array of information that is also submitted to the server.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 0, 1, 2, 3 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Dir (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Ordering direction for this column. It will be asc or desc to indicate ascending ordering or descending ordering, respectively.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - asc, desc etc.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt;&lt;b&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilteredOrganizationsTest() {
        FilterModel body = null;
        //List<Organization> response = api.getFilteredOrganizations(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Datatable response for list of organizations.
     *
     * This api will be used to populate paginated  datatable response for the list of organizations.&lt;br&gt;&lt;b&gt; | DataTable Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Draw (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Draw counter. This is used by DataTables to ensure that the Ajax returns from server-side processing requests are drawn in sequence by DataTables&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 1, 3, 4, 5 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Start (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Paging first record indicator.&lt;/li&gt; &lt;li&gt;This is the start point in the current data set (0 index based - i.e. 0 is the first record).&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 0, 1, 2, 4 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 3. Length (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Number of records that the table can display in the current draw.&lt;/li&gt; &lt;li&gt;It is expected that the number of records returned will be equal to this number.&lt;/li&gt; &lt;li&gt;This property can be -1 to indicate that all records should be returned&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 1, 2, 3, 4 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 4. Search (Object) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Value (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Global search value. To be applied to all columns which have searchable as true.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;id&lt;/li&gt; &lt;li&gt;name&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;name@Org&lt;/li&gt; &lt;li&gt;&lt;&lt;name&gt;name&gt;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;B. Regex (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;True if the global filter should be treated as a regular expression for advanced searching, False otherwise.&lt;/li&gt; &lt;li&gt;Note that normally server-side processing scripts will not perform regular expression searching for performance reasons on large data sets&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - true, false etc.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 5. Columns (Array) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Data (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property can be used to read and write data to and from any data source property, including deeply nested objects / properties.&lt;/li&gt; &lt;li&gt;Data can be given in a number of different ways which affect its behaviour.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - Abc Organization, Xyz Configuration&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Name (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Column&#x27;s name&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;id&lt;/li&gt; &lt;li&gt;name&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;org@name&lt;/li&gt; &lt;li&gt;org@id&gt;!&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;C. Searchable (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Flag to indicate if this column is searchable (true) or not (false).&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - true, false etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;D. Orderable (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Flag to indicate if this column is orderable (true) or not (false).&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - true, false etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;E. Search (Object) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Already Described Above.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. Order (Array) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Column (Integer) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Column to which ordering should be applied.&lt;/li&gt; &lt;li&gt;This is an index reference to the columns array of information that is also submitted to the server.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 0, 1, 2, 3 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Dir (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Ordering direction for this column. It will be asc or desc to indicate ascending ordering or descending ordering, respectively.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - asc, desc etc.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt;&lt;b&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaginatedOrganizationTest() {
        DatatableModel body = null;
        //List<Organization> response = api.getPaginatedOrganization(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Invoke an existing organization.
     *
     * This API will take input as a organization id for organization deletion and returns the response e.g. (true/false).&lt;br&gt; &lt;b&gt;&lt;br&gt; 1. Organization Id (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the id for the organization. And it will be unique for an organization&lt;/li&gt; &lt;li&gt;It should contain a valid organization Id.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 60c0b7d893016a6d857d8eda, 60c0b7d893016a6d857d8ee6 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invokeOrganizationTest() {
        String organizationId = null;
        //SaleskenResponse response = api.invokeOrganization(organizationId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * update existing organization.
     *
     * This API will take an input array as a id, name, website url, description, address and contact details for organization updation and returns the organization details in response.&lt;br&gt;&lt;b&gt; | Organization Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Id (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the id for the organization. And it will be unique for an organization&lt;/li&gt; &lt;li&gt;It should contain a valid organization Id.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Examples&lt;/b&gt; - 60c0b7d893016a6d857d8eda, 60c0b7d893016a6d857d8ee6 etc.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Organisation Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the name for the organization.&lt;/li&gt; &lt;li&gt;Name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.&lt;/li&gt; &lt;li&gt;It should contain a valid organization name.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain more than one space together. &lt;/li&gt; &lt;li&gt;This property should be normalized. e.g. It should not contain any kind of code into it.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ABC Organization&lt;/li&gt; &lt;li&gt;99 Acres&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ABC@ Organization&lt;/li&gt; &lt;li&gt;Abc987!&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 3. Description (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the description for the organization.&lt;/li&gt; &lt;li&gt;Description property should contain at least 3 characters and a maximum of 250 characters of letters and digits and also should not contain more than one space together. &lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;This is the discription of ABC Organization&lt;/li&gt; &lt;li&gt;99 Acres is India Real Estate Property Site...&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 4. Profile (Enum) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the profile for the organization.&lt;/li&gt; &lt;li&gt;Profile enum property can have Software and IT value.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Software&lt;/li&gt; &lt;li&gt;IT&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 5. Website (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the website URL for the organization.&lt;/li&gt; &lt;li&gt;Website property should start with http or https and have a valid URL.&lt;/li&gt; &lt;li&gt;Property is mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;https://www.example.com/&lt;/li&gt; &lt;li&gt;https://salesken.ai/&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;ftp://example.com/&lt;/li&gt; &lt;li&gt;smtp://salesken.com/&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. Contact Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contactName of the organization. In other words, Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain more than one space together.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Abc Xyz&lt;/li&gt; &lt;li&gt;Abc 98&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Abc@98&lt;/li&gt; &lt;li&gt;Mr. Xyz&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 7. Contact Email (String)  - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contact email for the organization. In other words, Email of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact email property should contain at least 3 characters and a maximum of 254 characters of letters, digits, underscore, dot, hyphen and At the rate symbol.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned and also should not contain more than one space together.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;abc@xyz.com&lt;/li&gt; &lt;li&gt;xyz@salesken.ai&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;abc@salesken.&lt;/li&gt; &lt;li&gt;@abc.com&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 8. Contact Phone (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the contact phone number for the organization. In other words, Phone number of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;Contact phone number property should contain at least 4 characters and a maximum of 15 characters of digits.&lt;/li&gt; &lt;li&gt;This property should not have any character and any special characters.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;919988776655&lt;/li&gt; &lt;li&gt;9988776655&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;+919988776655&lt;/li&gt; &lt;li&gt;99887 76655&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 9. Address (Object) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the address for the organization.&lt;/li&gt; &lt;li&gt;This has four properties - AddressLine 1, AddressLine 2, Landmark, ZipCodeId&lt;/li&gt; &lt;b&gt;A. AddressLine 1 (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the address line 1 for the Address Object.&lt;/li&gt; &lt;li&gt;address line 1 property should contain at least 5 characters and a maximum  of 46 characters of letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;#1, 9 Cross Road Salesken, Bengaluru&lt;/li&gt; &lt;li&gt;Leela Palace, Bengaluru&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@1 -&gt; 9Cross Road!&lt;/li&gt; &lt;li&gt;$1 &lt;&gt; 9Cross Road@&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;B.  AddressLine 2 (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the address line 2 for the Address Object.&lt;/li&gt; &lt;li&gt;Address line 2 property should contain at least 5 characters and a maximum of 46 characters of letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Bengaluru, Karnataka&lt;/li&gt; &lt;li&gt;Bengaluru, Karnataka, India&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@1 Bengaluru!&lt;/li&gt; &lt;li&gt;Ben&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;C. Landmark (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the landmark for the Address Object.&lt;/li&gt; &lt;li&gt;Landmark property should contain  letters, hash, digits, comma, and hyphen.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Salesken&lt;/li&gt; &lt;li&gt;Leela Palace&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;@Salesken&lt;/li&gt; &lt;li&gt;Leela -&gt; Palace&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;D. Pincode (Integer) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the pincode for the Address Object.&lt;/li&gt; &lt;li&gt;Pincode property should contain at least 2 digits and a maximum  of 10 digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;560007&lt;/li&gt; &lt;li&gt;400076&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;1&lt;/li&gt; &lt;li&gt;99887766551&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;E. City (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the city for the Address Object.&lt;/li&gt; &lt;li&gt;City property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Bengaluru&lt;/li&gt; &lt;li&gt;Mumbai&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Mumbai&#x27;s&lt;/li&gt; &lt;li&gt;@Bengaluru&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;F. State (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the state for the Address Object.&lt;/li&gt; &lt;li&gt;State property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;Maharastra&lt;/li&gt; &lt;li&gt;Karnataka&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;M@h@r@stra&lt;/li&gt; &lt;li&gt;Karnataka&#x27;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;G. Country (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property will define the country for the Address Object.&lt;/li&gt; &lt;li&gt;Country property should contain character and digits.&lt;/li&gt; &lt;li&gt;Property is not mandatory.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Valid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;India&lt;/li&gt; &lt;li&gt;China&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Invalid Examples&lt;/b&gt;&lt;/li&gt; &lt;ul&gt; &lt;li&gt;India&#x27;s&lt;/li&gt; &lt;li&gt;China&#x27;&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;/ul&gt;&lt;b&gt; &lt;font size&#x3D;3&gt;&lt;b&gt;Response Time &lt;&#x3D;300ms&lt;/b&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationTest() {
        List<Organization> body = null;
        //List<Organization> response = api.updateOrganization(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
