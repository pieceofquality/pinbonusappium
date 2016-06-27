package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import java.io.IOException;

import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.driver;
import static android.core.Helpers.find;
import static android.pages.AddCardPage.addCard;
import static android.pages.CardsPage.addButton;
import static android.pages.CardsPage.menuButtonTap;
import static io.appium.java_client.android.AndroidKeyCode.KEYCODE_APP_SWITCH;


public class AuthorizationTest extends AppiumSetup{

    @Test
    public void authFails(){
        closeWelcome();
        menuButtonTap();
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

    @Test
    public void authProposition() throws InterruptedException, IOException {
        closeWelcome();
        addCard("СПОРТМАСТЕР", 1);
        find("Позже").click();
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        Thread.sleep(1000);
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        find("Войти").click();
        find("Вход").isDisplayed();
    }

    @Test
    public void authPropositionCancel() throws InterruptedException, IOException{
        closeWelcome();
        addCard("СПОРТМАСТЕР", 1);
        find("Позже").click();
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        Thread.sleep(1000);
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        find("Позже").click();
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        Thread.sleep(1000);
        driver.pressKeyCode(KEYCODE_APP_SWITCH);
        addButton.isDisplayed();
//        driver.pressKeyCode(KEYCODE_APP_SWITCH);
//        Runtime.getRuntime().exec("adb shell date -s 20160710");
//        find("Войти").click();

    }

}
