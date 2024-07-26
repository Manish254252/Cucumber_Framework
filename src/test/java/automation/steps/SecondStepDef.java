package com.automation.steps;


import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SecondStepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("the user is on the Login Page")
    public void theUserIsOnTheLoginPage() {

        loginPage.openWebsite();
    }

    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
        loginPage.doLogin(ConfigReader.getConfig("username"), ConfigReader.getConfig("password"));
    }

    @When("the user navigates to the Admin page")
    public void theUserNavigatesToThehomePage() {
        homePage.clickOnAdminLinkPage();
    }

    @When("the user selects {string} from the user role dropdown")
    public void theUserSelectsFromTheUserRoleDropdown(String role) {
        System.out.println(role);
        homePage.selectRole();
    }

    @When("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
        homePage.clickOnSearch();
    }

    @Then("the user list should have at least one admin user")
    public void theUserListShouldHaveAtLeastOneAdminUser() {
       homePage.verifyAdminUserGreaterThanOne();
    }
}

