package com.automation.steps;

//
import com.automation.pages.HomePage;
import com.automation.pages.LeavePage;
import com.automation.pages.LoginPage;
import com.automation.test.BaseTest;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ThirdStepDef  {
LoginPage loginPage = new LoginPage();
HomePage homePage = new HomePage();
LeavePage leavePage = new LeavePage();


    @When("the user navigates to the Leave page")
    public void theUserNavigatesToTheLeavePage() {
        homePage.clickOnLeaveLink();
    }

    @Then("the Leave page should be loaded")
    public void theLeavePageShouldBeLoaded() {
        leavePage.verifyOnLeavePage();
    }

    @When("the user clicks the apply Link")
    public void theUserClicksTheApplyButton() {
        leavePage.clickOnApplyLink();
    }

    @When("the user selects a leave type")
    public void theUserSelectsALeaveType() {
        leavePage.selectLeaveType();
    }

    @When("the user enters the leave date from {string} to {string}")
    public void theUserEntersTheLeaveDateFromTo(String startDate, String endDate) {
        leavePage.selectDate(startDate,endDate);
    }

    @When("the user selects partial days as {string}")
    public void theUserSelectsPartialDaysAs(String partialDays) {
        leavePage.clickOnPartialDay();
        System.out.println(partialDays);
    }

    @When("the user selects duration as {string}")
    public void theUserSelectsDurationAs(String duration) {
        leavePage.selectDuration();
        System.out.println(duration);
    }

    @When("the user clicks the apply button")
    public void theUserClicksTheApplyButtonAgain() {
        leavePage.clickOnApplyBtn();
    }

    @Then("the success message should be displayed")
    public void theSuccessMessageShouldBeDisplayed() {
//        Assert.assertEquals(leavePage.popUpText(),"Success\n" +
//                "Successfully Saved\n"+"×");
    }

    @When("the user clicks on my leave")
    public void theUserClicksOnMyLeave() {
        leavePage.clickMyLeave();
    }

    @Then("the leave entry from {string} to {string} should be displayed")
    public void theLeaveEntryFromToShouldBeDisplayed(String startDate, String endDate) {
        leavePage.verifyDateFromList();
    }
}

