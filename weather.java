import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weather {

    static WebDriver driver=new ChromeDriver();
     public  void weatherupdate( String t){

        String searchtext=t;

         WebElement press = driver.findElement(By.xpath("//*[@id='APjFqb']"));
         press.clear();

        WebElement search = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        search.sendKeys(searchtext);
        search.sendKeys(Keys.ENTER);

         WebElement Celsius = driver.findElement(By.xpath("//span[@aria-label='°Celsius']"));
         String celsius  = (Celsius.getText());

         WebElement Temperature = driver.findElement(By.id("wob_tm"));
         String temperature = (Temperature.getText());

         WebElement Day = driver.findElement(By.id("wob_dts"));
         String day = (Day.getText());

         WebElement Weatherstatus = driver.findElement(By.id("wob_dc"));
         String weatherstatus = (Weatherstatus.getText());

         WebElement Location = driver.findElement(By.xpath("//span[@class='BBwThe']"));
         String location = (Location.getText());

        System.out.println("Forecast for "+ day);
        System.out.println("Temperature is :"+ temperature +celsius );
        System.out.println("Weather status is :"+ weatherstatus);
        System.out.println("Location :"+ location + "\n");
    }
    public static void main(String[] args) {




        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement translate = driver.findElement(By.xpath("//*[@id='SIvCob']/a"));
        translate.click();

        weather obj = new weather();

        obj.weatherupdate("Weather Today");

       obj.weatherupdate("Weather Tomorrow");

    }
}