public class AppTest 
// {
//     @Test
//     public void openBrowser() throws InterruptedException
//     {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
// // Navigate to the DemoQA website
//         //driver.get("https://demoqa.com/automation-practice-form");
 
//         // Locate the text field and type some text using keyboard actions
//         // WebElement textField = driver.findElement(By.id("firstName"));
//         // textField.sendKeys("Nithya");
//         // Thread.sleep(2000);
//         // textField.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select all text in the field
//         // Thread.sleep(5000);
//         // textField.sendKeys(Keys.DELETE); // Clear the text field
//         // Thread.sleep(5000);
//         // textField.sendKeys("Selenium");
//         // driver.get("https://demoqa.com/webtables");
//         // WebElement table = driver.findElement(By.id("app"));
//         // table.click();
//         driver.get("https://www.google.com");
//         // Locate the search box
//         WebElement searchBox = driver.findElement(By.name("q"));
 
//         // Perform keyboard actions
//         searchBox.sendKeys("Selenium automation");
//         Thread.sleep(5000);
//          searchBox.sendKeys(Keys.ARROW_DOWN);  // Navigate down in suggestions
//         Thread.sleep(5000);  // Wait for suggestions to load
//         searchBox.sendKeys(Keys.ARROW_DOWN);  // Navigate further down
//         Thread.sleep(5000);
//         searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//         Thread.sleep(5000);
//         searchBox.sendKeys(Keys.ENTER);  // Press Enter to submit the search
//         Thread.sleep(5000);
//         // Close the browser
//         driver.quit();
//     }
//     }