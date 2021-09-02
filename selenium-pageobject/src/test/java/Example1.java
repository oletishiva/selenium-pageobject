import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1 {
    WebDriver driver;
    @BeforeClass
    public void initializeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//soleti//Downloads//chromedriver_win32 (8)//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @Test
    public void printMessage()
    {
        System.out.println("***********************");
    }
}
