import Pages.CheckBoxDemoPage;
import Pages.Common;
import Pages.HomePage;
import Pages.SimpleFormDemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyCheckBoxDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachinij\\IdeaProjects\\SeleniumAutomation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();

        HomePage home=new HomePage(driver);
        Common common=new Common(driver);
        CheckBoxDemoPage checkboxdemopage = new CheckBoxDemoPage(driver);

        home.closeStartPopup();
        home.verifyMainMenu();
        home.clickSideMainMenuLink("Input Forms");
        home.clickSideSubMenuLink("Checkbox Demo");
        checkboxdemopage.VerifySingleCheckBoxPage();
        checkboxdemopage.verifySingleCheckBox();
        checkboxdemopage.verifyCheckAll();
        checkboxdemopage.verifyUnCheckAll();
        common.closeBrowser();




    }
}
