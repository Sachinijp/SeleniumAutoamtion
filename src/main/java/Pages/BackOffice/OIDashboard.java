package Pages.BackOffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OIDashboard {

    WebDriver driver;
    private String PropertyName;
    private String PersonOrdering;
    private String UnitName;

    String Property  = "//span[contains(.,'"+PropertyName+"')][1]";
    String PersonOrderingValue="//span[contains(.,'"+PersonOrdering+"')]";
    String UnitNameValue="//span[contains(.,'"+UnitName+"')]";

    WebElement btnCreateOrder = driver.findElement(By.xpath("//button[contains(.,'Onboarding Customer')]/../a"));
    WebElement txtProperty=driver.findElement(By.id("dropdownForm3"));
    WebElement txtPersonOrdering=driver.findElement(By.id("dropdownForm2"));
    WebElement txtPlace=driver.findElement(By.id("BizopsUnit"));
    WebElement eleddProperty=driver.findElement(By.xpath(Property));
    WebElement eleddPersonOrdering=driver.findElement(By.xpath(PersonOrderingValue));
    WebElement eleddUnitName=driver.findElement(By.xpath(UnitNameValue));

    public OIDashboard(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickCreateOrder()
    {
        btnCreateOrder.click();
    }

    public void fillBasics(String PropertyName, String PersonOrdering, String UnitName)
    {
        txtProperty.sendKeys(PropertyName);
        eleddProperty.click();
        txtPersonOrdering.sendKeys(PersonOrdering);
        eleddPersonOrdering.click();
        txtPlace.sendKeys(UnitName);
        eleddUnitName.click();
    }

























}


