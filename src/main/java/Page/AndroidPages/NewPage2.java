package Page.AndroidPages;

import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by duzhe on 2018/10/27.
 *
 * @Description:
 */
public class NewPage2 extends BasePage {

    @AndroidFindBy(id = "com.xueqiu.android:id/user_profile_icon")
    public MobileElement myCenter;

    @AndroidFindBy(id = "com.xueqiu.android:id/tv_login")
    public AndroidElement login;

}
