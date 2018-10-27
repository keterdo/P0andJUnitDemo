package Page.PO;

import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

/**
 * Created by duzhe on 2018/10/27.
 *
 * @Description:
 */
public class ZiXuanPage extends BasePage {

    @AndroidFindBy(id = "com.xueqiu.android:id/action_create_cube")
    public MobileElement searchButton;

    @AndroidFindBy(id = "com.xueqiu.android:id/edit_group")
    public MobileElement manage;

    @AndroidFindBy(id = "com.xueqiu.android:id/search_input_text")
    public MobileElement searchText;

    @AndroidFindAll({@AndroidBy(id = "com.xueqiu.android:id/stockName")})
    public List<MobileElement> gupiaoList;

    @AndroidFindBy(id = "com.xueqiu.android:id/action_close")
    public MobileElement quxiao;

    @AndroidFindAll({@AndroidBy(id = "com.xueqiu.android:id/portfolio_stockName")})
    public List<MobileElement> stockNames;


}
