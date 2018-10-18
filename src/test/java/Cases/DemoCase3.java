package Cases;

import Case.BaseCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by duzhe on 2018/3/20.
 *
 * @Description:
 */
public class DemoCase3 extends BaseCase {



    @Test
    @Category(AnyCategory.SmokeTests.class)
    public void case2(){
        operations.demoOperation.operationTest("");
        Assert.assertEquals(operations.demoOperation.getResult(1),"");
    }

}
