package com.pinbonus.appium.ios.util;

import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class AppiumSetup{

    private IOSDriver driver;

    /**
     * wait wraps Helpers.wait *
     */
    public static WebElement wait(By locator) {
        return Helpers.wait(locator);
    }


    /**
     * Run before each test *
     */
    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.1.0");
        capabilities.setCapability("platformVersion", "7.1");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        String userDir = System.getProperty("user.dir");
        String localApp = "UICatalog6.1.app.zip";
        String appPath = Paths.get(userDir, localApp).toAbsolutePath().toString();
        capabilities.setCapability("app", appPath);
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Helpers.init(driver);
    }

    /**
     * Run after each test *
     */
    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }
}