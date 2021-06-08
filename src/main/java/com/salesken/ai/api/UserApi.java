package com.salesken.ai.api;





import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.salesken.ai.api.exception.AuthTokenInvalidException;
import com.salesken.ai.api.exception.AuthTokenNotSuppliedException;
import com.salesken.ai.api.exception.InternalServerException;
import com.salesken.ai.api.exception.InvalidInputException;
import com.salesken.ai.model.DatatableModel;
import com.salesken.ai.model.FilterModel;
import com.salesken.ai.model.SaleskenResponse;
import com.salesken.ai.model.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Salesken User APIs
 *
 * <p><b>Introduction</b><br><br>This is collection of User APIs. These are used to create user, fetch user records, update user and delete user.<br><br> <b>Authentication</b><br><br> Salesken User APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.
 *
 */
@Path("/")
public interface UserApi  {

    /**
     * Create a user.
     *
     * This API will take input as a name, email, phone, password and designation image url, manager id and role for user creation and returns the user details in response.&lt;br&gt;&lt;b&gt; User Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. user Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the name for the user.&lt;/li&gt; &lt;li&gt;Name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.&lt;/li&gt; &lt;li&gt;It should contain a valid user name.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain more than one space together. &lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Email (String)  - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the user&#x27;s email. In other words, Email of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;user&#x27;s email property should contain at least 3 characters and a maximum of 254 characters of letters, digits, underscore, dot, hyphen and At the rate symbol.&lt;/li&gt; &lt;li&gt;This property should not have special characters other than the mentioned and also should not contain more than one space together.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 3. Phone (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the phone number for the user. In other words, Phone number of Point of contact for Salesken.&lt;/li&gt; &lt;li&gt;user&#x27;s phone number property should contain at least 4 characters and a maximum of 15 characters of digits.&lt;/li&gt; &lt;li&gt;This property should not have any character and any special characters.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 4. Password (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the password for the organization.&lt;/li&gt; &lt;li&gt;password property should contain at least 8 characters and a maximum of 250 characters of letters and digits and also should not contain space. &lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 5. designation (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the designation for the organization.&lt;/li&gt; &lt;li&gt;Profile enum property can have Software and IT value.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. ImageUrl (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the Image URL for the User.&lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 7. managerId (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the managerId of the user.&lt;/li&gt; &lt;li&gt;This property should not have any special characters and also should not contain space .&lt;/li&gt; &lt;li&gt;manager Id property should be greater than 0 and less than integer range (2147483647).&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 8. role (Enum) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property will define the role for the organization.&lt;/li&gt; &lt;li&gt;Profile enum property can have different role values.&lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt;&lt;b&gt;
     *
     */
    @POST
    @Path("/users/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create a user.", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public User createUser(@Valid User body);

    /**
     * Delete an existing user.
     *
     * This API will take input as a user id for user deletion and returns the response e.g. (true/false).&lt;br&gt;&lt;b&gt; 1. User ID (Integer) - &lt;br&gt; &lt;/b&gt; This property is a unique identifier for user in salesken database. And User Id property should be greater than 0 and less than integer range (2147483647).&lt;br&gt;&lt;b&gt;
     *
     */
    @DELETE
    @Path("/users/delete/{userId}")
    @Produces({ "application/json" })
    @Operation(summary = "Delete an existing user.", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = SaleskenResponse.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))),
        @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = NotFoundException.class))) })
    public SaleskenResponse deleteUser(@PathParam("userId") Long userId);

    /**
     * Get users details.
     *
     * This API will take input either orgId or limit and offset and returns the user details according to filter properties.&lt;br&gt;&lt;b&gt; | Filter Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Id (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property is a unique identifier for organization in salesken database.&lt;/li&gt; &lt;li&gt;And the Id property should be greater than 0 and less than or equal to integer range (2147483647).&lt;/li&gt; &lt;li&gt;If passing Id then no other property need to be passed.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Name (String) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;This property defines the name of the organization and this property is not a unique for organization in salesken database.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Limit (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Number of records that the table can display in the current draw.&lt;/li&gt; &lt;li&gt;It is expected that the number of records returned will be equal to this number.&lt;/li&gt; &lt;li&gt;This property can be -1 to indicate that all records should be returned&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;li&gt;Please refer /organization/create to know limitation of organization name.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Offset (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Paging first record indicator.&lt;/li&gt; &lt;li&gt;This is the start point in the current data set (0 index based - i.e. 0 is the first record).&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt;
     *
     */
    @POST
    @Path("/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Get users details.", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public List<User> getFilteredUsers(@Valid FilterModel body);

    /**
     * Datatable response for list of organizations.
     *
     * This api will be used to populate paginated  datatable response for the list of organizations.&lt;br&gt;&lt;b&gt; | DataTable Model Description - &lt;/b&gt; &lt;b&gt;&lt;br&gt; &lt;br&gt;1. Draw (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Draw counter. This is used by DataTables to ensure that the Ajax returns from server-side processing requests are drawn in sequence by DataTables&lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 2. Start (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Paging first record indicator.&lt;/li&gt; &lt;li&gt;This is the start point in the current data set (0 index based - i.e. 0 is the first record).&lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 3. Length (Integer) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;Number of records that the table can display in the current draw.&lt;/li&gt; &lt;li&gt;It is expected that the number of records returned will be equal to this number.&lt;/li&gt; &lt;li&gt;This property can be -1 to indicate that all records should be returned&lt;/li&gt; &lt;li&gt;This property can not be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 4. Search (Object) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Value (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Global search value. To be applied to all columns which have searchable as true.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Regex (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;True if the global filter should be treated as a regular expression for advanced searching, False otherwise.&lt;/li&gt; &lt;li&gt;Note that normally server-side processing scripts will not perform regular expression searching for performance reasons on large data sets&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 5. Columns (Array) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Data (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;This property can be used to read and write data to and from any data source property, including deeply nested objects / properties.&lt;/li&gt; &lt;li&gt;Data can be given in a number of different ways which affect its behaviour.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Name (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Column&#x27;s name&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;C. Searchable (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Flag to indicate if this column is searchable (true) or not (false).&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;D. Orderable (Boolean) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Flag to indicate if this column is orderable (true) or not (false).&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;E. Search (Object) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Already Described Above.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt; &lt;b&gt;&lt;br&gt; 6. Order (Array) - &lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;b&gt;A. Column (Integer) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Column to which ordering should be applied.&lt;/li&gt; &lt;li&gt;This is an index reference to the columns array of information that is also submitted to the server.&lt;/li&gt; &lt;/ul&gt; &lt;b&gt;B. Dir (String) - &lt;/b&gt; &lt;ul&gt; &lt;li&gt;Ordering direction for this column. It will be asc or desc to indicate ascending ordering or descending ordering, respectively.&lt;/li&gt; &lt;li&gt;This property can be null.&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt;&lt;b&gt;
     *
     */
    @POST
    @Path("/users/records")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Datatable response for list of organizations.", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public List<User> getPaginatedUsers(@Valid DatatableModel body);

    /**
     * update existing user.
     *
     * to update user.
     *
     */
    @PUT
    @Path("/users/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update existing user.", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public User updateUser(@Valid User body);
}
