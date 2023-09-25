import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
   static WebDriver driver= new ChromeDriver();

    public void myuserfunction(String s, String p) {

       WebElement user= driver.findElement(By.id("user-name"));
        user.sendKeys(s);

       WebElement password = driver.findElement(By.id("password"));
       password.sendKeys(p);

       WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        sorting();

//        WebElement Popup = driver.findElement(By.xpath("//h3[@data-test='error']"));
//        String popup = (Popup.getText());
//
//        System.out.println(popup);
//
//        clearInput(user,password);


    }
//
//    public void clearInput(WebElement username,WebElement pass){
//        username.clear();
//        pass.clear();
//    }


    public void clearInput(WebElement username, WebElement pass) {
        username.sendKeys(Keys.CONTROL,"a");
        username.sendKeys(Keys.BACK_SPACE);
        pass.sendKeys(Keys.CONTROL,"a");
        pass.sendKeys(Keys.BACK_SPACE);
    }

    public  void sorting(){

        Select objSelect =new Select(driver.findElement(By.className("product_sort_container")));
        objSelect.selectByIndex(2);

    }
    public static void main(String[] args) {

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        LoginPage obj = new LoginPage();

//        obj.myuserfunction("","jgvgm");
//
//        obj.myuserfunction("hgch","");
//
//        obj.myuserfunction("problem_user","");
//
//        obj.myuserfunction("problem_user","hidajd");

        obj.myuserfunction("standard_user","secret_sauce");






//        driver.close();
    }
}
