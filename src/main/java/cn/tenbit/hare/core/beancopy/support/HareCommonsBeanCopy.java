package cn.tenbit.hare.core.beancopy.support;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.exception.HareException;
import cn.tenbit.hare.core.util.HareClassUtils;
import org.apache.commons.beanutils.BeanUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:24
 */
public class HareCommonsBeanCopy<S, R> extends AbstractHareBeanCopy<S, R> implements HareBeanCopy<S, R> {

    @Override
    public R copy(S src, Class<R> retCLz, String... ignoreProperties) {
        R ret = HareClassUtils.newInstance(retCLz);
        try {
            BeanUtils.copyProperties(ret, src);
        } catch (Exception e) {
            throw HareException.of(e);
        }
        return ret;
    }
}
