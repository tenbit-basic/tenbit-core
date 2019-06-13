package cn.tenbit.hare.core;

import cn.tenbit.hare.core.util.HareJsonUtils;
import cn.tenbit.hare.core.util.HarePrintUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 19:10
 */
public class JsonTest {

    @Test
    public void test() {
        Person person = Person.of(1L, "jack");

        String string = HareJsonUtils.toJsonString(person);
        HarePrintUtils.console(string);

        person = HareJsonUtils.parseJavaObject(string, Person.class);
        HarePrintUtils.prettyJsonConsole(person);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor(staticName = "of")
    private static class Person {
        private Long id;
        private String name;
    }
}
