package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    AppleProBookProductDetailPage appleProBookProductDetailPage = new AppleProBookProductDetailPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CommunityPoleResultPage communityPoleResultPage = new CommunityPoleResultPage();
    Category category = new Category();
    AddToCart addToCart = new AddToCart();
    AddToCartResultPage addToCartResultPage = new AddToCartResultPage();
    LogIn logIn = new LogIn();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    AddToCompareResultPage addToCompareResultPage = new AddToCompareResultPage();
    BuildYourOwnComputerE2E buildYourOwnComputer = new BuildYourOwnComputerE2E();
     @Test
    public void verifyRegisterShouldRegisterSucessfully() {
        //click on the home page
        homePage.clickOnRegisterButton();
        //fill the register details
        registerPage.registerDetails();
        //Register done Sucessfully
        registerResultPage.expectedRegisterResultPage();
    }

    @Test
    public void verifyEmailAFriendWithoutRegistration() {
        //click on product
        homePage.clickOnProduct();
        //click on product emailAFriendTab
        appleProBookProductDetailPage.productDetailPage();
        //fill the DetailsPage and Send
        emailAFriendPage.productEmailAFriendPage();
    }

    @Test
    public void verifyingAddToCompareList() {
        //add both item product compare Button
        homePage.productCompare();
        //clear list
        category.clearList();
        //Getting text from webpage for assertion
        addToCompareResultPage.addToCompareResultPage();
    }

    @Test
    public void verifyCommunityPole() {
        //Click on feedback and voteButton
        homePage.voteButtonClick();
        //checking vote register or not
        communityPoleResultPage.communityVoteButton();
    }

    @Test
    public void verifyClickProductInBasket() {
        //click on Electronics category
        homePage.electronicsCategoryPage();
        //click on camera and phone
        category.cameraAndPhotoPage();
        //Clicking on Leica T Mirrorless Digital Camera and storing in actual product variable
        category.elementBeforeAddingToBasket();
        //click on Leica T Mirrorless Digital Camera
        addToCart.addToCartButton();
        //click on Shopping cart button
        addToCart.clickOnShoppingCartButton();
        // storing and checking
        addToCartResultPage.storingWebElementBeforeAddingToTheBasket();
    }

    @Test
    public void verifyRegisterUserCanReferAnFriend() {
        //click On register Tag and fill the details
        homePage.clickOnRegisterButton();
        registerPage.registerDetailsWithoutTimestamp();
        // click on log in Tag
        logIn.clickOnLogInButton();
        // click on Apple MacBook Pro 13-inch
        homePage.clickOnProduct();
        //click on email a friend
        appleProBookProductDetailPage.productDetailPage();
        //enter the email details and click on send button
        emailAFriendPage.productEmailAFriendPageWithoutTimeStamp();
        //assertion
        emailAFriendResultPage.expectedEmailAFriendWithRegistration();
    }

    @Test
    public void verifyRegisterUserVoteSuccessfully() {
        //click on register Button
        homePage.clickOnRegisterButton();
        //fill in the register form
        registerPage.registerDetailsWithoutSTimestamp();
        // click on the login button and fill the details
        logIn.clickOnLogInButton();
        //click on good vote option and click on vote button
        homePage.voteButtonClick();
        //assertion
        communityPoleResultPage.communityVoteButtonWithRegistration();
    }
    @Test
    public void checkList(){
        homePage.printOutProductName();
    }
    @Test
    public void verifyAlertHandling(){
        homePage.alertMassage();
    }
    @Test
    public void verifyingCurrencyChangeAccordinglySelection(){
         homePage.currencyChangeFromHomePage();
    }
    @Test
    public void verifySearchFunctionality(){
         homePage.searchFunctionality();
    }
    @Test
    public void verifyNopCommerceNewRelease(){
         homePage.nopCommerceNewRelease();
    }
    @Test
    public void verifyBuildYourOwnProduct(){
         buildYourOwnComputer.buildYourComputer();
    }
    @Test
    public void verifyFacebookPage(){
         homePage.multipleWindowHandling();
    }
    @Test
    public void VerifyAlertMassageWithoutVote(){
         homePage.voteAlertCheck();
    }
}

