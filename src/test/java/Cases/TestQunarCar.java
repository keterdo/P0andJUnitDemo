package Cases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestQunarCar {

    public static AppiumDriver driver;

    @Before
    public void setUp(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName",
                "Android");
        capabilities.setCapability("platformVersion",
                "7.0");
        capabilities.setCapability("deviceName",
                "SJE0217C28022492");
        capabilities.setCapability("app",
                "com.mobike.mobikeapp");
        capabilities.setCapability("appPackage",
                "com.mobike.mobikeapp");
        capabilities.setCapability("appActivity",
                ".SplashActivity");  //.MainActivity
        capabilities.setCapability("noSign",
                "true");
        capabilities.setCapability("unicodeKeyboard",
                "true");
        capabilities.setCapability("newCommandTimeout",
                "600");
        capabilities.setCapability("noReset",
                true);
        capabilities.setCapability("fullReset",
                false);
        capabilities.setCapability("clearSystemFiles",
                false);
        try {
            //初始化驱动
            driver = new AndroidDriver(new URL(
                    "http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void testDemo(){

        MobileElement el2 = (MobileElement) driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_mod_ut");
        el2.click();

        if(driver.findElementById("atom_alexhome_mod_ut").getText() != "0"){
            MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"403 Forbidden\"]");
            el3.click();
        }else{
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[1]");
            el4.click();
        }

        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("搜 索");
        el5.click();

        List<MobileElement> list = driver.findElementsByClassName("ImageView");

        Assert.assertEquals(list.size(),100);
    }

    @After
    public void shutDown(){
        driver.quit();
    }
}
