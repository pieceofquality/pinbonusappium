package android.tests;

import android.util.ADB;
import android.util.AppiumSetup;
import org.junit.Test;
import org.openqa.selenium.By;

import static pages.CardsPage.addButtonTap;
import static android.util.Helpers.closeWelcome;
import static android.util.Helpers.driver;
import static android.util.Helpers.find;

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
