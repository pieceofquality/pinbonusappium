package ios.tests;

import android.core.AppiumSetup;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static android.pages.CardsPage.addButtonTap;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;

@FixMethodOrder(MethodSorters.JVM)
public class AddCardTest extends AppiumSetup {



    @Test
    public void addCardEmpty() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        find("1234567890123465789").isDisplayed();
    }

    @Test
    public void addCardWithNumber() throws InterruptedException{
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("Номер").sendKeys("1234567890123465789");
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Adidas").click();
        find("1234567890123465789").isDisplayed();
    }
}
