package Cases.AndroidCases;

import Page.PO.DetailsPage;
import Page.PO.MainPage;
import Page.PO.ZiXuanPage;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by duzhe on 2018/10/27.
 *
 * @Description:
 */
@RunWith(Parameterized.class)
public class XueqiuCase {

    MainPage mainPage = new MainPage();
    ZiXuanPage ziXuanPage = new ZiXuanPage();
    DetailsPage detailsPage = new DetailsPage();

    /****
     * 数据驱动
     */
    public String stockName;
    public String count;

    public XueqiuCase(String stockName,String count){
        this.stockName = stockName;
        this.count = count;
    }

    @Parameterized.Parameters()
    public static Collection<String []> getParams(){
        return Arrays.asList(new String [][]{
                {"中国平安","1"},
                {"华夏银行","2"},
                {"贵州茅台","3"}
        });
    }
    /*** end ***/


    @Test
    public void addGuanzhu(){

        mainPage.zixuan.click();
        ziXuanPage.searchButton.click();
        ziXuanPage.searchText.sendKeys(stockName);
        if(ziXuanPage.gupiaoList.size() > 0) {
            ziXuanPage.gupiaoList.get(0).click();
        }else{
            ziXuanPage.searchText.sendKeys("中国平安"); //万一关键字搜索无结果，保底方案
            ziXuanPage.gupiaoList.get(0).click();
        }
        System.out.println(detailsPage.sheZixuan.size());
        for(MobileElement mobileElement : detailsPage.sheZixuan){

            if(mobileElement.getText().equals("加自选")){
                mobileElement.click();
            }
        }
//        if(detailsPage.haoping.isEnabled()) {
//            detailsPage.haoping.click();
//        }
        detailsPage.backButton.click();
        ziXuanPage.quxiao.click();
        Assert.assertEquals(ziXuanPage.stockNames.size(),Integer.parseInt(count));
    }

//    @Test
//    public void test2(){
//        mainPage.xueqiu.click();
//        ziXuanPage.manage.click();
//    }
}
