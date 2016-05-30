package com.pinbonus.appium.android.pages;

import org.openqa.selenium.WebElement;

import static com.pinbonus.appium.android.util.Helpers.driver;

/**
 * Created by piece on 30.05.2016.
 */
public class AddCardPage {

    public static WebElement numberOnCard = driver.findElementById("etNubmer");

    public static void addNumber(String num){
        numberOnCard.sendKeys(num);
    }
}