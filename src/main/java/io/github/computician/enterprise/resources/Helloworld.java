package io.github.computician.enterprise.resources;

import io.github.computician.enterprise.entities.subdir.subsubdir.HelloworldObjectFactoryGeneratorReallyLongEnterprisyName;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class Helloworld {


    @GET
    @Path("/{who}/world")
    public HelloworldObjectFactoryGeneratorReallyLongEnterprisyName world(@PathParam("who") String who) {
        return new HelloworldObjectFactoryGeneratorReallyLongEnterprisyName("Hello " + who);
    }
}
