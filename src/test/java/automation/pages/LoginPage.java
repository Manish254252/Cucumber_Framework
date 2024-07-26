package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(name = "username")
    WebElement user;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;




    public void openWebsite()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void doLogin(String username ,String password1)
    {
            user.sendKeys(username);
            password.sendKeys(password1);
            loginBtn.click();
    }
}
