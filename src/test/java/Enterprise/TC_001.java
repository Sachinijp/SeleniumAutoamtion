package Enterprise;

import Pages.Enterprise.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachinij\\IdeaProjects\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://enterprise.qa-v2.mrbuilder.io/login");
        driver.manage().window().maximize();

        Login login=new Login(driver);
        login.clickLoginButton();
    }
}
