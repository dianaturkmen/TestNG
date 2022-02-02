package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04_Screenshot extends TestBase {

    @Test
    public void screenTest() throws IOException {

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        TakesScreenshot screenshot=(TakesScreenshot) driver;

        File tumSayfaSS=new File("src\\tumSayfa.png");

        tumSayfaSS=screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(tumSayfaSS, new File("src\\tumSayfa.png"));
    }
}
