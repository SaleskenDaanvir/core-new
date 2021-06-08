package invalidPackageName;

import invalidPackageName.*;
import invalidPackageName.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public abstract class OrganizationApiService {
    public abstract Response createOrganization(List<Organization> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFilteredOrganizations(FilterModel body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPaginatedOrganization(DatatableModel body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response invokeOrganization(Long organizationId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOrganization(List<Organization> body,SecurityContext securityContext) throws NotFoundException;
}
