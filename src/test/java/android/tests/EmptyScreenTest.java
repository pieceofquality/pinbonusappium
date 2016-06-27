package android.tests;

import android.util.AppiumSetup;
import org.junit.Test;

import static pages.CardsPage.addButton;
import static pages.CardsPage.addButtonTap;
import static pages.CardsPage.deletButtonTap;
import static android.util.Helpers.closeWelcome;
import static android.util.Helpers.find;

/**
 * Created by piece on 01.06.2016.
 */
public class EmptyScreenTest extends AppiumSetup {

    @Test
    public void  emptyScreenTest() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("Номер").sendKeys("1234567890123465789");
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        deletButtonTap();
        addButton.isDisplayed();

    }
}
