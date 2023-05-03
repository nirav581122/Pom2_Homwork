package org.example;

import org.openqa.selenium.By;

public class AddToCart extends Utils {
    public void addToCartButton() {
        //Adding product in add to cart
        clickOnElement(By.id("add-to-cart-button-16"));
    }

    public void clickOnShoppingCartButton() {
        //Clicking on Shopping cart
        clickOnElement(By.linkText("Shopping cart"));
    }
}
