package com.pinbonus.appium.android.pages;

import static com.pinbonus.appium.android.pages.CardsPage.addButtonTap;
import static com.pinbonus.appium.android.util.Helpers.driver;
import static com.pinbonus.appium.android.util.Helpers.find;

public class AddCardPage {

    public static void addNumber(String num) {
        driver.findElementById("etNumber").sendKeys(num);
    }

    public static void addCard(String cardName, int n) {
    for (int i = 0; i < n; i++) {
        addButtonTap();
        find(cardName).click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
    }
}

    public static void addAnotherCard(String cardName, int n) {
        addButtonTap();
        for (int i = 0; i < n; i++){
            find(cardName).click();
            find("СОХРАНИТЬ").click();
            find("Да").click();
    }
    }

//Заддаем имя карты, ее количество и варинт добавления (0 - подряд, 1 - с главного экрана)
//    public static void addAnotherCard(String cardName, int n) {
//            driver.findElementById("fabAdd").click();
//            for (int i = 0; i < n; i++) {
//                find(cardName).click();
//                find("СОХРАНИТЬ").click();
//                find("Да").click();
//        } else {
//            for (int i = 0; i < n; i++) {
//
//                find(cardName).click();
//                find("СОХРАНИТЬ").click();
//                find("Нет").click();
//            }
//        }
}