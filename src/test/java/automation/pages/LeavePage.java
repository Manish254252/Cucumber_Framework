package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

public class LeavePage extends BasePage {
    @FindBy(xpath = "//h5")
    WebElement leaveListTitle;

    @FindBy(xpath = "(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")
    WebElement applyLink;

    @FindBy(xpath = "//div[@class=\"oxd-select-text oxd-select-text--active\"]")
    WebElement leaveType;

    @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]")
    WebElement FMLAType;

    @FindBy(xpath = "(//input[contains(@class, 'oxd-input')])[2]")
    WebElement fromDate;

    @FindBy(xpath = "(//input[contains(@class, 'oxd-input')])[3]")
    WebElement toDate;
    @FindBy(xpath = "//div[@class=\"oxd-calendar-date\" and text()='8']")
    WebElement toDateSelect;

    @FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[2]")
    WebElement partialDayMenuBtn;

    @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]")
    WebElement allDaysSelectBtn;

    @FindBy(xpath = "(//div[@class=\"oxd-select-text oxd-select-text--active\" ])[3]")
    WebElement durationMenu;

    @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]")
    WebElement durationSelection;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    WebElement applyBtn;

    @FindBy(xpath = "//div[contains(@class,'oxd-toast-container oxd-toast-container')]/div")
    WebElement popup;

    @FindBy(xpath = "//a[contains(@class,oxd-topbar-body-nav-tab-item) and text()=\"My Leave\"]")
    WebElement linkToMyLeave;

    @FindBys(@FindBy(xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])/div[2]"))
    List<WebElement> dateList;


    public void verifyOnLeavePage() {
        System.out.println(leaveListTitle.getText());
        Assert.assertEquals(leaveListTitle.getText(), "Leave List");
    }

    public void clickOnApplyLink() {
        applyLink.click();
        actions.pause(2000).build().perform();
    }

    public void selectLeaveType() {
        leaveType.click();
        FMLAType.click();
        actions.pause(2000).build().perform();
    }

    public void selectDate(String s1, String s2) {

        System.out.println(s1 + "  " + s2);
        fromDate.click();
        fromDate.sendKeys(s1);
        fromDate.click();

        toDate.click();

        actions.pause(4000).build().perform();
        toDateSelect.click();


    }

    public void clickOnPartialDay() {
        partialDayMenuBtn.click();
        allDaysSelectBtn.click();
    }

    public void selectDuration() {
        durationMenu.click();
        durationSelection.click();
    }

    public void clickOnApplyBtn() {
        applyBtn.click();
    }

    public String popUpText()
    {
        return popup.getText();
    }

    public void clickMyLeave() {
        linkToMyLeave.click();
    }

    public void verifyDateFromList() {
        System.out.println(dateList.size());
        String date = "";
        for (WebElement x : dateList) {
            System.out.println(x.getText());
            if (x.getText().equalsIgnoreCase("2024-03-09 to 2024-08-09")) {
                date = x.getText();
                System.out.println(date);
            }

        }

//        Assert.assertEquals(date,"2024-03-09 to 2024-08-09" );
        System.out.println(date);
    }
}
