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

        InitProperties.init();

//        DriverFactory.getDriver();
//        DriverFactory.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Pages.getInstance().initPages();//DriverFactory.driver,timeOutDuration

        Operations.getInstance().initOperations();

    }

    @Test
    public void init(){

        System.out.println("***初始化成功***");

    }
}
