package cn.tenbit.hare.core.util;

import org.junit.Test;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-23 17:07
 */
public class RandomTest {

    @Test
    public void test() {
        List<Integer> list = HareRandomUtils.randomNoRepeatIntegerList(5, 0, 100);
        HarePrintUtils.jsonConsole(list);
    }
}
