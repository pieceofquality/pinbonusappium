package com.pinbonus.appium.ios.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.openMenu;
import static com.pinbonus.appium.android.pages.SettingsPage.chooseCityMenu;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;


public class CityListTest extends AppiumSetup {

    @Test
    public void chooseCity() throws InterruptedException{
        closeWelcome();
        openMenu();
        chooseCityMenu();
        find("Пермь").click();
        openMenu();
        find("Пермь").isDisplayed();
    }
}
