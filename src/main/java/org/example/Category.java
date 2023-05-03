package org.example;

import org.openqa.selenium.By;

public class Category extends Utils {
    private By _elementBeforeAddingToBasket = By.linkText("Leica T Mirrorless Digital Camera");
    private By _clickOnClearListButton = By.className("clear-list");
    private By _clickOnCameraAndPhoto = By.linkText("Camera & photo");

    public void cameraAndPhotoPage() {
        //Clicking on camera and photo
        clickOnElement(_clickOnCameraAndPhoto);
    }

    public void elementBeforeAddingToBasket() {
        //Clicking on Leica T Mirrorless Digital Camera and storing in actual product variable
        clickOnElement(_elementBeforeAddingToBasket);
    }

    public void clearList() {
        //clicking on clear list button
        clickOnElement(_clickOnClearListButton);
    }
}
