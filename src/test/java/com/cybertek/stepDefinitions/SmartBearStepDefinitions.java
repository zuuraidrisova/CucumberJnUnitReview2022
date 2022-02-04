package com.cybertek.stepDefinitions;

import com.cybertek.pages.SmartPages;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartBearStepDefinitions {

    SmartPages smartPages = new SmartPages();

    @Given("User logs into SmartBear Tester account")
    public void user_logs_into_smart_bear_tester_account() {

        Driver.getDriver().get(ConfigurationReader.getProperty("smartBear_url"));

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String username = ConfigurationReader.getProperty("smartBear_username");
        String password = ConfigurationReader.getProperty("smartBear_password");

        smartPages.usernameInput.sendKeys(username);

        smartPages.passwordInput.sendKeys(password);

        smartPages.loginButton.click();


     }

    @Given("User clicks on Order page")
    public void user_clicks_on_order_page() {

        smartPages.orderLink.click();

    }

    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_from_product_dropdown() {

        Select select = new Select(smartPages.productDropdown);

        select.selectByVisibleText("FamilyAlbum");

    }

    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer quantity) {

        smartPages.quantity.sendKeys(quantity+"");

    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {

        smartPages.customerName.sendKeys(name);


    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {

        smartPages.street.sendKeys(street);

    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {

        smartPages.city.sendKeys(city);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {

        smartPages.state.sendKeys(state);
    }

    @When("User enters {int} to zip")
    public void user_enters_to_zip(Integer zip) {

        smartPages.zip.sendKeys(String.valueOf(zip));
    }

    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {

        smartPages.visaType.click();

    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {

        smartPages.cardNumber.sendKeys(cardNumber);

    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {

        smartPages.expireDate.sendKeys(expDate);

    }

    @When("User clicks process button")
    public void user_clicks_process_button() {

        smartPages.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expected) {

        Assert.assertTrue(smartPages.successMessage.isDisplayed());

        smartPages.viewAllOrders.click();

        String actual = smartPages.johnWick.getText();

        System.out.println("actual = " + actual);

        Assert.assertTrue(actual.equals(expected));

        System.out.println("passed");

        Driver.closeDriver();
    }

}
