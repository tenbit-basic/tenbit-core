package cn.tenbit.hare.core;

import cn.tenbit.hare.core.domain.Human;
import cn.tenbit.hare.core.util.HareJsonUtils;
import cn.tenbit.hare.core.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 19:10
 */
public class JsonTest {

    @Test
    public void test() {
        Human human = Human.of(1L, "jack");

        String string = HareJsonUtils.toJsonString(human);
        HarePrintUtils.console(string);

        human = HareJsonUtils.parseJavaObject(string, Human.class);
        HarePrintUtils.prettyJsonConsole(human);

        HarePrintUtils.jsonWithPrefixConsole("json", human);
    }
}
