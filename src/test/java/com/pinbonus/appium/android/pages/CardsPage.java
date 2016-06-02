package com.pinbonus.appium.android.pages;

import org.openqa.selenium.WebElement;

import static com.pinbonus.appium.android.util.Helpers.driver;
import static com.pinbonus.appium.android.util.Helpers.find;

public class CardsPage {

    public static WebElement addButton = driver.findElementById("fabAdd");

    //    Open sidebar
    public static void menuButtonTap(){
        driver.findElementByAccessibilityId("Navigate up").click();
    }

    public static void addButtonTap(){
        driver.findElementById("fabAdd").click();
    }

    public static void deletButtonTap(){
        driver.findElementByAccessibilityId("More options").click();
        find("Удалить").click();
    }
}
