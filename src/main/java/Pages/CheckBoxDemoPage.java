package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxDemoPage {

    WebDriver driver;

    String lblSingleCheckBoxDemo ="//p[contains(.,'Clicking on')]/../../div[contains(.,'Single Checkbox Demo')]";
    String chkAge="//input[@id='isAgeSelected']";
    String lblSingleCheckBoxResult="//div[@id='txtAge']";
    String btnCheckAll="//input[@id='check1']";


  public CheckBoxDemoPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void VerifySingleCheckBoxPage()
    {
        String labeltext =driver.findElement(By.xpath(lblSingleCheckBoxDemo)).getText();
        if(labeltext.equals("Single Checkbox Demo"))
        {
            System.out.println("You have navigated to the correct page - Single Checkbox Demo");
        }
        else
        {
            System.out.println("You are on wrong page");
        }
    }

    public void verifySingleCheckBox()
    {
        driver.findElement(By.xpath(chkAge)).click();
        if(driver.findElement(By.xpath(chkAge)).isSelected())
        {
            System.out.println("Age checkbox checked");
        }
        else
        {
            System.out.println("Age checkbox not checked");
        }
    }

    public void verifyCheckAll()
    {
        driver.findElement(By.xpath(btnCheckAll)).click();
        if(driver.findElement(By.xpath(btnCheckAll)).getText().equals("Uncheck All"))
        {
            System.out.println("All check boxes are selected");
        }
        else
        {
            System.out.println("All check boxes are not selected");
        }
    }

    public void verifyUnCheckAll()
    {
        driver.findElement(By.xpath(btnCheckAll)).click();
        if(driver.findElement(By.xpath(btnCheckAll)).getText().equals("Check All"))
        {
            System.out.println("All check boxes are unchecked");
        }
        else
        {
            System.out.println("All check boxes are not unchecked");
        }
    }


}
