package Case;

import Operation.Operations;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: 测试用例的顶级父类
 */
public class BaseCase {

    //初始化驱动，并初始化所有operations
    public static Operations operations = Operations.getInstance();


    public BaseCase() {
//        System.out.println("basecase 构造");
        //init opreations
//        Operations.getInstance().initOperations(); //不能在这里调用初始化，否则会引起所有Basecase的子类 都会执行一遍此方法
    }


}
