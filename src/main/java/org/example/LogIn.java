package org.example;

import org.openqa.selenium.By;

public class LogIn extends Utils {
    private By _logInTag = By.className("ico-login");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _logInButton = By.xpath("//button[contains(text(),'Log in')]");

    public void clickOnLogInButton() {
        //click on log In button
        clickOnElement(_logInTag);
        //Enter Email id
        typeText(_email, "abc123@gmail.com");
        //Enter Password
        typeText(_password, "123456");
        //click on Log in Button
        clickOnElement(_logInButton);
    }
}
