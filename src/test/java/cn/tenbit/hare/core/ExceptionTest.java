package cn.tenbit.hare.core;

import cn.tenbit.hare.core.exception.HareExecCode;
import cn.tenbit.hare.core.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-12 18:16
 */
public class ExceptionTest {

    @Test
    public void test() {
        HareExecCode execCode1 = HareExecCode.getExecCode(HareExecCode.CODE_FAILURE);
        HarePrintUtils.console(execCode1);

        HareExecCode execCode2 = HareExecCode.newFailure("test failure");
        HarePrintUtils.console(execCode2);

        HareExecCode execCode3 = HareExecCode.getExecCode(execCode2.getCode());
        HarePrintUtils.console(execCode3);

        int size = HareExecCode.size();
        HarePrintUtils.console(size);
    }
}
