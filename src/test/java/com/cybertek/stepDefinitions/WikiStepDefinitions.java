package com.cybertek.stepDefinitions;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;


public class WikiStepDefinitions {

    /*
    TC#25: Wikipedia Search Functionality Title Verification
1. User is on Wikipedia home page
2. User types Steve Jobs in the wiki search box
3. User clicks wiki search button
4. User sees Steve Jobs is in the wiki title
Note: Follow POM
*/

    WikiPage wikiPage = new WikiPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() throws InterruptedException {

        wikiPage.searchInput.sendKeys("Steve Jobs");

        Thread.sleep(2000);

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() throws InterruptedException{

        wikiPage.searchButton.click();

        Thread.sleep(2000);
    }


    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() throws InterruptedException {

       String actualTitle =  Driver.getDriver().getTitle();

       String expectedInTitle = "Steve Jobs";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Thread.sleep(2000);

        System.out.println("passed");

        Driver.closeDriver();

    }




    /*
TC#26: Wikipedia Search Functionality Header Verification
1. User is on Wikipedia home page
2. User types Steve Jobs in the wiki search box
3. User clicks wiki search button
4. User sees Steve Jobs is in the main header
Note: Follow POM
*/


    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("User types Steve Jobs in the wiki searchBox")
    public void user_types_steve_jobs_in_the_wiki_searchBox()  throws InterruptedException{

        wikiPage.searchInput.sendKeys("Steve Jobs");

        Thread.sleep(2000);

    }

    @When("User clicks on wiki search button")
    public void user_clicks_on_wiki_search_button()  throws InterruptedException{

        wikiPage.searchButton.click();

        Thread.sleep(2000);
    }

    @Then("User should see Steve Jobs is in the main header")
    public void user_should_see_steve_jobs_is_in_the_main_header() throws InterruptedException {

        String actual = wikiPage.mainHeader.getText();

        String expected = "Steve Jobs";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Thread.sleep(2000);

        Driver.closeDriver();

    }




    /*
TC#27: Wikipedia Search Functionality Image Header Verification
1. User is on Wikipedia home page
2. User types Steve Jobs in the wiki search box
3. User clicks wiki search button
4. User sees Steve Jobs is in the image header
Note: Follow POM
     */


    @Given("User is on Wikipedia home Page")
    public void user_is_on_wikipedia_homePage() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }
    @When("User types Steve Jobs in the wikipedia search box")
    public void user_types_steve_jobs_in_the_wikipedia_search_box() {

        wikiPage.searchInput.sendKeys("Steve Jobs");

    }
    @When("User clicks on wikipedia search button")
    public void user_clicks_on_wikipedia_search_button() {

        wikiPage.searchButton.click();

    }

    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {

        String actual = wikiPage.imageHeader.getText();

        String expected = "Steve Jobs";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();

    }

}
