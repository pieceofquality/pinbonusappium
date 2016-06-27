package android.tests;

import android.core.ADB;
import android.core.AppiumSetup;
import org.junit.Test;
import org.openqa.selenium.By;

import static android.pages.CardsPage.addButtonTap;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.driver;
import static android.core.Helpers.find;

public class AddCardTest extends AppiumSetup{

    @Test
    public void addCardWithNumber(){
        closeWelcome();
        addButtonTap();
        driver.findElement(By.name("Adidas"));
        find("Номер").click();
        ADB.runCommand("adb shell input text '123456789'");
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        find("123456789").isDisplayed();
    }

    @Test
    public void addCardEmpty(){
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
    }

    @Test
    public void addCardInTheEnd(){
        closeWelcome();
        addButtonTap();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction", "down");
//        scrollObject.put("element", ((RemoteWebElement) ).getId());
//        js.executeScript("mobile: scroll", scrollObject);
        find("Япоша").click();
    }
}
