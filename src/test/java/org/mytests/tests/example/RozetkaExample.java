package org.mytests.tests.example;


import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.composite.WebPage.getUrl;
import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;


public class RozetkaExample {


    @Test
    public void RozeSimpleTest() {


        openUrl("https://rozetka.com.ua/");
        $("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[2]/form/div/div/input").sendKeys("test");
        $("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[2]/form/button").click();

        $("/html/body/app-root/div/div[1]/app-rz-search/div/main/search-result/div[1]/app-search-heading/div/h1").is().displayed().waitSec(5);
        Assert.assertEquals(getUrl(),"https://rozetka.com.ua/search/?text=test");
        $("/html/body/app-root/div/div[1]/app-rz-search/div/main/search-result/div[1]/app-search-heading/div/h1").is().text("«test»");
        $("/html/body/app-root/div/div[1]/app-rz-search/div/main/search-result/div[1]/app-search-heading/div/h1").isExist();
        //Assert.assertEquals($("/html/body/app-root/div/div[1]/app-rz-search/div/main/search-result/div[1]/app-search-heading/div/h1").getText(),"«test»");





        killAllSeleniumDrivers();

    }


}

