package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.CreateTeam;
import io.swagger.model.DeleteTeam;
import io.swagger.model.TeamById;
import io.swagger.model.TeamList;
import io.swagger.model.UpdateTeamDetails;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Salesken Organization APIs
 *
 * <p><b>Introduction</b><br><br>This is collection of Organization APIs. These are used to create organization, fetch organization records, update organization and invoke organization.<br><br> <b>Authentication</b><br><br> Salesken Organization APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.<br><br> <b>Error Codes</b><br><br> Error codes are defined in superadmin project <a href=\"\">Error Codes</a>
 *
 */
@Path("/")
public interface TeamApi  {

    /**
     * Create Team
     *
     * Use this API to create a new team. Can be called from the Sales Manager Web App.
     *
     */
    @POST
    @Path("/team")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create Team", tags={ "Team" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Successfully created team", content = @Content(schema = @Schema(implementation = CreateTeam.class))),
        @ApiResponse(responseCode = "400", description = "Organization Id or Owner Id is null or not of type Integer / Team name is null or not of type String"),
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        @ApiResponse(responseCode = "404", description = "Not found") })
    public CreateTeam createTeam(@Valid Body body);

    /**
     * Delete Team
     *
     * Use this API to delete the team. Can be called from the Sales Manager Web App.
     *
     */
    @DELETE
    @Path("/team/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Delete Team", tags={ "Team" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully deleted team", content = @Content(schema = @Schema(implementation = DeleteTeam.class))),
        @ApiResponse(responseCode = "400", description = "Team Id is null or not of type Integer"),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized"),
        @ApiResponse(responseCode = "404", description = "Team Not Found") })
    public DeleteTeam deleteTeam(@PathParam("id") Integer id);

    /**
     * List all Teams of organization
     *
     * Use this API to get all teams / search teams in an organization. Can be called from the Sales Manager Web App.
     *
     */
    @GET
    @Path("/team/organization/{orgId}")
    @Produces({ "application/json" })
    @Operation(summary = "List all Teams of organization", tags={ "Team" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully listing teams", content = @Content(schema = @Schema(implementation = TeamList.class))),
        @ApiResponse(responseCode = "400", description = "Organization Id is null or not of type Integer"),
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public TeamList listTeam(@PathParam("orgId") Integer orgId, @QueryParam("search") String search);

    /**
     * Get Team by Id
     *
     * Use this API to get a team by Id. Can be called from the Sales Manager Web App.
     *
     */
    @GET
    @Path("/team/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Team by Id", tags={ "Team" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully found team", content = @Content(schema = @Schema(implementation = TeamById.class))),
        @ApiResponse(responseCode = "400", description = "Team Id is null or not of type Integer"),
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public TeamById teamById(@PathParam("id") Integer id);

    /**
     * Edit / Update Team Details
     *
     * Use this API to edit / update team details such as addition / deletion of team members, edit team name and description and assign / re-assign team owner. Can be called from the Sales Manager Web App.
     *
     */
    @POST
    @Path("/team/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Edit / Update Team Details", tags={ "Team" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully updated team", content = @Content(schema = @Schema(implementation = UpdateTeamDetails.class))),
        @ApiResponse(responseCode = "400", description = "Team Id or Owner Id is null or not of type Integer / Team name is null or not of type String"),
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public UpdateTeamDetails updateTeamDetails(@Valid Body1 body, @PathParam("id") Integer id);
}
