package com.example.app;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("users")
@Produces(APPLICATION_JSON)
public class UserResource {

    @Inject
    private UserRepository userRepository;

    @GET
    @Path("{email}")
    @Transactional
    public User findByEmail(@PathParam("email") String email) {
        return userRepository.findByEmail(email);
    }
}
