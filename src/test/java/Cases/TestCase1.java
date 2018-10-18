package Cases;

import Case.BaseCase;
import Page.AndroidPages.DemoPage;
import org.junit.Test;

/**
 * Created by duzhe on 2018/3/21.
 *
 * @Description:
 */
public class TestCase1 extends BaseCase {

    /**
     * PO + 分层后的demo写法
     */
    @Test
    public void test1() {
        operations.mobikeOperation.clickJNYJ();
    }

}