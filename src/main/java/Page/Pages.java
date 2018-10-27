package Page;


import Page.AndroidPages.DemoPage;
import Page.AndroidPages.MobikePage;
import Page.AndroidPages.NewDemo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by duzhe on 2018/3/20.
 *
 * @Description: pages集合，负责初始化所有page,及其内所有元素
 */
public class Pages {

    private static Pages page;

    public static Pages getInstance(){
        System.out.println("Page instance");
        if(page == null){
            page = new Pages();
//            initPages();
        }
        return page;
    }

    public static DemoPage demoPage;
    public static MobikePage mobikePage;
    public static NewDemo newDemo;

//    TimeOutDuration timeOutDuration = new TimeOutDuration(5, TimeUnit.SECONDS);

    /**
     * 初始化所有页面对象，及其内部元素
     */
    public static void initPages(){
        System.out.println("in initPages");

        mobikePage = new MobikePage();
        demoPage = new DemoPage();
        newDemo = new NewDemo();

//        System.out.println("out initPages");
        /**
         * 初始化所有page内元素
         */
//        PageFactory.initElements(new AppiumFieldDecorator(driver), DemoPage.class);
//        System.out.println("init Page");
////        PageFactory.initElements(new AppiumFieldDecorator(driver), MobikePage.class);
//        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOutDuration),MobikePage.class);


    }

}
