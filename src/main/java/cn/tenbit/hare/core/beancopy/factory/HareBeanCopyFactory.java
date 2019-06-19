package cn.tenbit.hare.core.beancopy.factory;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.beancopy.adaptor.HareBeanCopyAdaptor;
import cn.tenbit.hare.core.beancopy.constant.HareBeanCopyConsts;
import cn.tenbit.hare.core.beancopy.constant.HareBeanCopyTypeEnums;
import cn.tenbit.hare.core.beancopy.copier.HareCustomBeanCopier;
import cn.tenbit.hare.core.beancopy.support.HareCglibBeanCopy;
import cn.tenbit.hare.core.beancopy.support.HareCommonsBeanCopy;
import cn.tenbit.hare.core.beancopy.support.HareSpringBeanCopy;
import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.common.unify.HareCommonHolder;
import cn.tenbit.hare.core.util.HareAssertUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:39
 */
public class HareBeanCopyFactory {

    public static HareBeanCopy getBeanCopy() {
        return getBeanCopy(HareBeanCopyConsts.DEFAULT_BEAN_COPY);
    }

    public static HareBeanCopy getSpringBeanCopy() {
        return getBeanCopy(HareBeanCopyTypeEnums.SPRING_BEAN_UTILS);
    }

    public static HareBeanCopy getCglibBeanCopy() {
        return getBeanCopy(HareBeanCopyTypeEnums.CGLIB_BEAN_COPIER);
    }

    public static HareBeanCopy getCommonsBeanCopy() {
        return getBeanCopy(HareBeanCopyTypeEnums.COMMONS_BEAN_UTILS);
    }

    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    private static HareBeanCopy getBeanCopy(HareBeanCopyTypeEnums enu) {
        HareAssertUtils.notNull(enu);

        HareBeanCopy hareBeanCopy = null;
        switch (enu) {
            default:
                break;
            case CUSTOM:
                hareBeanCopy = new HareCustomBeanCopier();
                break;
            case CGLIB_BEAN_COPIER:
                hareBeanCopy = new HareCglibBeanCopy();
                break;
            case COMMONS_BEAN_UTILS:
                hareBeanCopy = new HareCommonsBeanCopy();
                break;
            case SPRING_BEAN_UTILS:
                hareBeanCopy = new HareSpringBeanCopy();
                break;
        }
        return new HareBeanCopyAdaptor(new HareCommonHolder<>(hareBeanCopy));
    }
}
