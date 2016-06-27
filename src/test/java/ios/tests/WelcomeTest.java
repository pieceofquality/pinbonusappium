//package ios.tests;
//
//import ios.core.AppiumSetup;
//import org.junit.Test;
//
//import static android.core.Helpers.swipeLeft;
//import static ios.core.Helpers.text;
//
//
//public class WelcomeTest extends AppiumSetup {
//
//    @Test
//    public void startScreen() throws InterruptedException {
//        Thread.sleep(5000);
//        text("Все дисконтные карты").isDisplayed();
//        driver.swipe(100, 200, 500, 200, 1);
//        text("Вы никогда не потеряете").isDisplayed();
//        text("Скидки в популярных магазинах").isDisplayed();
//        text("Начать").isDisplayed();
//        text("Начать").isDisplayed();
//        driver.runAppInBackground(3);
//        text("Все дисконтные карты").isDisplayed();
//        closeWelcome();
//        find("com.qiwibonus:id/fabAdd").isDisplayed();
//    }
//}