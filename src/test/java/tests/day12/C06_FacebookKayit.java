package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_FacebookKayit extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("(//button[@value='1'])[3]")).click();
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement adKutusu=driver.findElement(By.xpath("//input[@placeholder='First name']"));
        Actions actions=new Actions(driver);

        actions.click(adKutusu).
                keyDown(Keys.SHIFT).sendKeys("C").
                keyUp(Keys.SHIFT).sendKeys("emile").
                sendKeys(Keys.TAB).
                keyDown(Keys.SHIFT).sendKeys("T").keyUp(Keys.SHIFT).sendKeys("urkmen").
                sendKeys(Keys.TAB).sendKeys("cemile.turkmen@gmail.com").
                sendKeys(Keys.TAB).sendKeys("cemile.turkmen@gmail.com").
                sendKeys(Keys.TAB).sendKeys("password").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("18").
                sendKeys(Keys.TAB).sendKeys("Jun").
                sendKeys(Keys.TAB).sendKeys("1975").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();
Thread.sleep(1500);
        //4- Kaydol tusuna basalim
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }
}
