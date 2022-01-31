package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.jar.asm.ByteVector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q4 {
    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high
     *     T2 : Verify item prices are sorted from low to high with soft Assert
     */


    WebDriver driver;

    @BeforeClass

    public void setUp(){

        WebDriverManager.chromedriver().setup();

        driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
    }

    @Test
    public void sauceDemoTesti1(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret-sauce");

    }

}
