package BackOffice;



import Pages.BackOffice.LoginPage;
import Pages.BackOffice.OIDashboard;
import Pages.Common.GetOTP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {


    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachinij\\IdeaProjects\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://backoffice.qa-v2.mrbuilder.io/");
        driver.manage().window().maximize();

        LoginPage login=new LoginPage(driver);

        GetOTP getOTP=new GetOTP();

        login.login("US","4257807476");
        getOTP.GetOTPCode();


        /*
        OIDashboard oidashboard=new OIDashboard(driver);
        oidashboard.clickCreateOrder();
        oidashboard.fillBasics("Sachini Property","Sachini Ent user","U002, BULD_001");
        */



    }


}
