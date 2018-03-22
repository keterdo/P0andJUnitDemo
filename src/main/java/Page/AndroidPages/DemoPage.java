package Page.AndroidPages;

import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: pageObject 模式 demo
 */
public class DemoPage extends BasePage {

    @AndroidFindBy(id = "commit")
    public AndroidElement commit;

    @AndroidFindBys({@AndroidBy(className = "TextBox"),@AndroidBy(id = "input")})
    public MobileElement textBox;

    @AndroidFindAll({@AndroidBy(id = "label")})
    public List<MobileElement> labels;




    public MobileElement getCommit() {
        return commit;
    }

    public MobileElement getTextBox() {
        return textBox;
    }

    public List<MobileElement> getLabels(){
        return labels;
    }

}
