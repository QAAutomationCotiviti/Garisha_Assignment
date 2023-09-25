import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortElements {
    static WebDriver driver= new ChromeDriver();

    public void newfunction(String s, String p) {

        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys(s);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(p);

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        sortingelement("ascending");
        fetchelement();
        sortingelement("descending");
        fetchelement();
        sortingelement("lh");
        fetchelement();
        sortingelement("hl");
        fetchelement();



    }

    public void fetchelement(){


        List<WebElement> productElements = driver.findElements(By.className("inventory_item"));
        System.out.println("List of Products:");

     for (WebElement productElement : productElements) {
            WebElement productNameElement = productElement.findElement(By.className("inventory_item_name"));
            String productName = productNameElement.getText();

         WebElement productdetails = productElement.findElement(By.className("inventory_item_desc"));
         String details = productdetails.getText();

         WebElement productprice = productElement.findElement(By.className("inventory_item_price"));
         String price = productprice.getText();

         System.out.println(productName);
         System.out.println(details);
         System.out.println(price);
    }
    }

    public  void sortingelement(String s){

        Select objSelect =new Select(driver.findElement(By.className("product_sort_container")));
//        objSelect.selectByIndex(3);

        switch (s){
            case "ascending" ->
                objSelect.selectByIndex(0);

            case "descending" ->
                objSelect.selectByIndex(1);
            case "lh" ->
                objSelect.selectByIndex(2);
            case "hl" ->
                objSelect.selectByIndex(3);

        }
        }



    public static void main(String[] args) {

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        SortElements obj = new SortElements();

        obj.newfunction("standard_user","secret_sauce");

    } }

