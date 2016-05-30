package com.pinbonus.appium.ios.pages;

import static com.pinbonus.appium.android.util.Helpers.driver;

public class CardsPage {

    //    Open sidebar
    public static void openMenu(){
        driver.findElementByAccessibilityId("Navigate up").click();
    }

    public static void addButtonTap(){
        driver.findElementById("fabAdd").click();
    }
}
