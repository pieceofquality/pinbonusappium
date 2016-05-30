package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.util.Helpers.*;


public class WelcomeTest extends AppiumSetup{

    @Test
    public void startScreen() throws InterruptedException {
        Thread.sleep(5000);
        find("Все дисконтные карты").isDisplayed();
        swipeLeft();
        find("Вы никогда не потеряете").isDisplayed();
        swipeLeft();
        find("Скидки в популярных магазинах").isDisplayed();
        find("Начать").isDisplayed();
        swipeRight();
        find("Начать").isDisplayed();
        driver.runAppInBackground(3);
        find("Все дисконтные карты").isDisplayed();
        closeWelcome();
        find("com.qiwibonus:id/fabAdd").isDisplayed();
    }
}