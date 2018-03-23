package io.github.computician.enterprise.resources;

import io.github.computician.enterprise.entities.HelloworldObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class Helloworld {


    @GET
    @Path("/{who}/world")
    public HelloworldObject world(@PathParam("who") String who) {
        return new HelloworldObject("Hello " + who);
    }
}
