package com.cybertek.stepDefinitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Et;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsyPage etsyPage = new EtsyPage();

    /*
    TC#51: Etsy Title Verification
User is on https://www.etsy.com
User sees title is as expected.
Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
Note: Follow POM
*/

    @Given("User is on the etsy page")
    public void user_is_on_the_etsy_page() {

        Driver.getDriver().get("https://www.etsy.com");

    }

    @Then("User should see title as expected")
    public void user_should_see_title_as_expected() {

        String actual = Driver.getDriver().getTitle();

        String expected = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();

    }


    /*
TC#52: Etsy Search Functionality Title Verification (without parameterization)
User is on https://www.etsy.com
User types Wooden Spoon in the search box
User clicks search button
User sees Wooden Spoon is in the title
Note: Follow POM
*/

    @When("User types wooden spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsyPage.searchInput.sendKeys("Wooden spoon");

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {

        etsyPage.searchButton.click();

    }

    @Then("User sees wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        String actual = Driver.getDriver().getTitle();

        String expectedInTitle = "Wooden spoon";

        Assert.assertTrue(actual.contains(expectedInTitle));

        Driver.closeDriver();

    }


    /*
TC#53: Etsy Search Functionality Title Verification (with parameterization)
User is on https://www.etsy.com
User types Wooden Spoon in the search box
User clicks search button
User sees Wooden Spoon is in the title
Note: Follow POM
     */

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchValue) {

        etsyPage.searchInput.sendKeys(searchValue);

        //etsyPage.searchButton.click();

    }


    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String searchValue) {

        String actual = Driver.getDriver().getTitle();

        String expectedInTitle = searchValue;

        Assert.assertTrue(actual.contains(expectedInTitle));

        Driver.closeDriver();

    }



}
