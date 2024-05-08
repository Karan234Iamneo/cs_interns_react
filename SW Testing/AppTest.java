package com.iamneo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("35790/");
        driver.findElement(By.linkText("Mutual Funds")).click();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='amcSelection']")));
        dropdown.selectByVisibleText("Canara Robeco");
        Thread.sleep(2000);
        Select dropdown1=new Select(driver.findElement(By.xpath("//*[@id='schemenm']")));
        dropdown1.selectByVisibleText("Canara Robeco Bluechip Equity Direct-G");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Get Details")).click();
        Thread.sleep(2000);
       // driver.navigate().to("https://economictimes.indiatimes.com/canara-robeco-bluechip-equity-fund-direct-plan/mffactsheet/schemeid-15765.cms");
       String currentTab = driver.getWindowHandle();

    for (String tab : driver.getWindowHandles()) {

        if (!tab.equals(currentTab)) {

            driver.switchTo().window(tab);

            break;

        }

        }
        driver.findElement(By.xpath("/html/body/main/div[10]/section[1]/div/div[2]/div[1]/div[2]/ul/li/i")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/main/div[10]/section[1]/div/div[2]/div[1]/div[2]/ul/li/ul/li[1]/span")).click();
        Thread.sleep(5000);

        List<WebElement> allElements = driver.findElements(By.xpath("html/body/div[10]/div/div[1]/div[3]/ul[1]/li[5]"));
        System.out.println(allElements);
    
        for (WebElement element: allElements) {
            System.out.println(element.getText());
            if(element.getText().equals("SIP"))
                element.click();          
        }

        driver.findElement(By.xpath("//*[@id='installment_amt']/li/i")).click();
        driver.findElement(By.xpath("//*[@id='installment_amt']/li/ul/li[3]/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='installment_period']/li/i")).click();
        driver.findElement(By.xpath("//*[@id='installment_period']/li/ul/li[4]/span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='mfNav']/div/ul/li[2]")).click();
        Thread.sleep(2000);
        
        WebElement table=driver.findElement(By.xpath("//*[@id=\"mfReturns\"]/div[2]/div[2]/ul/li[1]/table"));
        Thread.sleep(5000);
        WebElement firstRow=table.findElement(By.xpath("//*[@id=\"mfReturns\"]/div[2]/div[2]/ul/li[1]/table/tbody/tr[1]"));
        try{
        List<WebElement> cells = firstRow.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText()+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    

    //     driver.get("https://stqatools.com/demo/MouseHover.php");
    //     Thread.sleep(3000);

    //     WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/button"));
    //     Actions actions = new Actions(driver);
    //    actions.moveToElement(element).perform();
       
    //     Thread.sleep(5000);

    //     driver.quit();
       
    }

}
