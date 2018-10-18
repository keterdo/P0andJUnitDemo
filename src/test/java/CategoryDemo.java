
import Cases.ParameterizedDemo;
import Cases.DemoCase3;
import AnyCategory.AllTests;
import AnyCategory.SmokeTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by duzhe on 2018/3/20.
 *
 * @Description:
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(AllTests.class)
@Categories.ExcludeCategory(SmokeTests.class)
@Suite.SuiteClasses({
        ParameterizedDemo.class,
        DemoCase3.class
})
public class CategoryDemo {



}
