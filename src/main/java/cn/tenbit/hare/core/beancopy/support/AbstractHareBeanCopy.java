package cn.tenbit.hare.core.beancopy.support;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.support.HareExecCustomCode;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:43
 */
public class AbstractHareBeanCopy<S, R> implements HareBeanCopy<S, R> {

    @Override
    public R copy(S src,Class<R> retCLz,  String... ignoreProperties) {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }
}
