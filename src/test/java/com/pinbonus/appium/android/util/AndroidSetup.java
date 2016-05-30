////package scenarios;
////
////
////import io.appium.java_client.android.AndroidDriver;
////import org.junit.After;
////import org.junit.Before;
////import org.openqa.selenium.remote.DesiredCapabilities;
////
////import java.io.File;
////import java.net.MalformedURLException;
////import java.net.URL;
////
////public class AndroidSetup {
////    protected AndroidDriver driver;
////
////    @Before
////    public void setUp() throws Exception {
////        File appDir = new File("D:/Projects/pinbonusappium/apps");
////        File app = new File(appDir, "qiwibonus.apk");
////        DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability("platformVersion", "4.4");
////        capabilities.setCapability("device", "Android");
////        capabilities.setCapability("deviceName", "Android Emulator");
////        capabilities.setCapability("platformName", "Android");
////        capabilities.setCapability("app", app.getAbsolutePath());
////        capabilities.setCapability("appPackage", "com.qiwibonus");
////        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
////    }
////
////    @After
////    public void tearDown() throws Exception {
////        driver.quit();
////    }
//}