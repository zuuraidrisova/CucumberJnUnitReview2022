package com.cybertek.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupScenario(){

        System.out.println("---------->>>Before Scenario : setting up browser");
    }

    @After
    public void teardownScenario(){

        System.out.println("---------->>>After Scenario : closing browser");

    }

}
