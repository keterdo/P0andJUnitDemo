import Cases.TestCase1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description:
 */
@RunWith(Suite.class)   //组件运行器，Suite、SpringJUnit4ClassRunner等
@Suite.SuiteClasses(
        {
                //预加载类
                InitTestResources.class,
                //测试用例类
                TestCase1.class
        }
)
public class JunitSuite {



}
