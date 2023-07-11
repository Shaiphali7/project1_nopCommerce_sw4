package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText=By.xpath("//h1[text()='Register']");
    By firstName=By.id("FirstName");
    By lastName=By.id("LastName");
    By email=By.id("Email");
    By companyName=By.id("Company");
    By password=By.id("Password");
    By confirmPassword=By.id("ConfirmPassword");
    By registerButton=By.id("register-button");
    By verifyRegistrationComplete=By.xpath("//div[@class='result']");
    By continue1=By.xpath("//a[text()='Continue']");
    public String getRegisterText()
    {
        return gettextFromElement(registerText);
    }
    public void setFirstName(String option)
    {
        sendTextToElement(firstName,option);
    }
    public void setLastName(String option)
    {
        sendTextToElement(lastName,option);
    }
    public void setEmail(String option)
    {
        sendTextToElement(email,option);
    }
    public void setCompanyName(String option)
    {
        sendTextToElement(companyName,option);
    }
    public void setPassword(String option)
    {
        sendTextToElement(password,option);
    }
    public void setConfirmPassword(String option)
    {
        sendTextToElement(confirmPassword,option);
    }
    public String getConfirmationText()
    {
        return gettextFromElement(verifyRegistrationComplete);
    }
    public void clickOnRegistrationButton()
    {
        clickOnElement(registerButton);
    }
    public void clickOnContinue()
    {
        clickOnElement(continue1);
    }


}
