package com.pinbonus.appium.ios.tests;

import com.pinbonus.appium.ios.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.util.Helpers.*;


public class WelcomeTest extends AppiumSetup {

    @Test
    public void startScreen() throws InterruptedException {
        Thread.sleep(5000);
        text("You can store").isDisplayed();
        driver.swipe(100, 200, 500, 200, 1);
        text("For discount please").isDisplayed();
        swipeLeft();
        text("Скидки в популярных магазинах").isDisplayed();
        text("Начать").isDisplayed();
        swipeRight();
        text("Начать").isDisplayed();
        driver.runAppInBackground(3);
        text("Все дисконтные карты").isDisplayed();
        closeWelcome();
        find("com.qiwibonus:id/fabAdd").isDisplayed();
    }
}