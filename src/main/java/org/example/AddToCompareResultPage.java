package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCompareResultPage extends Utils {
    static String expectedClearListMassageOnWebPage = "You have no items to compare.";

    public void addToCompareResultPage() {
        String actualTextFromElement = getTextFromElement(By.className("no-data"));
        System.out.println("Email massage display:" + actualTextFromElement);
        Assert.assertEquals(actualTextFromElement, expectedClearListMassageOnWebPage, "Email Can't send Without Registration");
    }
}
