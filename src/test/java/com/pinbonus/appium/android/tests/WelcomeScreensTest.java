package com.pinbonus.appium.android.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class WelcomeScreensTest {

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
//        capabilities.setCapability("appActivity", "com.pinbonus.ActivitySplashScreen");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void startScreen() throws InterruptedException {
        Thread.sleep(5000);
        WebElement text = driver.findElement(By.id("tvPromoText"));

        assertEquals("Все дисконтные карты\n" +
                "любимых магазинов и ресторанов\n" +
                "в приложении", text.getText());

        swipeLeft();
        assertEquals("Вы никогда не потеряете\n" +
                "карты — они привязаны\n" +
                "к номеру телефона", text.getText());

        swipeLeft();
        assertEquals("Скидки в популярных магазинах,\n" +
                "отобранные вручную\n" +
                "специально для вас", text.getText());

        WebElement start_button = driver.findElement(By.id("bStart"));
        assertNotNull(start_button);
        swipeRight();
        assertNotNull(start_button);
        driver.runAppInBackground(3);

        assertEquals("Все дисконтные карты\n" +
                "любимых магазинов и ресторанов\n" +
                "в приложении", text.getText());

        swipeLeft();
        swipeLeft();

        driver.findElement(By.id("bStart")).click();

        WebElement add_button = driver.findElement(By.id("fabAdd"));
        assertNotNull(add_button);
    }

    public void swipeLeft(){
        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 500);
    }

    public void swipeRight(){
        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int endx = (int) (size.width * 0.9);
        int startx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 500);
    }
}