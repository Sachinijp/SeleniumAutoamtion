package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Common {

    WebDriver driver;

/*    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachinij\\IdeaProjects\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }*/

    public Common(WebDriver driver)
    {
        this.driver=driver;

    }


    public void closeBrowser()
    {
        driver.quit();
    }
}
