import Driver.DriverFactory;
import Operation.Operations;
import Page.Pages;
import Util.InitProperties;
import io.appium.java_client.pagefactory.TimeOutDuration;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/3/22.
 *
 * @Description:
 */
public class InitTestResources {
    private static TimeOutDuration timeOutDuration = new TimeOutDuration(10, TimeUnit.SECONDS);
    @Before
    public void initEvery(){

//        System.out.println("init properties");
        InitProperties.init();

//        System.out.println("init driver");
        DriverFactory.getDriver();
        DriverFactory.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        UIPages.setOperationDriver(DriverFactory.driver);
//        System.out.println("Driver done");``


//        System.out.println("initPages");
        Pages.getInstance().initPages(DriverFactory.driver,timeOutDuration);
//        System.out.println("initOperations");
        Operations.getInstance().initOperations();
    }

    @Test
    public void init(){

    }
}
