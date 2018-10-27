package Operation.AndroidOperation;

import Operation.BaseOperation;

/**
 * Created by duzhe on 2018/10/27.
 *
 * @Description:
 */
public class NewDemoOperation extends BaseOperation {


    public void doingDemo(){
        pages.newDemo.myCenter.click();
        pages.newDemo.login.click();
    }


}
