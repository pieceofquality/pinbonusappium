package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.driver;
import static android.core.Helpers.find;
import static android.pages.AddCardPage.addAnotherCard;
import static android.pages.CardsPage.menuButtonTap;
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
