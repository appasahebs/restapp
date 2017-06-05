/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjapps.endpoint;

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
        String response = objE.add(1,"AnjApps","http://www.anjapps.com","AnjApps India Pvt Ltd");
        Assert.assertEquals("{\"id\":1,\"title\":\"AnjApps\",\"link\":\"http://www.anjapps.com\",\"desc\":\"AnjApps India Pvt Ltd\"}", response);
    }
}
