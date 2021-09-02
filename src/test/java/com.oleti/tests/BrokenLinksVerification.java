package com.oleti.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinksVerification {
    WebDriver driver;
    HttpURLConnection huc;
    By url=By.tagName("a");
    String urlValue;

    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//soleti//Downloads//chromedriver_win32 (8)//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
    }
    @Test
    public void getAllWebpageLings()
    {
        List<WebElement> links=driver.findElements(url);
        Iterator<WebElement> it=links.iterator();
        while(it.hasNext())
        {
            urlValue=it.next().getAttribute("href");
          try{
              huc=(HttpURLConnection)new URL(urlValue).openConnection();
              huc.setRequestMethod("HEAD");
             int responseCode= huc.getResponseCode();
              System.out.println(urlValue+ " --->response code -->"+responseCode);
          }catch(Exception e)
          {
                e.printStackTrace();
          }
        }

    }
}
