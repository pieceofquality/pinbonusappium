package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.pages.CardsPage.addButton;
import static android.pages.CardsPage.addButtonTap;
import static android.pages.CardsPage.deletButtonTap;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;

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
