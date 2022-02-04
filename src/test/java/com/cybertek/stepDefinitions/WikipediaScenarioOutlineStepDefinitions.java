package com.cybertek.stepDefinitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaScenarioOutlineStepDefinitions {


    WikiPage wikiPage = new WikiPage();


    @Given("User is on Wikipedia home search page")
    public void user_is_on_wikipedia_home_search_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    //wikipedia search with scenario outline

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikiPage.searchInput.sendKeys(string);

    }

    @When("User clicks on the  wiki search button")
    public void user_clicks_on_the_wiki_search_button() {

        wikiPage.searchButton.click();
    }


    @Then("User sees {string} is in the wikipedia title")
    public void user_sees_is_in_the_wikipedia_title(String string) {

        String expectedInTitle = string;

        String actual = Driver.getDriver().getTitle();

        Assert.assertTrue(actual.contains(expectedInTitle));

        System.out.println("passed");

    }


    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {

        String expectedInHeader = string;

        String actual = wikiPage.mainHeader.getText();

        System.out.println(actual);

        Assert.assertEquals(actual, expectedInHeader);

        System.out.println("passed");

    }


    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {

        String expectedInImage = string;

        String actual = wikiPage.imageHeader.getText();

        System.out.println("actual = " + actual);

        Assert.assertEquals(actual, expectedInImage);

        System.out.println("passed");

        Driver.closeDriver();

    }

}
