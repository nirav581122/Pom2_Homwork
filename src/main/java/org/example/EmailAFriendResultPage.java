package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils {
    static String expectedEmailShownOnWebPage = "customers can use email a friend feature";
    static String expectedEmailMassageOnWebPage = " message has been sent.";
    private By _txtFromElement = By.xpath("//li[contains(text(),'Only registered customers can use email a friend f')]");
    private By _actualMassageOnEmailAFriend = By.className("result");

    public void expectedEmailAFriendWithoutRegistration() {
        String actualMassageWillAppearOnPage = getTextFromElement(_txtFromElement);
        System.out.println();
        System.out.println("My Actual email is:" + actualMassageWillAppearOnPage);
        Assert.assertEquals(actualMassageWillAppearOnPage, expectedEmailShownOnWebPage, "Can't Send Email without Registration");
    }

    public void expectedEmailAFriendWithRegistration() {
        //storing data in variable from the webpage
        String actualMassageOnEmailAFriendPage = getTextFromElement(_actualMassageOnEmailAFriend);
        System.out.println("Actual Massage for sending Email a friend:" + actualMassageOnEmailAFriendPage);
        //checking actual massage from web page and expected condition is matching
        Assert.assertEquals(actualMassageOnEmailAFriendPage, expectedEmailMassageOnWebPage, "Email A friend Is Unsuccessful");
    }
}


