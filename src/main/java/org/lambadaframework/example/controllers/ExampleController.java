package org.lambadaframework.example.controllers;

import org.apache.log4j.Logger;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class ExampleController {


    static final Logger logger = Logger.getLogger(ExampleController.class);

    @GET
    public Response indexEndpoint(
    ) {
        logger.debug("Request got");
        return Response.status(200)
                .entity(new Entity("John doe"))
                .build();
    }

    @GET
    @Path("/{name}")
    public Response exampleEndpoint(
            @PathParam("name") String name
    ) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(new Entity(name))
                .build();
    }

    @GET
    @Path("/{name}/fullname")
    public Response exampleEndpointFullname(
    ) {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        String name = person.fullName();

        logger.debug("Request got");
        return Response.status(201)
                .entity(name)
                .build();
    }

    @GET
    @Path("/resource/{name}")
    public Response exampleSecondEndpoint(
            @PathParam("name") String name
    ) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(new Entity(name))
                .build();
    }

    /**
     * This controller uses automatically serialization of Request body to any POJO
     * @param requestEntity Request Entity
     * @return Response
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/resource")
    public Response exampleSecondEndpointPost(
            NewEntityRequest requestEntity
    ) {

        logger.debug("Request got");
        return Response.status(201)
                .entity(new Entity(requestEntity.name))
                .build();
    }

    static class Entity {
        public int id = 1;
        public String name;

        public Entity(String name) {
            this.name = name;
        }
    }

    public static class NewEntityRequest {
        public String name;
    }

}
