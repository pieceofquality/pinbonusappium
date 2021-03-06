package com.pinbonus.appium.ios.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.util.Helpers.*;
import static com.pinbonus.appium.ios.pages.CardsPage.openMenu;

/**
 * Created by piece on 30.05.2016.
 */
public class AuthorizationTest extends AppiumSetup{

    @Test
    public void authFails() throws InterruptedException{
        closeWelcome();
        openMenu();
        find("Войти").click();
        driver.findElementById("etPhone").sendKeys("0000000000");
        driver.findElementById("cbOffer").click();
        find("Для продолжения необходимо").isDisplayed();
        driver.findElementById("cbOffer").click();
        find("Продолжить").click();
        find("Исправить").click();
        driver.findElementById("etPhone").sendKeys("1111111111");
        find("Продолжить").click();
        find("да").click();
    }

}
