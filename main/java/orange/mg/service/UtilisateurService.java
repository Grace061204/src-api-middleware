package orange.mg.service;

import io.smallrye.mutiny.Uni;
import orange.mg.model.RoleUser;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import orange.mg.model.DroitUser;
import orange.mg.model.User;

import java.util.List;

@Path("/manageUser")
public class UtilisateurService {

    @GET
    @Path("/role")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<RoleUser>> getAllRoles() {
        return RoleUser.findAll().list();
    }

    @GET
    @Path("/droit")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<DroitUser>> getAllAccess() {
        return DroitUser.findAll().list();
    }

    @GET
    @Path("/alluser")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<User>> getAllUsersWithRoleAndAccess() {
        return User.findAll().list();
    }

    @GET
    @Path("/allrolewithaccess")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<RoleUser>> getAllRuleWithAccess() {
        return RoleUser.findAll().list();
    }

}
