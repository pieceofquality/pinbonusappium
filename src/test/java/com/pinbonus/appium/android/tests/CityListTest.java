package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.openMenu;
import static com.pinbonus.appium.android.pages.SettingsPage.chooseCityMenu;
import static com.pinbonus.appium.android.util.Helpers.*;


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
