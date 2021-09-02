package com.oleti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By header =By.id("header-habitat");
     public  HomePage(WebDriver driver)
     {
         this.driver=driver;
     }

     public void verifyHeaderExists()
     {
         driver.findElement(header).isDisplayed();
     }
}
