package org.acme.quickstart;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus DEVOPSDAYS Sibiu";
    }

    @Path("sibiu")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sibiu() {
        return "Greetings from Quarkus DEVOPSDAYS Sibiu";
    }
}
