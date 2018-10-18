package Operation.AndroidOperation;

import Operation.BaseOperation;

/**
 * Created by duzhe on 2018/3/19.
 *
 * @Description: 操作逻辑层
 */
public class DemoOperation extends BaseOperation {


    /**
     * 举例：输入框输入值，并点击提交按钮
     * @param num
     */
    public void operationTest(String num){
        pages.demoPage.textBox.sendKeys(num);
        pages.demoPage.commit.click();
    }

    /**
     * 举例：获取某label显示内容
     * @param index
     * @return
     */
    public String getResult(int index){
        return pages.demoPage.labels.get(index).getText();
    }

}
