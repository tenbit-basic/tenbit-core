package cn.tenbit.hare.core.util;

import cn.tenbit.hare.core.bean.Human;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 18:07
 */
public class TransformTest {

    @Test
    public void test() {
        List<Human> personList = Lists.newArrayList(
                Human.of(1L, "jack"),
                Human.of(2L, "tom"),
                Human.of(3L, "may")
        );

        Map<Long, Human> idMapHuman = HareTransformUtils.list2Map(personList, "id");
        HarePrintUtils.prettyJsonConsole(idMapHuman);

        List<String> nameList = HareTransformUtils.list2List(personList, "name");
        HarePrintUtils.prettyJsonConsole(nameList);
    }
}
