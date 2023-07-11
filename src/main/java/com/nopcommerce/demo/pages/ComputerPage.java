package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']");
    By Desktop = By.xpath("(//ul/li/a[text()='Desktops '])[1]");
    By dropDownAtoZ = By.id("products-orderby");
    By desktopElement = By.xpath("//h2[@class='product-title']/a");

    public void mouseHoverOnComputer() {
        mouseHoverToElement(computerMenu);
    }

    public void clickOnDesktop() {
        clickOnElement(Desktop);
    }

    public void selectFromDropDown(String option) {
        selectByVisibleTextFromDropDown(dropDownAtoZ, option);
    }

    public List<String> desktopName() {
        List<WebElement> jacketsElementsList = driver.findElements(desktopElement);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }

    By addToCartButton = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
    By productName = By.xpath("//div[@class='product-name']");
    By processorDropDown = By.id("product_attribute_1");
    By ramDropDown = By.id("product_attribute_2");
    By hddCheckBox = By.id("product_attribute_3_7");
    By osCheckBox = By.id("product_attribute_4_9");
    By softwareCheckBox = By.id("product_attribute_5_12");
    By addToCartProductButton = By.id("add-to-cart-button-1");
    By getTotalPrice=By.xpath("//span[@id='price-value-1']");
    By successMessage=By.xpath("//p[@class='content']");
    By closeButton=By.xpath("//span[@class='close']");


    public void addToCartButtonAtDesktopPage()
    {
        clickOnElement(addToCartButton);
    }
    public String buildYourComputerString()
    {
        return gettextFromElement(productName);
    }
    public void selectFromprocessorDroDown(String option)
    {
        selectByVisibleTextFromDropDown(processorDropDown,option);
    }
    public void selectFromramDropDown(String option)
    {
        selectByVisibleTextFromDropDown(ramDropDown,option);
    }
    public void clickOnosCheckBox()
    {
        clickOnElement(osCheckBox);
    }
    public void clickOnhddCheckBox()
    {
        clickOnElement(hddCheckBox);
    }
    public void clickOnsoftwareCheckBox()
    {
        clickOnElement(softwareCheckBox);
    }
    public String getTotalPrice()
    {
        return gettextFromElement(getTotalPrice);
    }

    public void clickOnaddToCartProductButton()
    {
        clickOnElement(addToCartProductButton);
    }
    public String getSuccessMessage()
    {
        return gettextFromElement(successMessage);
    }
    public void clickOnCrossButton()
    {
        clickOnElement(closeButton);
    }


}
