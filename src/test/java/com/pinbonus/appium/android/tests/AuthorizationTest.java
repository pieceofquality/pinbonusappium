package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.openMenu;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.driver;
import static com.pinbonus.appium.android.util.Helpers.find;

/**
 * Created by piece on 30.05.2016.
 */
public class AuthorizationTest extends AppiumSetup{

    @Test
    public void authFails() throws InterruptedException{
        closeWelcome();
Process process = Runtime.getRuntime().exec()
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
