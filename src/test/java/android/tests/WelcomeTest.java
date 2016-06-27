package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;
import org.openqa.selenium.By;

import static android.core.Helpers.*;


public class WelcomeTest extends AppiumSetup {

    @Test
    public void startScreen(){

        wait(By.id("tvPromoText"));
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