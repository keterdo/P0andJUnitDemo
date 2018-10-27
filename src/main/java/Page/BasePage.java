package Page;

import Driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/3/21.
 *
 * @Description:
 */
public class BasePage {

    public static AppiumDriver driver = DriverFactory.getAppiumDriver();


    //超时时间
    private final int TIMEOUT = 10;
    TimeOutDuration timeOutDuration = new TimeOutDuration(10, TimeUnit.SECONDS);

    public BasePage(){
//        System.out.println("BasePage 构造");
        //初始化所有元素
//        System.out.println("initEelments ");

//      PageFactory.initElements(new AppiumFieldDecorator(driver,timeOutDuration) , demoPage);

        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOutDuration) , this);
//        System.out.println(this.getClass());
//        System.out.println("initEelments done");
    }

//    public static void setDriver(AppiumDriver d) {
//        driver = d;
//    }




}
