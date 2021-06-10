package io.swagger.api.impl;

import io.swagger.api.*;
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
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Salesken Organization APIs
 *
 * <p><b>Introduction</b><br><br>This is collection of Organization APIs. These are used to create organization, fetch organization records, update organization and invoke organization.<br><br> <b>Authentication</b><br><br> Salesken Organization APIs are authenticated using Basic Authentication with your Authentication API Key and OAuth2. The OAuth2 are available after you sign-up with the Salesken.<br><br> <b>Error Codes</b><br><br> Error codes are defined in superadmin project <a href=\"\">Error Codes</a>
 *
 */
public class TeamApiServiceImpl implements TeamApi {
    /**
     * Create Team
     *
     * Use this API to create a new team. Can be called from the Sales Manager Web App.
     *
     */
    public CreateTeam createTeam(Body body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Delete Team
     *
     * Use this API to delete the team. Can be called from the Sales Manager Web App.
     *
     */
    public DeleteTeam deleteTeam(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List all Teams of organization
     *
     * Use this API to get all teams / search teams in an organization. Can be called from the Sales Manager Web App.
     *
     */
    public TeamList listTeam(Integer orgId, String search) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Team by Id
     *
     * Use this API to get a team by Id. Can be called from the Sales Manager Web App.
     *
     */
    public TeamById teamById(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Edit / Update Team Details
     *
     * Use this API to edit / update team details such as addition / deletion of team members, edit team name and description and assign / re-assign team owner. Can be called from the Sales Manager Web App.
     *
     */
    public UpdateTeamDetails updateTeamDetails(Body1 body, Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
}

