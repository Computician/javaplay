package io.github.computician.enterprise;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import org.glassfish.jersey.server.filter.UriConnegFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.ws.rs.core.MediaType;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class MainApplication extends Application<MainConfig> {


    @Override
    public void run(MainConfig configuration, Environment environment) throws Exception {
        registerResources(environment);
        enableUrlContentTypes(environment);
        enableCorsFilter(environment);
    }

    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }


    private String resourceScanPath() {
        return this.getClass().getPackage().getName();
    }

    private void registerResources(Environment environment) {
        // resources are setup via Jersey's package scanning feature
        environment.jersey().packages(resourceScanPath());
    }

    private void enableUrlContentTypes(Environment environment) {
        final Map<String, MediaType> mediaTypes = new HashMap<>();
        mediaTypes.put("xml", MediaType.APPLICATION_XML_TYPE);
        mediaTypes.put("json", MediaType.APPLICATION_JSON_TYPE);
        environment.jersey().register(new UriConnegFilter(mediaTypes, null));
    }

    private void enableCorsFilter(Environment environment) {
        final FilterRegistration.Dynamic cors = environment.servlets().addFilter("CORS", CrossOriginFilter.class);
        cors.setInitParameter("allowedOrigins", "*");
        cors.setInitParameter("allowedHeaders", "X-Auth-Token, X-Requested-With, Content-Type, Accept, Origin");
        cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");
        cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
    }

}
