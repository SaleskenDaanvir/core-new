package invalidPackageName.impl;

import invalidPackageName.*;
import invalidPackageName.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-08T07:59:37.089Z[GMT]")public class OrganizationApiServiceImpl extends OrganizationApiService {
    @Override
    public Response createOrganization(List<Organization> body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getFilteredOrganizations(FilterModel body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPaginatedOrganization(DatatableModel body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response invokeOrganization(Long organizationId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateOrganization(List<Organization> body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
