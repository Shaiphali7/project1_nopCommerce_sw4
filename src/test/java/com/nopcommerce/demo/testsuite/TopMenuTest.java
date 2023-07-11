package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage menuPage=new TopMenuPage();
    @Test
    public void verifyPageNavigation()
    {
       menuPage.selectMenu("Computers");
       menuPage.selectMenu("Electronics");
    }
}
