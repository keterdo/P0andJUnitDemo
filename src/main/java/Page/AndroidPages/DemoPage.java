package Page.AndroidPages;

import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;

import java.util.List;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: pageObject 模式 demo
 */
@lombok.Data
public class DemoPage extends BasePage {

    @AndroidFindBy(id = "commit")
    public AndroidElement commit;

    @AndroidFindBys({@AndroidBy(className = "TextBox"),@AndroidBy(id = "input")})
    public MobileElement textBox;

    @AndroidFindAll({@AndroidBy(id = "label")})
    public List<MobileElement> labels;


    @AndroidFindBys({@AndroidBy(className = "mobileElement"),@AndroidBy(id = "input1")})
    public MobileElement mobileElement;

    @AndroidFindBy(id = "androidElement")
    public AndroidElement androidElement;

//    @iOSFindBy(className = "iosElement")
//    public IOSElement iosElement;
//
//    @iOSFindAll({@iOSBy(tagName = "list")})
//    public List<MobileElement> lMobileElement;








}
