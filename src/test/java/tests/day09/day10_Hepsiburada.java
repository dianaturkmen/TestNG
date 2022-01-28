package tests.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class day10_Hepsiburada {

    //Yeni bir Class Olusturun : D11_SoftAssert1

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void hepsiburadaTesti(){
        //1. “https://www.hepsiburada.com/” Adresine gidin
        driver.get("https://www.hepsiburada.com/");
        //2. Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdigini dogrulayin
        String actualTitle=driver.getTitle();
        String expectedTitle="Turkiye’nin En Buyuk Alisveris Sitesi";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedTitle,actualTitle, "title Yanlis");
        //3. search kutusuna araba yazip arattirin
        WebElement searchKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        searchKutusu.sendKeys("araba"+ Keys.ENTER);
        //4. bulunan sonuc sayisini yazdirin
        WebElement sonuc=driver.findElement(By.xpath("//div[@class='searchResultSummaryBar-mainText']"));
        //5. sonuc yazisinin "araba" icerdigini dogrulayin


        //6. Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin

    }




}
