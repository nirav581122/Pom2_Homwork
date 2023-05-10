package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;


public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static void selectByDate(By by, String text) {
        Select drpDate = new Select(driver.findElement(by));
        drpDate.selectByVisibleText(text);
    }

    public static void selectByMonth(By by, String value) {
        Select drpMonth = new Select(driver.findElement(by));
        drpMonth.selectByValue(value);
    }

    public static void selectByYear(By by, int index) {
        Select drpYear = new Select(driver.findElement(by));
        drpYear.selectByIndex(index);
    }

    public static void selectByCurrency(By by, String text) {
        Select drpCurrency = new Select(driver.findElement(by));
        drpCurrency.selectByVisibleText(text);
    }

    public static void selectByProcessor(By by, String text) {
        Select drpProcessor = new Select(driver.findElement(by));
        drpProcessor.selectByVisibleText(text);
    }

    public static void selectByRam(By by, String text) {
        Select drpRam = new Select(driver.findElement(by));
        drpRam.selectByValue(text);
    }

    public static void selectByYear(By by, String text) {
        Select drpYear = new Select(driver.findElement(by));
        drpYear.selectByVisibleText(text);
    }

    public static void selectByCreditCard(By by, String text) {
        Select drpCreditCard = new Select(driver.findElement(by));
        drpCreditCard.selectByVisibleText(text);
    }

    public static void selectExpiryMonth(By by, int index) {
        Select drpExpiryMonth = new Select(driver.findElement(by));
        drpExpiryMonth.selectByIndex(index);
    }

    public static void selectExpiryYear(By by, String text) {
        Select drpExpiryYear = new Select(driver.findElement(by));
        drpExpiryYear.selectByVisibleText(text);
    }

    public static void waitForClickable(By by, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisibility(By by, int timeInSec) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


}
