package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;
import static com.pinbonus.appium.android.pages.AddCardPage.addAnotherCard;
import static com.pinbonus.appium.android.pages.CardsPage.menuButtonTap;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;

public class RatingBannerTest extends AppiumSetup{

    @Test
    public void buttonRatingBannerTest() throws InterruptedException{
        closeWelcome();
        addAnotherCard("СПОРТМАСТЕР", 5);
        menuButtonTap();
        find("Позже").click();
        find("Вам нравится").isDisplayed();
    }
}
