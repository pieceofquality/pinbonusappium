package com.pinbonus.appium.android.tests;

import com.pinbonus.appium.android.util.AppiumSetup;
import org.junit.Test;

import static com.pinbonus.appium.android.pages.CardsPage.addButtonTap;
import static com.pinbonus.appium.android.util.Helpers.closeWelcome;
import static com.pinbonus.appium.android.util.Helpers.find;

/**
 * Created by piece on 01.06.2016.
 */
public class SortingCardsTest extends AppiumSetup{

    @Test
    public void sortingCards() {
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("Adamas").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("36").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("Этуаль").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("карманов").click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Сортировка").click();
        find("По алфавиту").click();
    }
}
