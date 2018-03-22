package Operation;


import Page.Pages;

/**
 * Created by duzhe on 2018/3/20.
 *
 * @Description: Operation父类，负责统一初始化所有PageObject，无需单独初始化，供子类调用
 */
public class BaseOperation {

    public static Pages pages = Pages.getInstance(); ;

    public BaseOperation(){
//        System.out.println("BaseOperation 构造");
//
//        Page.getInstance().initPages(); //不能再次调用，否则会引起所有BaseOperation的子类，都会调用一遍此方法
    }

}
