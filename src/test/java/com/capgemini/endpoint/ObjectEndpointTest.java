/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.endpoint;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author appsawan
 */
public class ObjectEndpointTest {
    
    @Test
    public void get(){
        ObjectEndpoint objE = new ObjectEndpoint();
        String response = objE.get();
        Assert.assertEquals("Object Get!", response);
    }
    
    @Test
    public void add(){
        ObjectEndpoint objE = new ObjectEndpoint();
        String response = objE.add(1,"Capgemini","http://www.capgemini.com","Capgemini India Pvt Ltd");
        Assert.assertEquals("{\"id\":1,\"title\":\"Capgemini\",\"link\":\"http://www.capgemini.com\",\"desc\":\"Capgemini India Pvt Ltd\"}", response);   
    }
}
