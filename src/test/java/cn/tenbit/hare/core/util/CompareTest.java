package cn.tenbit.hare.core.util;

import cn.tenbit.hare.core.util.HareCompareUtils;
import cn.tenbit.hare.core.util.HarePrintUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 19:15
 */
public class CompareTest {

    @Test
    public void test() {
        boolean res = HareCompareUtils.gt(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.ge(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.eq(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.ne(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.lt(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.le(0L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        HarePrintUtils.console("-------------------------------------------------");

        res = HareCompareUtils.ge(10000L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.eq(10000L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.ne(10000L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.lt(10000L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        res = HareCompareUtils.le(10000L, NumberUtils.LONG_ZERO);
        HarePrintUtils.console(res);

        HarePrintUtils.console("-------------------------------------------------");

        res = HareCompareUtils.ge(10000L, 10001L);
        HarePrintUtils.console(res);

        res = HareCompareUtils.eq(10000L, 10001L);
        HarePrintUtils.console(res);

        res = HareCompareUtils.ne(10000L, 10001L);
        HarePrintUtils.console(res);

        res = HareCompareUtils.lt(10000L, 10001L);
        HarePrintUtils.console(res);

        res = HareCompareUtils.le(10000L, 10001L);
        HarePrintUtils.console(res);
    }
}
