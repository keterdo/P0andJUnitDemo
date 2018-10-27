package Operation;

import Operation.AndroidOperation.DemoOperation;
import Operation.AndroidOperation.MobikeOperation;
import Operation.AndroidOperation.NewDemoOperation;

/**
 * Created by duzhe on 2018/3/20.
 *
 * @Description:初始化所有opreations
 */
public class Operations extends BaseOperation {

    private static Operations operations;

    public static DemoOperation demoOperation;
    public static MobikeOperation mobikeOperation;
    public static NewDemoOperation newDemoOperation;

    public static Operations getInstance(){
        if(operations == null){
            operations = new Operations();
        }
        return operations;
    }


    public static void initOperations(){
        demoOperation = new DemoOperation();
        mobikeOperation = new MobikeOperation();
        newDemoOperation = new NewDemoOperation();
    }

}
