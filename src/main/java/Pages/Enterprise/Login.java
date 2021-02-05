package Pages.Enterprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    By btnLoginByPass = By.xpath("//button[contains(.,'Dev Login Bypass')]");

    public Login(WebDriver driver1)
    {
        this.driver=driver1;
    }

    public void clickLoginButton()
    {
        driver.findElement(btnLoginByPass).click();
    }


}
