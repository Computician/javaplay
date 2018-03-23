package io.github.computician.enterprise.resources;

import io.github.computician.enterprise.HelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class Helloworld {


    @GET
    @Path("/{who}/world")
    public HelloWorld world(@PathParam("who") String who) {
        return new HelloWorld("Hello " + who);
    }
}
