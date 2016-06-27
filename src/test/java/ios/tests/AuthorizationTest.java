package ios.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.driver;
import static android.core.Helpers.find;
import static android.pages.CardsPage.menuButtonTap;

/**
 * Created by piece on 30.05.2016.
 */
public class AuthorizationTest extends AppiumSetup{

    @Test
    public void authFails() throws InterruptedException{
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

}
