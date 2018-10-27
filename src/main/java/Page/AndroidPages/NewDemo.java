package Page.AndroidPages;

import Driver.DriverFactory;
import Page.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import javafx.scene.web.WebView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/10/27.
 *
 * @Description:
 */
public class NewDemo {


        @AndroidFindBy(id = "com.xueqiu.android:id/user_profile_icon")
        public MobileElement myCenter;

        @AndroidFindBy(id = "com.xueqiu.android:id/tv_login")
        public AndroidElement login;

        @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
        public AndroidElement huzhi;

        AppiumDriver driver = null;
        @Before
        public void setUp(){
                DesiredCapabilities capabilities = new DesiredCapabilities();

                capabilities.setCapability("platformName",
                        "Android");
//        capabilities.setCapability("platformVersion",
//                "6.0");
                capabilities.setCapability("deviceName",
                        "P4M0215713015683"); //192.168.56.101:5555
                capabilities.setCapability("app",
                        "com.xueqiu.android");
                capabilities.setCapability("appPackage",
                        "com.xueqiu.android");
                capabilities.setCapability("appActivity",
                        ".view.WelcomeActivityAlias");  //.MainActivity

                try {
                        //初始化驱动
                        driver = new AndroidDriver(new URL(
                                "http://127.0.0.1:4723/wd/hub"), capabilities);
                } catch (MalformedURLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                driver.manage().timeouts()
                        .implicitlyWait(15, TimeUnit.SECONDS);

                //超时时间
                final int TIMEOUT = 10;
                TimeOutDuration timeOutDuration = new TimeOutDuration(10, TimeUnit.SECONDS);

                PageFactory.initElements(new AppiumFieldDecorator(driver,timeOutDuration) , this);
        }

        @Test
        public void testCase(){
                myCenter.click();
                login.click();
        }


//
//        @AndroidFindBys({@AndroidBy(id = "xx"),@AndroidBy(tagName = "ImageView")})
//        AndroidElement demoAnr;
//
//        @AndroidFindAll({@AndroidBy(id = "productlist")})
//        List<AndroidElement> demoios;




}
