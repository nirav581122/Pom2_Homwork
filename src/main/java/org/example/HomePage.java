package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    private By _clickOnAlertOkButton = By.xpath("//button[contains(@class,'search-box')]");
    private By _selectCurrencyFromHomePage = By.id("customerCurrency");
    private By _nopCommerceNewReleaseTag = By.className("news-title");
    private By _newReleaseTitle = By.xpath("//input[contains(@class,'enter-comment-title')]");
    private By _newReleaseComment = By.cssSelector("#AddNewComment_CommentText");
    private By _newReleaseNewCommentButton = By.name("add-comment");
    private By _productPrizeList = By.cssSelector("div.product-grid span");
    private By _searchForTheProduct = By.cssSelector("input[type='text']");
    private By _clickOnTheSearchButton = By.cssSelector(".button-1.search-box-button");
    private By _searchedProductList = By.cssSelector(".item-grid .product-title");


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

    public void printOutProductName() {
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }

    public void alertMassage() {
        clickOnElement(_clickOnAlertOkButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();

    }

    public void currencyChangeFromHomePage() {
        //select the currency
        selectByCurrency(_selectCurrencyFromHomePage, "Euro");
        //getting list of currency
        List<WebElement> productPrizeList = driver.findElements(_productPrizeList);
        //collecting all the data with help of for loop
        for (WebElement e : productPrizeList) {
            String actualList = (e.getText().replaceAll("[0-9 , .]", ""));
            Assert.assertEquals(actualList, '€');
        }
    }

    public void searchFunctionality() {
        //search for the product
        typeText(_searchForTheProduct, "nike");
        //click on the search button
        clickOnElement(_clickOnTheSearchButton);
        //storing list on list of product
        List<WebElement> listOfProduct = driver.findElements(_searchedProductList);
        //collecting all Web element the data with for loop
        for (WebElement e : listOfProduct) {
            System.out.println(e.getText());
            Assert.assertTrue(e.getText().contains("Nike"));
        }
    }

    public void nopCommerceNewRelease() {
        clickOnElement(_nopCommerceNewReleaseTag);
        typeText(_newReleaseTitle, "Hello");
        typeText(_newReleaseComment, "Test text" + timestamp() + "is there");
        clickOnElement(_newReleaseNewCommentButton);
       // Assert.assertEquals(getTextFromElement(By.cssSelector(".result ")), "News comment is successfully not added.");
    }

    public void multipleWindowHandling() {
        //click on facebook link
        clickOnElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']"));
        //mainwindow object
        String MainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.manage().deleteAllCookies();
                waitForClickable(By.cssSelector("div[aria-label='Allow all cookies'"), 20);
                //   clickOnElement(By.cssSelector("div[aria-label='Allow all cookies'"));
                String strUrl = driver.getCurrentUrl();
                System.out.println(strUrl);
                Assert.assertEquals(strUrl, "https://www.facebook.com/nopCommercee");
                driver.findElement(By.cssSelector("div[aria-label='Close']"));
                driver.findElement(By.name("name=email")).isDisplayed();
                driver.findElement(By.name("pas")).isDisplayed();
                driver.findElement(By.cssSelector("div[aria-label='Accessible login button']")).isDisplayed();
                // Closing the Child Window.
                driver.close();
            }

        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

    public void voteAlertCheck() {
        //click on vote button
        clickOnElement(By.cssSelector(".button-2.vote-poll-button"));
        //alert class for switching to alert pop up
        Alert alert = driver.switchTo().alert();
        //assertion
        Assert.assertEquals(alert.getText(), "Please select no an answer");
        alert.accept();
    }
}

