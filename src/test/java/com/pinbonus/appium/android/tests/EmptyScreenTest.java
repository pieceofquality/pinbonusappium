package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.addButton;
import static com.pinbonus.appium.android.pages.CardsPage.addButtonTap;
import static com.pinbonus.appium.android.pages.CardsPage.deletButtonTap;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;

/**
 * Created by piece on 01.06.2016.
 */
public class EmptyScreenTest extends AppiumSetup {

    @Test
    public void  emptyScreenTest() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("Номер").sendKeys("1234567890123465789");
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        deletButtonTap();
        addButton.isDisplayed();

    }
}
