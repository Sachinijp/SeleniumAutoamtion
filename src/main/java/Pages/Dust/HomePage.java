package Pages.Dust;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HomePage {

   public WebDriver driver;

    private Map<String,By> menuName;

    String linkSideMenu="//div[contains(.,'Menu List')]/following::a[contains(.,'%s')]";
    String StartPopup="//span[contains(.,'Learn selenium to automate with Seleniumeasy.com')]";
    String startClosebutton="//a[contains(.,'No, thanks')]";
    String linkSideSubMenu="//a[contains(.,'All Examples')]/../ul//following::a[contains(.,'%s')]";

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        menuName=new HashMap<>();
        menuName.put("Input Forms Label",By.xpath("//a[@class='dropdown-toggle' and contains(.,'Input Forms')]"));
        menuName.put("Table Label",By.xpath("//a[@class='dropdown-toggle' and contains(.,'Table')]"));
        menuName.put("Demo Home Label",By.xpath("//a[contains(.,'Demo Home')]"));
        menuName.put("Alerts And Models Label",By.xpath("//a[@class='dropdown-toggle' and contains(.,'Alerts & Modals')]"));
        menuName.put("List Box Label",By.xpath("//a[@class='dropdown-toggle' and contains(.,'List Box')]"));
        menuName.put("Other Label",By.xpath("//a[@class='dropdown-toggle' and contains(.,'Others')]"));

    }

    public void clickSideMainMenuLink(String mainMenu)
    {
        String name = String.format(linkSideMenu,mainMenu);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if(driver.findElement(By.xpath(name)).isEnabled())
        {
            driver.findElement(By.xpath(name)).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("User clicked on "+mainMenu);
        }

        else
        {
            System.out.println("Element not clickable");
        }


    }

    public void clickSideSubMenuLink(String subMenu)
    {
        String name = String.format(linkSideSubMenu,subMenu);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if(driver.findElement(By.xpath(name)).isEnabled())
        {
            driver.findElement(By.xpath(name)).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("User clicked on "+subMenu);
        }

        else
        {
            System.out.println("Element not clickable");
        }


    }


    public void closeStartPopup()
    {
        if(driver.findElement(By.xpath(StartPopup)).isDisplayed())
        {
            driver.findElement(By.xpath(startClosebutton)).click();
        }

    }

    public void verifyMainMenu()
    {
        menuName.forEach((k,v)->{
                if(driver.findElement(v).isDisplayed())
                {
                    System.out.println(k+" is displayed");
                }
                else
                {
                    System.out.println(k+" is not displayed");
                }

        });
    }



}
