package Cases;

import Case.BaseCase;
import data.ParameterDemo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: 测试用例demo
 */
@RunWith(Parameterized.class)
//@Category({DemoCategory.AllTests.class, DemoCategory.SmokeTests.class})
public class ParameterizedDemo extends BaseCase{ //

    public String num;    //传递参数
    public String index;
    public String acNum;  //预期结果

    public ParameterizedDemo(String num, String index, String acNum){
        this.num = num;
        this.index = index;
        this.acNum = acNum;
    }

    @Parameterized.Parameters()
    public static Collection<String []> getParams(){
        return Arrays.asList(new String [][]{
                {"1","1","1"},
                {"2","2","1"},
                {"3","3","1"}
        });
    }

    /**
     * Case Start
     */

    @Category(DemoCategory.AllTests.class)
    @Test
    public void case1(){
        operations.demoOperation.operationTest(this.num);
        String result = operations.demoOperation.getResult(Integer.parseInt(index));
        Assert.assertEquals(acNum,result);
    }

//    ParameterDemo data = new ParameterDemo();
//
//    @Test
//    public void case2(){
//        System.out.println("----------------------------");
//        Assert.assertEquals(data.num,data.acNum); //just a test
//    }

}
