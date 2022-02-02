package tests.day15;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;

import org.testng.Assert;

import org.testng.annotations.Test;

import utilities.TestBase;

import java.io.File;

import java.io.IOException;

public class C02_ScreenshotWebelement extends TestBase {

    @Test

    public void nutellaTesti() throws InterruptedException, IOException {

        // amazon anasayfaya gidelim

        driver.get("https://www.amazon.com");



    }

}