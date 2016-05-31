package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.pinbonus.appium.android.pages.CardsPage.addButtonTap;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;

@FixMethodOrder(MethodSorters.JVM)
public class AddCardTest extends AppiumSetup {



    @Test
    public void addCardWithNumber() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("Номер").sendKeys("1234567890123465789");
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        find("1234567890123465789").isDisplayed();
    }

    @Test
    public void addCardEmpty() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
    }
}
