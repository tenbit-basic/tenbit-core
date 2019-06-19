package cn.tenbit.hare.core.beancopy.factory;

import cn.tenbit.hare.core.beancopy.HareBeanCopy;
import cn.tenbit.hare.core.beancopy.constant.HareBeanCopyConsts;
import cn.tenbit.hare.core.beancopy.constant.HareBeanCopyTypeEnums;
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

    private static HareBeanCopy getBeanCopy(HareBeanCopyTypeEnums enu) {
        HareAssertUtils.notNull(enu);

        HareBeanCopy hareBeanCopy = null;
        switch (enu) {
            default:
                break;
            case CUSTOM:
                break;
            case CGLIB_BEAN_COPIER:
                break;
            case COMMONS_BEAN_UTILS:
                break;
            case SPRING_BEAN_UTILS:
                break;
        }
        return hareBeanCopy;
    }
}
