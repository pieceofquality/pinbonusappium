package com.pinbonus.appium.android.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.pinbonus.appium.android.util.Helpers.driver;

/**
 * Created by piece on 28.05.2016.
 */
public class WelcomePage {

    public static WebElement startButton = driver.findElement(By.id("bStart"));

    public static void tapStart() {
        startButton.click();
    }
}