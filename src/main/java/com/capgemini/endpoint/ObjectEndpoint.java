/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.endpoint;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/* Root resource (exposed at "myresource" path) */
@Path("object")
public class ObjectEndpoint {
    
    private final List<Object> tmpStore = new ArrayList<>();
    Gson gson = new Gson();
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Object Get!";
    }
    
    @GET
    @Path("/getAll")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAll(){
        String output = "Object GetAll!";
        return output;
    }
    
    @GET
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(int id,String title,String link,String desc) {
        Object obj = new Object(id,title,link,desc);
        tmpStore.add(obj);
        return gson.toJson(obj);
    }
}