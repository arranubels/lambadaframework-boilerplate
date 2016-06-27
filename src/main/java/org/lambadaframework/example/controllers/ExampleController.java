package org.lambadaframework.example.controllers;

import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class ExampleController {
    static final Logger logger = Logger.getLogger(ExampleController.class);

    public static class Input {
        public String value;

        public Input(String value) {
            this.value = value;
        }
    }

    @POST
    @Path("test/test1")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response test1(@FormParam("value") Input input) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(input)
                .build();
    }
}
