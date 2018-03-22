package data;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by duzhe on 2018/3/21.
 *
 * @Description:
 */
@RunWith(Parameterized.class)
public class ParameterDemo {
    public String num;    //传递参数
    public String index;
    public String acNum;  //预期结果

    public ParameterDemo(String num,String index,String acNum){
        this.num = num;
        this.index = index;
        this.acNum = acNum;
    }

    public ParameterDemo(){

    }

    @Parameterized.Parameters
    public static Collection<String []> getParams(){
        return Arrays.asList(new String [][]{
                {"100","0","100"},
                {"-1","1","0"},
                {"-100","2","0"},
        });
    }
}
