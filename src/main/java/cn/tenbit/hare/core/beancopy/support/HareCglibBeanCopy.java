package cn.tenbit.hare.core.beancopy.support;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.util.HareClassUtils;
import net.sf.cglib.beans.BeanCopier;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:24
 */
public class HareCglibBeanCopy<S, R> extends AbstractHareBeanCopy<S, R> implements HareBeanCopy<S, R> {

    @Override
    public R copy(S src, Class<R> retCLz, String... ignoreProperties) {
        BeanCopier beanCopier = findBeanCopier(src.getClass(), retCLz);
        R ret = HareClassUtils.newInstance(retCLz);
        beanCopier.copy(src, ret, null);
        return ret;
    }

    private static final Map<String, BeanCopier> CACHE = new ConcurrentHashMap<>();

    private static BeanCopier findBeanCopier(Class<?> s, Class<?> t) {
        String cacheKey = getCacheKey(s, t);
        BeanCopier beanCopier = CACHE.get(cacheKey);
        if (beanCopier == null) {
            CACHE.put(cacheKey, beanCopier = BeanCopier.create(s, t, false));
        }
        return beanCopier;
    }

    private static String getCacheKey(Class<?> s, Class<?> t) {
        return StringUtils.joinWith(HareConsts.UL, s.getCanonicalName(), t.getCanonicalName());
    }
}
