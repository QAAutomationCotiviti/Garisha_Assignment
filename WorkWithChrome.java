import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WorkWithChrome {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//      driver.close();
        //Using Id
//        WebElement search = driver.findElement(By.id("APjFqb"));
//        search.sendKeys("Test");
//        search.sendKeys(Keys.ENTER);    //we press enter key after writing something in searchbox so keys.enter is used

        //Using XPath
//         WebElement search = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
//         search.sendKeys("Test");
//         search.sendKeys(Keys.ENTER);

         //Using Name //notworkinggggg

//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("Test");
//        Actions action = new Actions(driver);
//        action.moveByOffset(0, 0).click().build().perform();
//        search.findElement(By.name("btnK")).click();


        //Display Temperature in Console


        WebElement search = driver.findElement(By.id("APjFqb"));
          search.sendKeys("Weather Today");
          search.sendKeys(Keys.ENTER);

        WebElement translate = driver.findElement(By.partialLinkText("Change"));
        translate.click();

        WebElement celsius = driver.findElement(By.xpath("//span[@aria-label='°Celsius']"));
        String C = (celsius.getText());

        WebElement element = driver.findElement(By.id("wob_tm"));
        String text = (element.getText());

        WebElement Day = driver.findElement(By.id("wob_dts"));
        String D = (Day.getText());

        WebElement Status = driver.findElement(By.id("wob_dc"));
        String S = (Status.getText());

        WebElement Location = driver.findElement(By.xpath("//span[@class='BBwThe']"));
        String L = (Location.getText());

        System.out.println("Today's Temperature is : " +text+C  );
        System.out.println("Day: " +D  );
        System.out.println("Status: " +S );
        System.out.println("Location: " +L );

        WebElement press = driver.findElement(By.id("APjFqb"));
        press.clear();

        press.sendKeys("Weather Tomorrow");
        press.sendKeys(Keys.ENTER);


    }
}
