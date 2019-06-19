package cn.tenbit.hare.core.beancopy.constant;

import cn.tenbit.hare.core.util.HareObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:28
 */
public enum HareBeanCopyTypeEnums {

    /**
     * custom domain copier
     */
    CUSTOM(0),
    /**
     * spring.beanutils
     */
    SPRING_BEAN_UTILS(1),
    /**
     * apache.commons-beanutils
     */
    COMMONS_BEAN_UTILS(2),
    /**
     * cglib.beancopier
     */
    CGLIB_BEAN_COPIER(3),
    ;

    private int value;

    HareBeanCopyTypeEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static HareBeanCopyTypeEnums getEnum(Integer value) {
        return HareObjectUtils.ternary(value == null, null, getEnum(value.intValue()));
    }

    private static final Map<Integer, HareBeanCopyTypeEnums> MAP = new HashMap<>();

    static {
        for (HareBeanCopyTypeEnums enu : values()) {
            MAP.put(enu.getValue(), enu);
        }
    }

    public static HareBeanCopyTypeEnums getEnum(int value) {
        return MAP.get(value);
    }
}
