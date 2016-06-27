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
    public Response test1(Input value) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(value)
                .build();
    }

    @POST
    @Path("test/test2")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response test2(String value) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(value)
                .build();
    }

    @POST
    @Path("test/test3")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response test3(@FormParam("value") String value) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(value)
                .build();
    }

    @POST
    @Path("test/test4")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response test4(@QueryParam("value") String value) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(value)
                .build();
    }
}
