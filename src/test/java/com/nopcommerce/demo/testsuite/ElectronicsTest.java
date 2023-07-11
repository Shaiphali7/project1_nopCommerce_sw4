package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsCellPhonePage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ElectronicsCellPhonePage product = new ElectronicsCellPhonePage();
      RegisterPage registerPage=new RegisterPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

//        1.1 Mouse Hover on “Electronics”Tab
        electronicsPage.mouseHoverOnElectronics();
//        1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.clickOnCellPhone();
//        1.3 Verify the text “Cell phones”
        String cellPhoneText = electronicsPage.getCellPhoneText();
        Assert.assertEquals(cellPhoneText, "Cell phones", "Not a right product");

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //        1.1 Mouse Hover on “Electronics”Tab
        electronicsPage.mouseHoverOnElectronics();
        //        1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.clickOnCellPhone();
        //        1.3 Verify the text “Cell phones”
        String cellPhoneText = electronicsPage.getCellPhoneText();
        Assert.assertEquals(cellPhoneText, "Cell phones", "Not a right product");
        Thread.sleep(1000);
        product.clickOnListView();
        Thread.sleep(1000);
        //click on product name Nokia Lumia 1020
        product.clickOnNokiaLuma();
        String nokiaLumaText = product.verifyNokiaText();
        //verify the text Nokia Lumia 1020
        Assert.assertEquals(nokiaLumaText, "Nokia Lumia 1020", "Verify the text");
        //verify the price
        String actualPrice = product.verifyTotalPrice();
        Assert.assertEquals(actualPrice,"$349.00");
        //change the qty to 2
        product.changeTheQuantity("2");
        Thread.sleep(1000);
        product.clickOnUpdate();
        //Verify the Message "The product has been added to your shopping cart" on Top
        String actualShoppingCartMessage=product.getSuccessMessage();
        Assert.assertEquals(actualShoppingCartMessage,"The product has been added to your shopping cart");
        //close button
        product.clickOnCloseButton();
        Thread.sleep(1000);
        //mousehover on shopping cart and click on goto cart
        product.mouseHoverToShoppingCart();
        product.clickOnGoToCart();
        //click on checkbox
        product.clickOnCheckBox();
        //Click on “CHECKOUT
        product.clickOnCheckout();
        Thread.sleep(1000);
        String actualWelcomeMessage=product.getWelcomeText();
        Assert.assertEquals(actualWelcomeMessage,"Welcome, Please Sign In!");
        //Click on “REGISTER” tab
        product.clickOnRegisterButton();
        //Verify the text “Register”
        String actualRegisterMessage=registerPage.getRegisterText();
        Assert.assertEquals(actualRegisterMessage,"Register","Verify the message");
        //Verify the message “Your registration completed”
        registerPage.setFirstName("Sonia");
        registerPage.setLastName("Gupta");
        registerPage.setEmail("Abcd12@gmail.com");
        registerPage.setCompanyName("Prime");
        registerPage.setPassword("Abcd123$");
        registerPage.setConfirmPassword("Abcd123$");
        //Click on submit button
        registerPage.clickOnRegistrationButton();
        String confirmationText=registerPage.getConfirmationText();
        Assert.assertEquals(confirmationText,"Your registration completed","Didn't get confirmation");
        registerPage.clickOnContinue();

    }
}
