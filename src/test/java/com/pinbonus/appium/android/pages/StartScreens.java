package com.pinbonus.appium.android.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertEquals;



public class StartScreens {

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
        capabilities.setCapability("appActivity", "com.pinbonus.ActivitySplash");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void startScreen() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement text = driver.findElement(By.id("tvPromoText"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvPromoText")));
        assertEquals("Все дисконтные карты\n" +
                "любимых магазинов и ресторанов\n" +
                "в приложении", text.getText());
    }
}