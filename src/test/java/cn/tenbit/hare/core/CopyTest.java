package cn.tenbit.hare.core;

import cn.tenbit.hare.core.domain.Human;
import cn.tenbit.hare.core.domain.Person;
import cn.tenbit.hare.core.util.HareBeanUtils;
import cn.tenbit.hare.core.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 17:57
 */
public class CopyTest {

    @Test
    public void test() {
        Person person = Person.of(1L, "jack", "programmer");
        Human human = HareBeanUtils.copyObject(person, Human.class);
        HarePrintUtils.console(person);
        HarePrintUtils.jsonConsole(person);

        HarePrintUtils.console(human);
        HarePrintUtils.jsonConsole(human);
    }
}
