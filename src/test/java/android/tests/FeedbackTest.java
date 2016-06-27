package android.tests;

import android.util.AppiumSetup;
import org.junit.Test;

import static pages.CardsPage.menuButtonTap;
import static android.util.Helpers.closeWelcome;
import static android.util.Helpers.find;

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
