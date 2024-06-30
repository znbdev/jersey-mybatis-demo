package com.example;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class Main extends ResourceConfig {
    public Main() {
        packages("com.example.resource");
    }
}