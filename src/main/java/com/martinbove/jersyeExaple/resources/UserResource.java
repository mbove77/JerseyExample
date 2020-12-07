package com.martinbove.jersyeExaple.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<String> getAllUsers() {
        List<String> users = new ArrayList<String>();
        users.add("Martin");
        users.add("Sergio");
        return users;
    }

}
