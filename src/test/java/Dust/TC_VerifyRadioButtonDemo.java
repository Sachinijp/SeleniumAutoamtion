package Dust;

import Pages.Dust.HomePage;
import Pages.Dust.RadioButtonDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyRadioButtonDemo {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachinij\\IdeaProjects\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();

        RadioButtonDemo radio=new RadioButtonDemo(driver);
        HomePage home=new HomePage(driver);


        home.closeStartPopup();
        home.verifyMainMenu();
        home.clickSideMainMenuLink("Input Forms");
        home.clickSideSubMenuLink("Radio Buttons Demo");
        radio.VerifySingleRadioButtonDemo();
        radio.verifySingleRadioButtonFunctionality("Male");
    }
}
