package Case;

import Driver.DriverFactory;
import Operation.Operations;
import Page.Pages;
import Util.InitProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.TimeOutDuration;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: 测试用例的顶级父类
 */
public class BaseCase {


    public static Operations operations;

    public BaseCase() {
    }

    @Before
    public void setUp(){
        //初始化驱动，并初始化所有operations
        operations = Operations.getInstance();
        InitProperties.init();

        DriverFactory.getDriver();
        DriverFactory.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TimeOutDuration timeOutDuration = new TimeOutDuration(10, TimeUnit.SECONDS);

        Pages.getInstance().initPages(DriverFactory.driver,timeOutDuration);

        Operations.getInstance().initOperations();
    }

    @After
    public void shutDown(){
        DriverFactory.driver.quit();
    }
}
