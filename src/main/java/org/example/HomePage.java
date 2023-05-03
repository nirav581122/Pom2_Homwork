package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By _clickOnProduct = By.linkText("Apple MacBook Pro 13-inch");
    private By _clickOnElement = By.id("pollanswers-2");
    private By _clickOnVoteButton = By.id("vote-poll-1");
    private By _clickOnElectronics = By.linkText("Electronics");
    private By _clickOnHtcFromHomePage = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _clickOnCloseButton = By.className("close");
    private By _clickOnVirtualGiftCardButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _clickOnProductComparison = By.linkText("product comparison");

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    public void clickOnProduct() {
        //  click on Apple MacBook Pro 13-inc
        clickOnElement(_clickOnProduct);
    }

    public void voteButtonClick() {
        //Click on community pole feedback button
        clickOnElement(_clickOnElement);
        //click on vote button
        clickOnElement(_clickOnVoteButton);
    }

    public void electronicsCategoryPage() {
        //Clicking on Electronics
        clickOnElement(_clickOnElectronics);
    }

    public void productCompare() {
        // clicking on add to compare list for HTC One M8 Android L 5.0 Lollipop on Homepage
        clickOnElement(_clickOnHtcFromHomePage);
        //click on close button
        clickOnElement(_clickOnCloseButton);
        // clicking on add to compare list for $25 Virtual Gift Card on Homepage
        clickOnElement(_clickOnVirtualGiftCardButton);
        //clicking on product comparison page
        clickOnElement(_clickOnProductComparison);
    }
}
