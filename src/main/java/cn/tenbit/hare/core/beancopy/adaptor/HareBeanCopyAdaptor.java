package cn.tenbit.hare.core.beancopy.adaptor;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.beancopy.support.AbstractHareBeanCopy;
import cn.tenbit.hare.core.common.unify.HareCommonHolder;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:38
 */
public class HareBeanCopyAdaptor<S, R> extends AbstractHareBeanCopy<S, R> implements HareBeanCopy<S, R> {

    private HareCommonHolder<HareBeanCopy<S, R>> holder;

    public HareBeanCopyAdaptor(HareCommonHolder<HareBeanCopy<S, R>> holder) {
        this.holder = holder;
    }

    @Override
    public R copy(S src, Class<R> retCLz, String... ignoreProperties) {
        return holder.getTarget().copy(src, retCLz, ignoreProperties);
    }
}
