package Driver;

import Util.SystemHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: 驱动工厂
 */
public class DriverFactory {

    public static AppiumDriver driver;

    /**
     * 生成androidDriver
     */
    private static void getAndroidDriver(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

//        capabilities.setCapability("platformName",
//                "Android");
//        capabilities.setCapability("platformVersion",
//                "7.0");
//        capabilities.setCapability("deviceName",
//                "SJE0217C28022492");
//        capabilities.setCapability("app",
//                "com.mobike.mobikeapp");
//        capabilities.setCapability("appPackage",
//                "com.mobike.mobikeapp");
//        capabilities.setCapability("appActivity",
//                ".SplashActivity");  //.MainActivity


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
                ".view.WelcomeActivityAlia");  //.MainActivity



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
    }

    /**
     * 生成iOSdriver
     */
    private static void getIosDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        File app = new File(System.getProperty("Appium.App"));

        capabilities.setCapability("platformName",
                "ios");
        capabilities.setCapability("platformVersion",
                "11.2.6");
        capabilities.setCapability("deviceName",
                "iosTestPhone");
        capabilities.setCapability("udid",
                "12345abcdfe");
        capabilities.setCapability("bundleId",
                "com.mobike.bike.company");  //直接测试，不自动安装
        capabilities.setCapability("newCommandTimeout",
                "600");
        capabilities.setCapability("noReset",
                true);
        capabilities.setCapability("autoAcceptAlerts",
                true);
        capabilities.setCapability("useNewWDA",
                true);
        capabilities.setCapability("xcodeOrgId",
                "***********");
        capabilities.setCapability("xcodeSigningId",
                "iPhone Developer");
        capabilities.setCapability("unicodeKeyboard",
                "True");
        capabilities.setCapability("resetKeyboard",
                "True");

        try {
            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 对外调用，提供获取driver渠道，并启动appium服务
     */
    public static void getDriver() {
        if (driver == null) {
            // port = getAppiumPort();
            //启动appium服务
            if (System.getProperty("os.name").contains("Mac")) {
                try {
                    String macCmdPath = "/usr/local/bin/appium";
                    Runtime.getRuntime().exec(
                            "/usr/bin/open -a Terminal " + macCmdPath);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                String cmdPath = "C:/Users/Administrator/AppData/Roaming/npm/appium.cmd";
                try {
                    Runtime.getRuntime().exec("cmd /c start " + cmdPath);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            SystemHelper.sleep(10);
        }
        //获取驱动
        if (SystemHelper.isAndroid()) {
            getAndroidDriver();
        }else{
            getIosDriver();
        }
    }

    public static AppiumDriver getAppiumDriver(){
        getDriver();
        return driver;
    }

}
