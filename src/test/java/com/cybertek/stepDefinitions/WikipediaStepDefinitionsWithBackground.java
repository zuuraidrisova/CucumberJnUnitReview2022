package com.cybertek.stepDefinitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefinitionsWithBackground {

    WikiPage wikiPage = new WikiPage();

    @Given("User is on Wikipedia home page with BackGround Example")
    public void user_is_on_wikipedia_home_page_with_back_ground_example() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User types Steve Jobs in the wiki search box with BackGround Example")
    public void user_types_steve_jobs_in_the_wiki_search_box_with_back_ground_example() {

        wikiPage.searchInput.sendKeys("Steve Jobs");

    }

    @When("User clicks wiki search button with BackGround Example")
    public void user_clicks_wiki_search_button_with_back_ground_example() {

        wikiPage.searchButton.click();

    }

    @Then("User sees Steve Jobs is in the wiki title with BackGround Example")
    public void user_sees_steve_jobs_is_in_the_wiki_title_with_back_ground_example() {

        String actual = Driver.getDriver().getTitle();

        String expectedInTitle = "Steve Jobs";

        Assert.assertTrue(actual.contains(expectedInTitle));

        System.out.println("passed");

        //Driver.closeDriver();

    }


    @Then("User should see Steve Jobs is in the main header with BackGround Example")
    public void user_should_see_steve_jobs_is_in_the_main_header_with_back_ground_example() {

        String actual = wikiPage.mainHeader.getText();

        String expected = "Steve Jobs";

        Assert.assertEquals(actual, expected);

        System.out.println("passed");

       // Driver.closeDriver();

    }


    @Then("User sees Steve Jobs is in the image header with BackGround Example")
    public void user_sees_steve_jobs_is_in_the_image_header_with_back_ground_example() {

        String actual = wikiPage.imageHeader.getText();

        String expected = "Steve Jobs";

        Assert.assertEquals(actual, expected);

        System.out.println("passed");

        Driver.closeDriver();
    }


}
