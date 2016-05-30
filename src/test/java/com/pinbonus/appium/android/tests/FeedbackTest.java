package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.openMenu;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;

/**
 * Created by piece on 30.05.2016.
 */
public class FeedbackTest extends AppiumSetup {
    @Test
    public void feedbackErrors() throws InterruptedException {
        closeWelcome();
        openMenu();
        find("Напишите").click();
        find("Напишите").isDisplayed();
    }
}
