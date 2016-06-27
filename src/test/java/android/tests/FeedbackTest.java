package android.tests;

import android.core.AppiumSetup;
import org.junit.Test;

import static android.pages.CardsPage.menuButtonTap;
import static android.core.Helpers.closeWelcome;
import static android.core.Helpers.find;

/**
 * Created by piece on 30.05.2016.
 */
public class FeedbackTest extends AppiumSetup {
    @Test
    public void feedbackErrors() throws InterruptedException {
        closeWelcome();
        menuButtonTap();
        find("Напишите").click();
        find("Напишите").isDisplayed();
    }
}
