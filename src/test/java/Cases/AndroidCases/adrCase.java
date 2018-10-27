package Cases.AndroidCases;

import Case.BaseCase;
import Driver.DriverFactory;
import Page.AndroidPages.NewDemo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;

import static Case.BaseCase.operations;

/**
 * Created by duzhe on 2018/10/16.
 *
 * @Description:
 */
public class adrCase {



    @Test
    public void demoXueQiu(){
        operations.newDemoOperation.doingDemo();
    }




}
