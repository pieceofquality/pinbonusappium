package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.pages.CardsPage.addButtonTap;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;

/**
 * Created by piece on 01.06.2016.
 */
public class SortingCardsTest extends AppiumSetup{

    @Test
    public void sortingCards() {
        closeWelcome();
        addButtonTap();
        find("Adidas").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("Adamas").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("36").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("Этуаль").click();
        find("СОХРАНИТЬ").click();
        find("Да").click();
        find("карманов").click();
        find("СОХРАНИТЬ").click();
        find("Нет").click();
        find("Позже").click();
        find("Сортировка").click();
        find("По алфавиту").click();
    }
}
