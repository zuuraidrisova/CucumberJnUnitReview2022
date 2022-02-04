package com.cybertek.stepDefinitions;

import com.cybertek.pages.GooglePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();


    @Given("User is on the search page")
    public void user_is_on_the_search_page() {

        Driver.getDriver().get("https://www.google.com");

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() throws InterruptedException {

        String actual = Driver.getDriver().getTitle();

        String expected = "Google";

        assertTrue("Actual title does not match with expected title.Fails",actual.equals(expected));

        System.out.println("passed");

        Thread.sleep(2000);

        Driver.closeDriver();
    }


    @When("User types {string} into search box")
    public void user_types_into_search_box(String string) {

        googlePage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

        String actual = Driver.getDriver().getTitle();

        String expected = string;

        assertTrue(actual.contains(expected));

        System.out.println("passed");

        Driver.closeDriver();

    }

    @When("User types apple into search box")
    public void user_types_apple_into_search_box() {

        googlePage.searchBox.sendKeys("apple"+Keys.ENTER);

    }


    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actual = Driver.getDriver().getTitle();

        String expected = "apple";

        assertTrue(actual.contains(expected));

        System.out.println("passed");

        Driver.closeDriver();
    }



    @When("User should see About link")
    public void user_should_see_about_link() {

        Assert.assertTrue(googlePage.aboutLink.isDisplayed());

    }

    @When("User clicks to About link")
    public void user_clicks_to_about_link() {

        googlePage.aboutLink.click();
    }


    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void user_should_see_title_google_about_google_our_culture_company_news() {

        String actual = Driver.getDriver().getTitle();

        String expected = "Google - About Google, Our Culture & Company News";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();
    }

    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> footerLinksList) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

        wait.until(ExpectedConditions.visibilityOfAllElements(googlePage.footerLinks));

        int actual =  googlePage.footerLinks.size();

        int expected = footerLinksList.size();

        Assert.assertEquals(actual,expected);

        for (int i = 0; i < googlePage.footerLinks.size(); i++){

            System.out.println(googlePage.footerLinks.get(i).getText());
        }
        Driver.closeDriver();

    }


}
