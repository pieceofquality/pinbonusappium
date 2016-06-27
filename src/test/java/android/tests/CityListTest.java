package android.tests;

import android.util.AppiumSetup;
import org.junit.Test;

import static pages.AddCardPage.addCard;
import static pages.CardsPage.menuButtonTap;
import static pages.SettingsPage.chooseCityMenu;
import static android.util.Helpers.closeWelcome;
import static android.util.Helpers.find;


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
