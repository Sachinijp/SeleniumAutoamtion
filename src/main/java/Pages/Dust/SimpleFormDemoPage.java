package Pages.Dust;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SimpleFormDemoPage {

    WebDriver driver;
    String singleInputFieldLabel="//p[contains(.,' First Let us try be')]/../../div[contains(.,'Single Input Field')]";
    String txtEnterMessage ="//form[@id='get-input']/div/input[@id='user-message']";
    String btnShowMessage="//button[contains(.,'Show Message')]";
    String lblEnteredMessage ="//span[@id='display']";
    String txtSum1="//input[@id='sum1']";
    String txtSum2="//input[@id='sum2']";
    String btnGetTotal="//button[contains(.,'Get Total')]";
    String lblTotalValue="//span[@id='displayvalue']";

    public SimpleFormDemoPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void verifySingleInputField()
    {
        String labeltext =driver.findElement(By.xpath(singleInputFieldLabel)).getText();
        if(labeltext.equals("Single Input Field"))
        {
            System.out.println("You have navigated to the correct page");
        }
        else
        {
            System.out.println("You are on wrong page");
        }
    }

    public void checkSingleInputField(String message)
    {
        driver.findElement(By.xpath(txtEnterMessage)).sendKeys(message);
        driver.findElement(By.xpath(btnShowMessage)).click();
        if (driver.findElement(By.xpath(lblEnteredMessage)).getText().equals(message))
        {
            System.out.println("Single input fields function worked");
        }
        else
        {
            System.out.println("Single input fields function failed");
        }



    }

    public void checkTwoInputFields(int a, int b)
    {
        driver.findElement(By.xpath(txtSum1)).sendKeys(String.valueOf(a));
        driver.findElement(By.xpath(txtSum2)).sendKeys(String.valueOf(b));
        driver.findElement(By.xpath(btnGetTotal)).click();

        if(driver.findElement(By.xpath(lblTotalValue)).getText().equals(String.valueOf(a+b)))
        {
            System.out.println("Two input fields function worked");
        }
        else
        {
            System.out.println("ddd");
        }
    }

}
