package Pages.Dust;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonDemo {

    WebDriver driver;
 //   String Gender;

    By RadioButtonDemoLabel= By.xpath("//div[text()='Radio Button Demo']");
 //  By GenderRadioButton=By.xpath("//label[contains(.,'"+Gender+"')]");
    By btnSubmit=By.xpath("//button[contains(.,'Get Checked value')]");

    public RadioButtonDemo(WebDriver myDriver)
    {
        this.driver=myDriver;
    }


    public void VerifySingleRadioButtonDemo()
    {
        if(driver.findElement(RadioButtonDemoLabel).isDisplayed())
        {
            System.out.println("Label Displayed");

        }
        else
        {
            System.out.println("Label not displayed");
        }
    }

    public void verifySingleRadioButtonFunctionality(String Gender)
    {
        driver.findElement(By.xpath("//label[contains(.,'"+Gender+"')]")).click();
        driver.findElement(btnSubmit).click();
    }


}
