package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By ElectronicsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']");
    By cellPhone = By.xpath("(//ul/li/a[text()='Cell phones '])[1]");
    By cellPhoneText = By.xpath("//div[@class='page-title']");


    public void mouseHoverOnElectronics() {
        mouseHoverToElement(ElectronicsMenu);
    }

    public void clickOnCellPhone() {
        clickOnElement(cellPhone);
    }
    public String getCellPhoneText()
    {
        return gettextFromElement(cellPhoneText);
    }
}
