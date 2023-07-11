package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By menuElement=By.xpath("//ul[@class='top-menu notmobile']");

//    public void selectMenu(String menu) {
//        List<WebElement> topMenuList = getListOfElements(menuElement);
//
//            for (WebElement element : topMenuList) {
//                if (element.getText().equalsIgnoreCase(menu)) {
//                    element.click();
//                }
//            }

    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='"+menu+" ']"));
    }

}



