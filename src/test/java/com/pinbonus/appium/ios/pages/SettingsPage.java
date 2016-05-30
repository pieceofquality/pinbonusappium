package com.pinbonus.appium.ios.pages;

import static com.pinbonus.appium.android.util.Helpers.driver;

/**
 * Created by piece on 30.05.2016.
 */
public class SettingsPage {

    // Open choose city menu
    public static void chooseCityMenu(){
        driver.findElementById("tvCity").click();
    }


}
