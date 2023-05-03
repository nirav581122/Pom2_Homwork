package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    static String expectedRegisterCompleteMassage = "Registration completed";
    private By _getTextFromElement = By.className("result");

    public void expectedRegisterResultPage() {
        String actualMassage = getTextFromElement(_getTextFromElement);
        System.out.println("My actual Result is:" + actualMassage);
        Assert.assertEquals(actualMassage, expectedRegisterCompleteMassage, "Registration completed");


    }

}
