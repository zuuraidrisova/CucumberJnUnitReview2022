package com.cybertek.stepDefinitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    /*
    TC#50: Create a new feature file and new scenarios
1. Create a new feature file named Login.feature
2. Create 3 new scenarios from the below provided user story.
3. User Story:
As a user, I should be able to login with correct credentials to different accounts.
And dashboard should be displayed.
Accounts are: librarian, student, admin
4. Create a new step definition class under step_definitions package named: LoginStepDefs
Ex: “User is on the login page”
5. Run the code. Get the step definitions from the console
6. No Java-selenium code implementation needed. Just add printing line
in the implementation regarding what should be happening when the code is ran.
     */

    LoginPage loginPage;

    @Given("Librarian is on login page")
    public void librarian_is_on_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("Librarian logs in as librarian using correct credentials")
    public void librarian_logs_in_as_librarian_using_correct_credentials() throws InterruptedException{

        loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("librarian_email");

        String password = ConfigurationReader.getProperty("librarian_password");

        Thread.sleep(1000);

        loginPage.usernameInput.sendKeys(username);

        Thread.sleep(1000);

        loginPage.passwordInput.sendKeys(password);

        Thread.sleep(1000);

        loginPage.signInButton.submit();

    }

    @Then("Librarian should see Dashboard")
    public void librarian_should_see_dashboard() throws InterruptedException{

       String actual =  Driver.getDriver().getTitle();

       String expected = "Dashboard";

        Thread.sleep(1000);

        Assert.assertTrue(actual.equals(expected));

        Thread.sleep(1000);

        Driver.closeDriver();
    }

    @Given("Student is on login page")
    public void student_is_on_login_page() {

    }

    @When("Student logs in as librarian using correct credentials")
    public void student_logs_in_as_librarian_using_correct_credentials() {


    }
    @Then("Student should see Dashboard")
    public void student_should_see_dashboard() {


    }

    @Given("Admin is on login page")
    public void admin_is_on_login_page() {


    }
    @When("Admin logs in as librarian using correct credentials")
    public void admin_logs_in_as_librarian_using_correct_credentials() {


    }
    @Then("Admin should see Dashboard")
    public void admin_should_see_dashboard() {


    }


}
