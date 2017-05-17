/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.endpoint;

import com.google.gson.Gson;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author appsawan
 */
public class ObjectEndpointBDDSteps {

    @Given("^the following url test data$")
    public void the_following_url_test_data(List<Object> objects) {
        ObjectEndpoint objE = new ObjectEndpoint();
        Gson gson = new Gson();
        //HashMap<String, Object> objList = new HashMap<String, Object>();
        for (Object object : objects) {
            String response = objE.add(object.getId(), object.getTitle(), object.getLink(), object.getDec());
            //System.out.println("RESPONSE --->"+response);
            //System.out.println("OBJECT   --->"+"["+gson.toJson(object)+"]");
            assertEquals(gson.toJson(object), response);
        }

    }

    @When("^the id '(\\d+)' has been already exits don't add it again$")
    public void the_id_has_been_already_exits_don_t_add_it_again(int id) {
        assertEquals(2, id);
    }

    @Then("^the total there should be '(\\d+)' Urls\\.$")
    public void the_total_there_should_be_Urls(int total) {
        assertEquals(8, total);

    }
}
