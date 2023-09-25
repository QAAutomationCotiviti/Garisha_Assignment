import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginPage1 {
    static WebDriver driver = new ChromeDriver();

    public void myuserfunction(String s, String p) {

        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys(s);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(p);

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();


    }

    public void afterLogin() {
//
//        List<WebElement> productElements = driver.findElements(By.className("inventory_item"));
//        System.out.println("List of Products:");
//
//     for (WebElement productElement : productElements) {
//            WebElement productNameElement = productElement.findElement(By.className("inventory_item_name"));
//            String productName = productNameElement.getText();
//            System.out.println(productName);
//    }


       String initialtext="item_";
       String finaltext = "_title_link";
       System.out.println("List of Products:");
       for(int i=0 ;i<=5; i++){
           String c=initialtext+i+finaltext;
           String textname = ( driver.findElement(By.id(c)).getText());
           System.out.println(textname);
       }

    }


    public static void main(String[] args) {

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        LoginPage1 obj = new LoginPage1();
        obj.myuserfunction("standard_user", "secret_sauce");
        obj.afterLogin();

    }
}
