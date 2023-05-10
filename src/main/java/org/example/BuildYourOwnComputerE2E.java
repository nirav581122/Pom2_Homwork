package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputerE2E extends Utils {
    By _clickOnBuildOnComputer = By.xpath("//a[contains(text(),'Build')]");
    By _selectProcessor = By.name("product_attribute_1");
    By _selectRam = By.name("product_attribute_2");
    By _clickOnHDD = By.id("product_attribute_3_6");
    By _clickOnOS = By.id("product_attribute_4_8");
    By _checkBox_1 = By.id("product_attribute_5_10");
    By _checkBox_2 = By.id("product_attribute_5_11");
    By _checkBox_3 = By.id("product_attribute_5_12");
    By _clickOnTermsAndCondition = By.id("termsofservice");
    By _clickOnCheckOutButton = By.id("checkout");
    By _clickOnGuestButton = By.cssSelector(".button-1.checkout-as-guest-button");
    By _firstName = By.cssSelector("#BillingNewAddress_FirstName");
    By _lastName = By.cssSelector("#BillingNewAddress_LastName");
    By _email = By.name("BillingNewAddress.Email");
    By _country = By.id("BillingNewAddress_CountryId");
    By _cityName = By.id("BillingNewAddress_City");
    By _address1 = By.id("BillingNewAddress_Address1");
    By _getMessage = By.cssSelector("div.order-completed div.title strong");
    By _orderNumber = By.cssSelector("div.order-completed div.order-number strong");
    By _continueButton = By.cssSelector("div.buttons button");


    public void buildYourComputer() {
        //click on build your computer
        clickOnElement(_clickOnBuildOnComputer);
        //select processor
        selectByProcessor(_selectProcessor, "2.2 GHz Intel Pentium Dual-Core E2200");
        //select ram
        selectByRam(_selectRam, "5");
        //click on hdd
        clickOnElement(_clickOnHDD);
        //click on os
        clickOnElement(_clickOnOS);
        //select all software checkbox
        //  clickOnElement(By.id("product_attribute_5_10"));
        waitForClickable(_checkBox_1, 20);
        waitForClickable(_checkBox_2, 20);
        waitForClickable(_checkBox_3, 20);
        //click on add to cart button
        clickOnElement(By.cssSelector("button.add-to-cart-button"));
        //Enter shopping cart button
        clickOnElement(By.xpath("//a[contains(text() ,'shopping')]"));
        // assertion .attributes
        //Click on terms of service
        clickOnElement(_clickOnTermsAndCondition);
        //click on checkout button
        clickOnElement(_clickOnCheckOutButton);
        //click on guest button
        clickOnElement(_clickOnGuestButton);
        //Enter FirstName
        typeText(_firstName, "Test");
        //Enter Lastname
        typeText(_lastName, "LastName");
        //Enter Email
        typeText(_email, "abc" + timestamp() + "@gmail.com");
        //Select country
        selectByYear(_country, "United Kingdom");
        //Enter City name
        typeText(_cityName, "scotland");
        //Enter address1
        typeText(_address1, "235,kings lane");
        //Enter Zipcode
        typeText(By.id("BillingNewAddress_ZipPostalCode"), "123456");
        //Enter PhoneNumber
        typeText(By.cssSelector("#BillingNewAddress_PhoneNumber"), "123456");
        //click on continue
        clickOnElement(By.xpath("//div[@id='billing-buttons-container']/button[4]"));
        // clickOnElement(By.cssSelector("button[onclick='Billing.save()']"));
        //click on next day option
        //By _nextDayAir = By.xpath("//input[@id='shippingoption_1']");
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        //click on continue button
        clickOnElement(By.cssSelector(".button-1.shipping-method-next-step-button"));
        //click on credit card button
        clickOnElement(By.cssSelector("#paymentmethod_1"));
        //click on continue button
        clickOnElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        //select credit card
        //VISA, Michael Allen, 4574171627375808, 08/27, CVC: 213
        selectByCreditCard(By.cssSelector(".dropdownlists"), "Visa");
        //cardholder name
        typeText(By.cssSelector("#CardholderName"), "abc Patel");
        //card number
        typeText(By.cssSelector("#CardNumber"), "4024007140202440");
        //select month
        selectExpiryMonth(By.xpath("//select[@id='ExpireMonth']"), 9);
        //select year
        selectExpiryYear(By.xpath("//select[@id='ExpireYear']"), "2025");
        //select cvc number
        typeText(By.xpath("//input[@id='CardCode']"), "213");
        //click on continue
        clickOnElement(By.xpath("//button[@onclick='PaymentInfo.save()']"));
        //click on confirmButton
        clickOnElement(By.xpath("//button[@onclick='ConfirmOrder.save()']"));
        //assertion
        String expectedConfirmOrderMessage = "Your order has been successfully processed!";
        String actualMessage = getTextFromElement(_getMessage);
        System.out.println("Result Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedConfirmOrderMessage, "Your order has been not processed");
        String actualMessage1 = getTextFromElement(_orderNumber);
        System.out.println("Confirm:" + actualMessage1);
        clickOnElement(_continueButton);

    }

}
