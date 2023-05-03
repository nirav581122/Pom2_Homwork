package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartResultPage extends Utils {
    static String expectedItemAddToBasket = "Leica T Mirrorless  new Digital Camera";

    public void storingWebElementBeforeAddingToTheBasket() {
        String actualProductInBasket = getTextFromElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[3]"));
        System.out.println("product In Basket:" + actualProductInBasket);
        //Checking Actual product And add to basket product name is Same or not
        Assert.assertEquals(actualProductInBasket, expectedItemAddToBasket, "Before adding to basket and After adding to the basket Both product is same");

    }
}
