package com.example.hibernate;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/hello-world")
public class HelloResource {

    @Inject
    Validator validator;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //public Response hello(@Valid User u)
    public Response hello(User u) {
        Set<ConstraintViolation<User>> violations = validator.validate(u);
        if(violations.isEmpty()) return Response.ok().entity(u).build();
        else return Response.status(400).entity(Utils.getErrorMap(violations)).build();
    }
}