package Pages.BackOffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;
    By txtCountry = By.id("undefined-location");
    By txtCountryCode=By.id("1-search");
    By  listCountryCode=By.xpath("//li[contains(.,'+1 US United States')]");
    By txtPhoneNumber=By.name("phoneNumber");
    By btnSubmit=By.xpath("//span[contains(.,'Submit')]");

    public  LoginPage(WebDriver mydriver)
    {
        this.driver=mydriver;

    }

    public void login(String CountryCode, String phoneNumber)
    {
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(txtCountry).click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement (txtCountryCode).sendKeys(CountryCode);
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement(listCountryCode).click();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement(txtPhoneNumber).sendKeys(phoneNumber);
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement(btnSubmit).click();
        System.out.println("Executed");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

















}
