package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.pages.AddCardPage.addCard;
import static android.pages.CardsPage.menuButtonTap;
import static android.pages.SettingsPage.chooseCityMenu;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;


public class CityListTest extends AppiumSetup {

    @Test
    public void chooseCity(){
        closeWelcome();
        menuButtonTap();
        chooseCityMenu();
        find("Пермь").click();
        menuButtonTap();
        find("Пермь").isDisplayed();
    }
    @Test
    public void chooseNonListCity(){
        closeWelcome();
        menuButtonTap();
        chooseCityMenu();
        find("нет в списке").click();
        menuButtonTap();
        find("нет в списке").isDisplayed();
    }

    @Test
    public void chooseCityFromPopUp(){
        closeWelcome();
        addCard("СПОРТМАСТЕР", 1);
        find("Позже").click();
        addCard("СПОРТМАСТЕР", 1);
    }

    @Test
    public void chooseCityFromPopUpCancel(){
        closeWelcome();
        addCard("СПОРТМАСТЕР", 1);
        find("OK").click();
        find("Пермь").click();
        menuButtonTap();
        find("Пермь").isDisplayed();
    }
}
