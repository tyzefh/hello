package com.evoyageurs.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;

@Service
@Path("/hello")
public class HelloService {

    @GET
    @Produces("text/plain")
    public String hello(@QueryParam("name") String name) {
        return "Salut les stagiaires";    
    }
}