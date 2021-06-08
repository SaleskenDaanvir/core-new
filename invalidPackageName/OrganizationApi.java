package invalidPackageName;

import invalidPackageName.*;
import invalidPackageName.OrganizationApiService;
import invalidPackageName.factories.OrganizationApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import invalidPackageName.AuthTokenInvalidException;
import invalidPackageName.AuthTokenNotSuppliedException;
import invalidPackageName.BadRequestException;
import invalidPackageName.DatatableModel;
import invalidPackageName.FilterModel;
import invalidPackageName.InternalServerException;
import invalidPackageName.InvalidInputException;
import invalidPackageName.NotFoundException;
import invalidPackageName.Organization;
import invalidPackageName.SaleskenResponse;

import java.util.Map;
import java.util.List;
import invalidPackageName.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/organization")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:41.201Z[GMT]")public class OrganizationApi  {
   private final OrganizationApiService delegate;

   public OrganizationApi(@Context ServletConfig servletContext) {
      OrganizationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrganizationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrganizationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = OrganizationApiServiceFactory.getOrganizationApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create a organization.", description = "This API will take an input array as a name, website url, description, address and contact details for organization creation and returns the organization details in response.<br><b> | Organization Model Description - </b> <b><br> <br>1. Organisation Name (String) - </b><br> <ul> <li>This property will define the name for the organization.</li> <li>Name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.</li> <li>It should contain a valid organization name.</li> <li>This property should not have any special characters and also should not contain more than one space together. </li> <li>This property should be normalized. e.g. It should not contain any kind of code into it.</li> <li>Property is mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>ABC Organization</li> <li>99 Acres</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>ABC@ Organization</li> <li>Abc987!</li> </ul> </ul> <b><br> 2. Description (String) - </b><br> <ul> <li>This property will define the description for the organization.</li> <li>Description property should contain at least 3 characters and a maximum of 250 characters of letters and digits and also should not contain more than one space together. </li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>This is the discription of ABC Organization</li> <li>99 Acres is India Real Estate Property Site...</li> </ul> </ul> <b><br> 3. Profile (Enum) - </b><br> <ul> <li>This property will define the profile for the organization.</li> <li>Profile enum property can have Software and IT value.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Software</li> <li>IT</li> </ul> </ul> <b><br> 4. Website (String) - </b><br> <ul> <li>This property will define the website URL for the organization.</li> <li>Website property should start with http or https and have a valid URL.</li> <li>Property is mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>https://www.example.com/</li> <li>https://salesken.ai/</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>ftp://example.com/</li> <li>smtp://salesken.com/</li> </ul> </ul> <b><br> 5. Contact Name (String) - </b><br> <ul> <li>This property will define the contactName of the organization. In other words, Point of contact for Salesken.</li> <li>Contact name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.</li> <li>This property should not have any special characters and also should not contain more than one space together.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Abc Xyz</li> <li>Abc 98</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>Abc@98</li> <li>Mr. Xyz</li> </ul> </ul> <b><br> 6. Contact Email (String)  - </b><br> <ul> <li>This property will define the contact email for the organization. In other words, Email of Point of contact for Salesken.</li> <li>Contact email property should contain at least 3 characters and a maximum of 254 characters of letters, digits, underscore, dot, hyphen and At the rate symbol.</li> <li>This property should not have special characters other than the mentioned and also should not contain more than one space together.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>abc@xyz.com</li> <li>xyz@salesken.ai</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>abc@salesken.</li> <li>@abc.com</li> </ul> </ul> <b><br> 7. Contact Phone (String) - </b><br> <ul> <li>This property will define the contact phone number for the organization. In other words, Phone number of Point of contact for Salesken.</li> <li>Contact phone number property should contain at least 4 characters and a maximum of 15 characters of digits.</li> <li>This property should not have any character and any special characters.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>919988776655</li> <li>9988776655</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>+919988776655</li> <li>99887 76655</li> </ul> </ul> <b><br> 8. Address (Object) - </b><br> <ul> <li>This property will define the address for the organization.</li> <li>This has four properties - AddressLine 1, AddressLine 2, Landmark, ZipCodeId</li> <b>A. AddressLine 1 (String) - </b> <ul> <li>This property will define the address line 1 for the Address Object.</li> <li>address line 1 property should contain at least 5 characters and a maximum  of 46 characters of letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>#1, 9 Cross Road Salesken, Bengaluru</li> <li>Leela Palace, Bengaluru</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@1 -> 9Cross Road!</li> <li>$1 <> 9Cross Road@</li> </ul> </ul> <b>B.  AddressLine 2 (String) - </b> <ul> <li>This property will define the address line 2 for the Address Object.</li> <li>Address line 2 property should contain at least 5 characters and a maximum of 46 characters of letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Bengaluru, Karnataka</li> <li>Bengaluru, Karnataka, India</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@1 Bengaluru!</li> <li>Ben</li> </ul> </ul> <b>C. Landmark (String) - </b> <ul> <li>This property will define the landmark for the Address Object.</li> <li>Landmark property should contain  letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Salesken</li> <li>Leela Palace</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@Salesken</li> <li>Leela -> Palace</li> </ul> </ul> <b>D. Pincode (Integer) - </b> <ul> <li>This property will define the pincode for the Address Object.</li> <li>Pincode property should contain at least 2 digits and a maximum  of 10 digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>560007</li> <li>400076</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>1</li> <li>99887766551</li> </ul> </ul> <b>E. City (String) - </b> <ul> <li>This property will define the city for the Address Object.</li> <li>City property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Bengaluru</li> <li>Mumbai</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>Mumbai's</li> <li>@Bengaluru</li> </ul> </ul> <b>F. State (String) - </b> <ul> <li>This property will define the state for the Address Object.</li> <li>State property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Maharastra</li> <li>Karnataka</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>M@h@r@stra</li> <li>Karnataka'</li> </ul> </ul> <b>G. Country (String) - </b> <ul> <li>This property will define the country for the Address Object.</li> <li>Country property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>India</li> <li>China</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>India's</li> <li>China'</li> </ul> </ul> </ul> </ul><b> <font size=3><b>Response Time <=300ms</b>", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Organization" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Organization.class)))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public Response createOrganization(@Parameter(in = ParameterIn.DEFAULT, description = "Organization that needs to be created" ,required=true) List<Organization> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrganization(body,securityContext);
    }
    @POST
    @Path("/fetch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Get organizations details.", description = "This API will take input either orgId or limit and offset and order by columns id and direction and returns the organization details according to filter properties.<br><b> | Filter Model Description - </b> <b><br> <br>1. Id (Integer) - </b><br> <ul> <li>This property is a unique identifier for organization in salesken database.</li> <li>And the Id property should be greater than 0 and less than or equal to integer range (2147483647).</li> <li>If passing Id then no other property need to be passed.</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - 1, 2, 3 etc.</li> </ul> <b><br> 2. Limit (Integer) - </b><br> <ul> <li>Number of records that the table can display in the current draw.</li> <li>It is expected that the number of records returned will be equal to this number.</li> <li>This property can be -1 to indicate that all records should be returned</li> <li>Property is not mandatory.</li> <li>Please refer /organization/create to know limitation of organization name.</li> <li><b>Examples</b> - 1, 2, 3, 100 etc.</li> </ul> <b><br> 2. Offset (Integer) - </b><br> <ul> <li>Paging first record indicator.</li> <li>This is the start point in the current data set (0 index based - i.e. 0 is the first record).</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - 0, 10, 15 etc.</li> </ul> <b><br> 6. Order (Array) - </b><br> <ul> <b>A. Column (Integer) - </b> <ul> <li>Column to which ordering should be applied.</li> <li>This is an index reference to the columns array of information that is also submitted to the server.</li> <li><b>Examples</b> - 0, 1, 2, 3 etc.</li> </ul> <b>B. Dir (String) - </b> <ul> <li>Ordering direction for this column. It will be asc or desc to indicate ascending ordering or descending ordering, respectively.</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - asc, desc etc.</li> </ul> </ul><b> <font size=3><b>Response Time <=300ms</b>", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Organization" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Organization.class)))),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public Response getFilteredOrganizations(@Parameter(in = ParameterIn.DEFAULT, description = "" ) FilterModel body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFilteredOrganizations(body,securityContext);
    }
    @POST
    @Path("/records")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Datatable response for list of organizations.", description = "This api will be used to populate paginated  datatable response for the list of organizations.<br><b> | DataTable Model Description - </b> <b><br> <br>1. Draw (Integer) - </b><br> <ul> <li>Draw counter. This is used by DataTables to ensure that the Ajax returns from server-side processing requests are drawn in sequence by DataTables</li> <li>Property is mandatory.</li> <li><b>Examples</b> - 1, 3, 4, 5 etc.</li> </ul> <b><br> 2. Start (Integer) - </b><br> <ul> <li>Paging first record indicator.</li> <li>This is the start point in the current data set (0 index based - i.e. 0 is the first record).</li> <li>Property is mandatory.</li> <li><b>Examples</b> - 0, 1, 2, 4 etc.</li> </ul> <b><br> 3. Length (Integer) - </b><br> <ul> <li>Number of records that the table can display in the current draw.</li> <li>It is expected that the number of records returned will be equal to this number.</li> <li>This property can be -1 to indicate that all records should be returned</li> <li>Property is mandatory.</li> <li><b>Examples</b> - 1, 2, 3, 4 etc.</li> </ul> <b><br> 4. Search (Object) - </b><br> <ul> <b>A. Value (String) - </b> <ul> <li>Global search value. To be applied to all columns which have searchable as true.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>id</li> <li>name</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>name@Org</li> <li>name!</li> </ul> </ul> <b>B. Regex (Boolean) - </b> <ul> <li>True if the global filter should be treated as a regular expression for advanced searching, False otherwise.</li> <li>Note that normally server-side processing scripts will not perform regular expression searching for performance reasons on large data sets</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - true, false etc.</li> </ul> </ul> <b><br> 5. Columns (Array) - </b><br> <ul> <b>A. Data (String) - </b> <ul> <li>This property can be used to read and write data to and from any data source property, including deeply nested objects / properties.</li> <li>Data can be given in a number of different ways which affect its behaviour.</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - Abc Organization, Xyz Configuration</li> </ul> <b>B. Name (String) - </b> <ul> <li>Column's name</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>id</li> <li>name</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>org@name</li> <li>org@id!</li> </ul> </ul> <b>C. Searchable (Boolean) - </b> <ul> <li>Flag to indicate if this column is searchable (true) or not (false).</li> <li><b>Examples</b> - true, false etc.</li> </ul> <b>D. Orderable (Boolean) - </b> <ul> <li>Flag to indicate if this column is orderable (true) or not (false).</li> <li><b>Examples</b> - true, false etc.</li> </ul> <b>E. Search (Object) - </b> <ul> <li>Already Described Above.</li> </ul> </ul> <b><br> 6. Order (Array) - </b><br> <ul> <b>A. Column (Integer) - </b> <ul> <li>Column to which ordering should be applied.</li> <li>This is an index reference to the columns array of information that is also submitted to the server.</li> <li><b>Examples</b> - 0, 1, 2, 3 etc.</li> </ul> <b>B. Dir (String) - </b> <ul> <li>Ordering direction for this column. It will be asc or desc to indicate ascending ordering or descending ordering, respectively.</li> <li>Property is not mandatory.</li> <li><b>Examples</b> - asc, desc etc.</li> </ul> </ul><b> <font size=3><b>Response Time <=300ms</b>", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Organization" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Organization.class)))),
        
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public Response getPaginatedOrganization(@Parameter(in = ParameterIn.DEFAULT, description = "" ) DatatableModel body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPaginatedOrganization(body,securityContext);
    }
    @DELETE
    @Path("/{organizationId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Invoke an existing organization.", description = "This API will take input as a organization id for organization deletion and returns the response e.g. (true/false).<br> <b><br> 1. Organization Id (Integer) - </b><br> <ul> <li>This property will define the id for the organization. And it will be unique for an organization</li> <li>ID property should be greater than 0 and less than integer range (2147483647).</li> <li>It should contain a valid organization Id.</li> <li>Property is mandatory.</li> <li><b>Examples</b> - 1, 2, 3 etc.</li> </ul> <b><br> <font size=3><b>Response Time <=300ms</b>", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Organization" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = SaleskenResponse.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))),
        
        @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = NotFoundException.class))) })
    public Response invokeOrganization(@Parameter(in = ParameterIn.PATH, description = "The organization id that needs to be invoked",required=true) @PathParam("organizationId") Long organizationId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invokeOrganization(organizationId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update existing organization.", description = "This API will take an input array as a id, name, website url, description, address and contact details for organization updation and returns the organization details in response.<br><b> | Organization Model Description - </b> <b><br> <br>1. Id (Integer) - </b><br> <ul> <li>This property will define the id for the organization. And it will be unique for an organization</li> <li>ID property should be greater than 0 and less than integer range (2147483647).</li> <li>It should contain a valid organization Id.</li> <li>Property is mandatory.</li> <li><b>Examples</b> - 1, 2, 3 etc.</li> </ul> <b><br> 2. Organisation Name (String) - </b><br> <ul> <li>This property will define the name for the organization.</li> <li>Name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.</li> <li>It should contain a valid organization name.</li> <li>This property should not have any special characters and also should not contain more than one space together. </li> <li>This property should be normalized. e.g. It should not contain any kind of code into it.</li> <li>Property is mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>ABC Organization</li> <li>99 Acres</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>ABC@ Organization</li> <li>Abc987!</li> </ul> </ul> <b><br> 3. Description (String) - </b><br> <ul> <li>This property will define the description for the organization.</li> <li>Description property should contain at least 3 characters and a maximum of 250 characters of letters and digits and also should not contain more than one space together. </li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>This is the discription of ABC Organization</li> <li>99 Acres is India Real Estate Property Site...</li> </ul> </ul> <b><br> 4. Profile (Enum) - </b><br> <ul> <li>This property will define the profile for the organization.</li> <li>Profile enum property can have Software and IT value.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Software</li> <li>IT</li> </ul> </ul> <b><br> 5. Website (String) - </b><br> <ul> <li>This property will define the website URL for the organization.</li> <li>Website property should start with http or https and have a valid URL.</li> <li>Property is mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>https://www.example.com/</li> <li>https://salesken.ai/</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>ftp://example.com/</li> <li>smtp://salesken.com/</li> </ul> </ul> <b><br> 6. Contact Name (String) - </b><br> <ul> <li>This property will define the contactName of the organization. In other words, Point of contact for Salesken.</li> <li>Contact name property should contain at least 3 characters and a maximum of 46 characters of letters and digits.</li> <li>This property should not have any special characters and also should not contain more than one space together.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Abc Xyz</li> <li>Abc 98</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>Abc@98</li> <li>Mr. Xyz</li> </ul> </ul> <b><br> 7. Contact Email (String)  - </b><br> <ul> <li>This property will define the contact email for the organization. In other words, Email of Point of contact for Salesken.</li> <li>Contact email property should contain at least 3 characters and a maximum of 254 characters of letters, digits, underscore, dot, hyphen and At the rate symbol.</li> <li>This property should not have special characters other than the mentioned and also should not contain more than one space together.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>abc@xyz.com</li> <li>xyz@salesken.ai</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>abc@salesken.</li> <li>@abc.com</li> </ul> </ul> <b><br> 8. Contact Phone (String) - </b><br> <ul> <li>This property will define the contact phone number for the organization. In other words, Phone number of Point of contact for Salesken.</li> <li>Contact phone number property should contain at least 4 characters and a maximum of 15 characters of digits.</li> <li>This property should not have any character and any special characters.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>919988776655</li> <li>9988776655</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>+919988776655</li> <li>99887 76655</li> </ul> </ul> <b><br> 9. Address (Object) - </b><br> <ul> <li>This property will define the address for the organization.</li> <li>This has four properties - AddressLine 1, AddressLine 2, Landmark, ZipCodeId</li> <b>A. AddressLine 1 (String) - </b> <ul> <li>This property will define the address line 1 for the Address Object.</li> <li>address line 1 property should contain at least 5 characters and a maximum  of 46 characters of letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>#1, 9 Cross Road Salesken, Bengaluru</li> <li>Leela Palace, Bengaluru</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@1 -> 9Cross Road!</li> <li>$1 <> 9Cross Road@</li> </ul> </ul> <b>B.  AddressLine 2 (String) - </b> <ul> <li>This property will define the address line 2 for the Address Object.</li> <li>Address line 2 property should contain at least 5 characters and a maximum of 46 characters of letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Bengaluru, Karnataka</li> <li>Bengaluru, Karnataka, India</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@1 Bengaluru!</li> <li>Ben</li> </ul> </ul> <b>C. Landmark (String) - </b> <ul> <li>This property will define the landmark for the Address Object.</li> <li>Landmark property should contain  letters, hash, digits, comma, and hyphen.</li> <li>This property should not have special characters other than the mentioned.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Salesken</li> <li>Leela Palace</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>@Salesken</li> <li>Leela -> Palace</li> </ul> </ul> <b>D. Pincode (Integer) - </b> <ul> <li>This property will define the pincode for the Address Object.</li> <li>Pincode property should contain at least 2 digits and a maximum  of 10 digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>560007</li> <li>400076</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>1</li> <li>99887766551</li> </ul> </ul> <b>E. City (String) - </b> <ul> <li>This property will define the city for the Address Object.</li> <li>City property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Bengaluru</li> <li>Mumbai</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>Mumbai's</li> <li>@Bengaluru</li> </ul> </ul> <b>F. State (String) - </b> <ul> <li>This property will define the state for the Address Object.</li> <li>State property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>Maharastra</li> <li>Karnataka</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>M@h@r@stra</li> <li>Karnataka'</li> </ul> </ul> <b>G. Country (String) - </b> <ul> <li>This property will define the country for the Address Object.</li> <li>Country property should contain character and digits.</li> <li>Property is not mandatory.</li> <li><b>Valid Examples</b></li> <ul> <li>India</li> <li>China</li> </ul> <li><b>Invalid Examples</b></li> <ul> <li>India's</li> <li>China'</li> </ul> </ul> </ul> </ul><b> <font size=3><b>Response Time <=300ms</b>", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Organization" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Organization.class)))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = InvalidInputException.class))),
        
        @ApiResponse(responseCode = "400", description = "Either Nullability / Bad request", content = @Content(schema = @Schema(implementation = BadRequestException.class))),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied", content = @Content(schema = @Schema(implementation = AuthTokenNotSuppliedException.class))),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized", content = @Content(schema = @Schema(implementation = AuthTokenInvalidException.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = InternalServerException.class))) })
    public Response updateOrganization(@Parameter(in = ParameterIn.DEFAULT, description = "Organization that needs to be created" ,required=true) List<Organization> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOrganization(body,securityContext);
    }
}
