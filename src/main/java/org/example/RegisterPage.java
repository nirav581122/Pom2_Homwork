package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    private By _firstName = (By.id("FirstName"));
    private By _lastName = (By.id("LastName"));
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = (By.id("ConfirmPassword"));
    private By _clickOnRegisterButton = (By.id("register-button"));
    private By _selectBirthDate =(By.name("DateOfBirthDay"));
    private By _selectBirthMonth =(By.name("DateOfBirthMonth"));
    private By _selectBirthYear =(By.name("DateOfBirthYear"));

    public void registerDetails() {
        //Enter First name
        typeText(_firstName, "test");
        //Enter SecondName
        typeText(_lastName, "rem");
        //Select day from drop down
        selectByDate(_selectBirthDate,"8");
        //Select moth from drop down
        selectByMonth(_selectBirthMonth,"12");
        //Select year from drop down
        selectByYear(_selectBirthYear,(100));
        //Enter Email id
        typeText(_email, "abc@" + timestamp() + "gmail.com");
        //enter Password
        typeText(_password, "123456");
        //Confirm password
        typeText(_confirmPassword, "123456");
        //Click on Register submit button
        clickOnElement(_clickOnRegisterButton);
    }

    public void registerDetailsWithoutTimestamp() {
        //Enter First name
        typeText(_firstName, "test");
        //Enter SecondName
        typeText(_lastName, "rem");
        //Enter Email id
        typeText(_email, "abc123@gmail.com");
        //enter Password
        typeText(_password, "123456");
        //Confirm password
        typeText(_confirmPassword, "123456");
        //Click on Register submit button
        clickOnElement(_clickOnRegisterButton);
    }

    public void registerDetailsWithoutSTimestamp() {
        //Enter First name
        typeText(_firstName, "test");
        //Enter SecondName
        typeText(_lastName, "rem");
        //Enter Email id
        typeText(_email, "abc111@gmail.com");
        //enter Password
        typeText(_password, "123456");
        //Confirm password
        typeText(_confirmPassword, "123456");
        //Click on Register submit button
        clickOnElement(_clickOnRegisterButton);

    }
}
