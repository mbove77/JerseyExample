package com.martinbove.jersyeExaple;

import com.martinbove.jersyeExaple.resources.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyAppConfig extends ResourceConfig {

    public JerseyAppConfig() {
        register(UserResource.class);
    }

}
