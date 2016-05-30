package com.pinbonus.appium.ios.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

public class NewCard {

    private AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        File appDir = new File("D:/Projects/pinbonusappium/apps");
        File app = new File(appDir, "qiwibonus.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.qiwibonus");
        capabilities.setCapability("appActivity", "com.pinbonus.ActivityCardTypes");
        capabilities.setCapability("noReset", true);
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void addCard() {
        List<WebElement> card = driver.findElementsByClassName("android.widget.TextView");
        card.get(3).click();
        driver.findElement(By.name("Сохранить")).click();
        
    }
}
