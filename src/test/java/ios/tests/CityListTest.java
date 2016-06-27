package ios.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.pages.CardsPage.menuButtonTap;
import static android.pages.SettingsPage.chooseCityMenu;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;


public class CityListTest extends AppiumSetup {

    @Test
    public void chooseCity() throws InterruptedException{
        closeWelcome();
        menuButtonTap();
        chooseCityMenu();
        find("Пермь").click();
        menuButtonTap();
        find("Пермь").isDisplayed();
    }
}
