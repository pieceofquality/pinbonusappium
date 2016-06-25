package com.pinbonus.appium.android.util;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import static com.pinbonus.appium.android.util.Helpers.driver;

public class AppiumSetup {


    /** wait wraps Helpers.wait **/
    public static WebElement wait(By locator) {
        return Helpers.wait(locator);
    }

    /** Run before each test **/
    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.5.3");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 4");
        capabilities.setCapability("platformVersion", "4.4");
        URL serverAddress;
        String localApp = "qiwibonus.apk";
        String userDir = System.getProperty("user.dir");
        String appPath = Paths.get(userDir, localApp).toAbsolutePath().toString();
        capabilities.setCapability("app", appPath);
        serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(serverAddress, capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Helpers.init(driver, serverAddress);
        }

    /** Run after each test **/
    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }

}