package com.pinbonus.appium.android.pages;

import org.openqa.selenium.WebElement;

import static com.pinbonus.appium.android.pages.CardsPage.addButtonTap;
import static com.pinbonus.appium.android.util.Helpers.driver;
import static com.pinbonus.appium.android.util.Helpers.find;

/**
 * Created by piece on 30.05.2016.
 */
public class AddCardPage {

    public static WebElement numberOnCard = driver.findElementById("etNumber");

    public static void addNumber(String num){
        numberOnCard.sendKeys(num);
    }

    public static void addCard(String cardName) {
        driver.findElementById("fabAdd").click();
        find(cardName).click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
    }

    public static void addAnotherCard(String cardName){
        find(cardName).click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
    }
}