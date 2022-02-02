package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class HworkActions extends TestBase {

    //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
    //2. "Hover over Me First" kutusunun ustune gelin
    //3. "Link 1" e tiklayin
    //4. Popup mesajini yazdirin
    //5. Popup'i tamam diyerek kapatin
    //6. "Click and hold" kutusuna basili tutun
    //7. "Click and hold" kutusunda cikan yaziyi yazdirin
    //8. "Double click me" butonunu cift tiklayin

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Actions");
        WebElement howOverFirst=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(howOverFirst).perform();
        Thread.sleep(10000);
        actions.sendKeys(Keys.PAGE_DOWN);

        WebElement link1=driver.findElement(By.xpath("//a[@class='list-alert']"));
        link1.click();
        System.out.println("link1 e tiklandi");
        String popuptext=driver.switchTo().alert().getText();
        System.out.println(popuptext);
        driver.switchTo().alert().accept();
        //6. "Click and hold" kutusuna basili tutun
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        //8. "Double click me" butonunu cift tiklayin


    }


}
