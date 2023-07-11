package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsCellPhonePage extends Utility {
    By listView = By.xpath("//a[@class='viewmode-icon list']");
    By nokiaLuma = By.xpath("//h2[@class='product-title']/a[text()='Nokia Lumia 1020']");
    By textNokiaLuma = By.xpath("//div[@class='product-name']/h1[text()='Nokia Lumia 1020']");
    By price = By.xpath("//span[@id='price-value-20']");
    By chnageQuantity = By.id("product_enteredQuantity_20");
    By clickOnUpdate = By.id("add-to-cart-button-20");
    By successMessage = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[@class='button-1 cart-button']");
    By termsAndServices = By.id("termsofservice");
    By checkOut = By.id("checkout");
    By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
     By register=By.xpath("//button[@class='button-1 register-button']");
     public void clickOnListView()
     {
         clickOnElement(listView);
     }
    public void clickOnNokiaLuma()
    {
        clickOnElement(nokiaLuma);
    }
    public String verifyNokiaText()
    {
        return gettextFromElement(textNokiaLuma);
    }
    public String verifyTotalPrice()
    {
        return gettextFromElement(price);
    }
    public void changeTheQuantity(String option)
    {
        sendTextToElement(chnageQuantity,option);
    }
    public void clickOnUpdate()
    {
        clickOnElement(clickOnUpdate);
    }
    public String getSuccessMessage()
    {
        return gettextFromElement(successMessage);
    }
    public void clickOnCloseButton()
    {
        clickOnElement(closeButton);
    }
    public void mouseHoverToShoppingCart()
    {
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart()
    {
        clickOnElement(goToCart);
    }
    public void clickOnCheckout()
    {
        clickOnElement(checkOut);
    }
    public void clickOnCheckBox()
    {
        clickOnElement(termsAndServices);
    }
    public String getWelcomeText()
    {
        return gettextFromElement(welcomeText);
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(register);
    }
}
