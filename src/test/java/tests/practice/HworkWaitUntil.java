package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class HworkWaitUntil extends TestBase {
    //1. Bir class olusturun : EnableTest

    //2. Bir metod olusturun : isEnabled()

    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

    //4. Textbox’in etkin olmadigini(enabled) dogrulayın

    //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin

    //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.

    //7. Textbox’in etkin oldugunu(enabled) dogrulayın

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement Textbox=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(Textbox.isEnabled());
       // driver.findElement(By.xpath("(//button[@autocomplete='off'])[2]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@autocomplete='off'])[2]"))).click();
    //    //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        WebElement enabbledYazisi= driver.findElement(By.xpath("//p[text()=\"It's enabled!\"]"));
Assert.assertTrue(enabbledYazisi.isDisplayed());
Assert.assertTrue(Textbox.isEnabled());
    }

}
