package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {

    private By _friendEmail = By.className("friend-email");
    private By _yourEmail = By.className("your-email");
    private By _personalMassage = By.id("PersonalMessage");
    private By _sendButton = By.name("send-email");

    public void productEmailAFriendPage() {

        //enter friend email
        typeText(_friendEmail, "asd@" + timestamp() + "gmail.com");
        //enter your email
        typeText(_yourEmail, "pdf@" + timestamp() + "gmail.com");
        //enter your personal massage
        typeText(_personalMassage, "please check this mail");
        //click on send button
        clickOnElement(_sendButton);
      //  String actualMassageWillAppearOnPage = getTextFromElement(By.xpath("//li[contains(text(),'Only registered customers can use email a friend f')]"));
        System.out.println();
    }

    public void productEmailAFriendPageWithoutTimeStamp() {
        //enter friend email
        typeText(_friendEmail, "asd@gmail.com");
        //enter your personal massage
        typeText(_personalMassage, "please check this mail");
        //click on send button
        clickOnElement(_sendButton);

    }
}
