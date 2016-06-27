package android.tests;

import android.util.AppiumSetup;
import org.junit.Test;

import static pages.AddCardPage.addAnotherCard;
import static pages.CardsPage.menuButtonTap;
import static io.appium.java_client.android.Connection.AIRPLANE;

public class RatingBannerTest extends AppiumSetup{

    @Test
    public void buttonRatingBannerTest(){
        closeWelcome();
        addAnotherCard("СПОРТМАСТЕР", 5);
        menuButtonTap();
        find("Позже").click();
        find("Вам нравится").isDisplayed();
    }

    @Test
    public void timeIsItNow() throws Exception{
        closeWelcome();
//        Runtime.getRuntime().exec("adb shell am start -n io.appium.settings/.Settings -e wifi off");
        driver.setConnection(AIRPLANE);
        menuButtonTap();
        find("Войти").click();
        driver.findElementById("etPhone").sendKeys("9787911365");
        find("Продолжить").click();
        find("подключение").isDisplayed();

    }
}
