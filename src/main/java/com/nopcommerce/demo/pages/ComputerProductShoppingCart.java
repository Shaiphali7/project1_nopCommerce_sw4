package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerProductShoppingCart extends Utility {
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By GoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartMessage = By.xpath("//h1[text()='Shopping cart']");
    By updateQuantity = By.xpath("//input[@class='qty-input']");
    By updateCart = By.id("updatecart");
    By totalPrice = By.xpath("(//span[@class='value-summary'])[1]");
    By termsAndServices = By.id("termsofservice");
    By checkOut = By.id("checkout");
    By signMessage = By.xpath("//h1[text()='Welcome, Please Sign In!']");

    public void mouseHoverToCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCart() {
        clickOnElement(GoToCart);
    }

    public String getShoppingCartMessage() {
        return gettextFromElement(shoppingCartMessage);
    }

    public void setUpdateQuantity(String quantity) {
        sendTextToElement(updateQuantity, quantity);
    }

    public void clickUpdateCart() {
        clickOnElement(updateCart);
    }

    public String getTotalPrice() {
        return gettextFromElement(totalPrice);
    }

    public void clickOnTermAndServices() {
        clickOnElement(termsAndServices);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String getSignInMessage() {
        return gettextFromElement(signMessage);
    }
//---------------------------------------------------------------------
    //Click on "CheckOutAsAGuest"

    By checkOutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By nextContinueButton = By.xpath("//button[@class='button-1 new-address-next-step-button']");
    By radioButton = By.id("shippingoption_1");
    By secondContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentButton = By.id("paymentmethod_1");
    By paymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']");


    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    public void setFirstNameText(String option) {
        sendTextToElement(firstName, option);
    }

    public void setLastNameText(String option) {
        sendTextToElement(lastName, option);
    }

    public void setEmailText(String option) {
        sendTextToElement(email, option);
    }

    public void selectCountryDropDown(String option) {
        selectByVisibleTextFromDropDown(country, option);
    }

    public void setCity(String option) {
        sendTextToElement(city, option);
    }

    public void setAddress(String option) {
        sendTextToElement(address, option);
    }

    public void setZipCode(String option) {
        sendTextToElement(zipCode, option);
    }

    public void setPhoneNumber(String option) {
        sendTextToElement(phoneNumber, option);
    }

    public void clickOnNextContinueButton() {
        clickOnElement(nextContinueButton);
    }

    public void clickOnRadioButton() {
        clickOnElement(radioButton);
    }

    public void clickOnContinue2Button() {
        clickOnElement(secondContinue);
    }

    public void clickOnPaymentButton() {
        clickOnElement(paymentButton);
    }

    public void clickOnPaymentMethod() {
        clickOnElement(paymentMethod);
    }

    //_____________________________________________-
    //Credit Card method
    By creditCardType = By.id("CreditCardType");
    By holderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By month = By.id("ExpireMonth");
    By year = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By afterCardbutton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    By verifyCardText = By.xpath("//li[@class='payment-method']/span[@class='value']");
    By verifyDelivery = By.xpath("//li[@class='shipping-method']/span[@class='value']");

    By verifytotal = By.xpath("//span[@class='product-subtotal']");

    By verifyButton = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");


    By verifyText = By.xpath("//div[@class='page-title']/h1");
    By verifyTextSuccess = By.xpath("//div[@class='title']/strong");

    By orderComplete = By.xpath("//button[@class='button-1 order-completed-continue-button']");

    By verifyTextWelcomeToStore = By.xpath("//div[@class='topic-block-title']/h2");

    public void selectFromCreditCard(String option) {
        selectByVisibleTextFromDropDown(creditCardType,option);
    }
    public void sendNameText(String option)
    {
        sendTextToElement(holderName,option);
    }
    public void sendCardNumber(String option)
    {
        sendTextToElement(cardNumber,option);
    }
    public void selectMonth(String option) {
        selectByVisibleTextFromDropDown(month,option);
    }
    public void selectYear(String option) {
        selectByVisibleTextFromDropDown(year,option);
    }
    public void selectcardCode(String option) {
        sendTextToElement(cardCode,option);
    }
    public void clickOnPaymentNextStep()
    {
        clickOnElement(afterCardbutton);
    }
    public String getCardText()
    {
        return gettextFromElement(verifyCardText);
    }
    public String getDeliveryText()
    {
        return gettextFromElement(verifyDelivery);
    }
    public String getTotalPriceAfter()
    {
        return gettextFromElement(verifytotal);
    }
    public void clickOnConfirmButton()
    {
        clickOnElement(verifyButton);
    }
    public String verifyLastPage()
    {
        return gettextFromElement(verifyText);
    }
    public String verifySuccess()
    {
        return gettextFromElement(verifyTextSuccess);
    }

    }
