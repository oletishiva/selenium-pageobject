package com.oleti.tests;

import com.oleti.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver;
    HomePage browserStackHome;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//soleti//Downloads//chromedriver_win32 (8)//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.browserstack.com/");

    }
    @Test
    public void verifyHomePageHeaderComponents()
    {
        browserStackHome=new HomePage(driver);
        browserStackHome.verifyHeaderExists();
    }
    @Test(priority = 2)
    public void navigateCommandExample()
    {
        driver.navigate().to("https://www.agoda.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
