package android.tests;

import android.util.AppiumSetup;
import org.junit.Test;

import static io.appium.java_client.android.AndroidKeyCode.BACK;

/**
 * Created by piece on 04.06.2016.
 */
public class OfferListTest extends AppiumSetup {

    @Test
    public void likeButtonTest(){
        closeWelcome();
        swipeLeft();
        find("Все скидки").click();
        driver.findElementById("ivLike").click();
        driver.findElementByAccessibilityId("Navigate up").click();
        find("Избранное").click();
        find("В этом разделе вы найдете").isDisplayed();
        find("ОК").click();
        driver.findElementById("ivLike").click();
        find("Вы ничего не добавили").isDisplayed();
        driver.findElementByAccessibilityId("Navigate up").click();
    }

    @Test
    public void shareButtonTest(){
        closeWelcome();
        swipeLeft();
        find("Все скидки").click();
        driver.findElementById("ivShare").click();
        find("в котором хотите поделиться купоном").isDisplayed();
        driver.pressKeyCode(BACK);
    }
}
