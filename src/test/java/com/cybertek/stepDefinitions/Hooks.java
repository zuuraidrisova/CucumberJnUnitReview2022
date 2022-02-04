package com.cybertek.stepDefinitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupScenario(){

        System.out.println("---------->>>Before Scenario : setting up browser");
    }


    @After
    public void teardownScenario(Scenario scenario){

        System.out.println("---------->>>After Scenario : closing browser");

        System.out.println("scenario.getName() = " + scenario.getName());

        System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());

        System.out.println("scenario.isFailed() = " + scenario.isFailed());

        //#1 we need to take a screen shot using Selenium
        //   getScreenshotAs(): to be able to use this method we have to cast our Driver
        //   to (TakesScreenshot)
        //#2 and attach it to our report

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

        }


    }


}
