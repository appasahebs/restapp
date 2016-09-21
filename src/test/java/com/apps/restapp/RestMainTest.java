/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.restapp;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author prod
 */
public class RestMainTest {
    /**
     * Test case for insert method for an object.
     *
     * @throws DuckCustomException DuckCustomException
     */
    @Test
    public void testLogic() {
        RestMain rm = new RestMain();
        int out = rm.Logic(10);
        Assert.assertEquals(out, 20);
    }
}
