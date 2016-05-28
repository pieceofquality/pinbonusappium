import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class NewCard {
public static void addCard() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone 4s");
        capabilities.setCapability("app", "/Users/poq/Projects/pinbonusappium/apps/qb.ipa");
        wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.findElement(By.name("Добавить")).click();
        wd.findElement(By.name("Добавить")).click();
        wd.close();
        }
        }
