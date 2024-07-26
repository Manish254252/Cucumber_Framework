package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[1]/a")
    WebElement adminLink;

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[3]/a")
    WebElement leaveLink;

    @FindBy(xpath = "//div[@class=\"oxd-select-wrapper\"]/div")
    WebElement userRoleMenu;

    @FindBy(xpath = "//div[@class=\"oxd-select-wrapper\"]/div[2]/div[2]")
    WebElement userRoleDiv;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchBtn;

    @FindBys(@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']"))
    List<WebElement> adminUserList;


    public void verifyAdminUserGreaterThanOne() {


        Assert.assertTrue(adminUserList.size() > 1);
    }

    public void clickOnAdminLinkPage() {
        adminLink.click();
    }

    public void selectRole() {
        userRoleMenu.click();
        userRoleDiv.click();
    }

    public void clickOnSearch() {
        searchBtn.click();
    }

    public void clickOnLeaveLink() {
        leaveLink.click();
    }
}
