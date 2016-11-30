/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author appsawan
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="com.capgemini.features")
public class TestRunner {
    
}
