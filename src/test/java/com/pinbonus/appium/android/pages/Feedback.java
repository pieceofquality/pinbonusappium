package com.pinbonus.appium.android.pages;

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

import static org.junit.Assert.assertTrue;

public class Feedback {

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
        capabilities.setCapability("appActivity", "com.pinbonus.ActivityFeedback");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void viewAlerts() {
        driver.findElement(By.id("fabAdd")).click();
        WebElement button = driver.findElement(By.id("tvNotInList"));
        assertTrue(button.isDisplayed());
    }
}