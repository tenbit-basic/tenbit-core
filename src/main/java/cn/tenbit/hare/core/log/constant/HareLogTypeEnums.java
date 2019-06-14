package cn.tenbit.hare.core.log.constant;

import cn.tenbit.hare.core.util.HareObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:28
 */
public enum HareLogTypeEnums {

    /**
     * normal console logger
     */
    CONSOLE(0),
    /**
     * java.util.logging
     */
    JUL(1),
    /**
     * apache.commons-logging
     */
    JCL(2),
    /**
     * slf4j
     */
    SLF4J(3),
    /**
     * log4j
     */
    LOG4J(4),
    /**
     * log4j2
     */
    LOG4J2(5),
    ;

    private int value;

    HareLogTypeEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static HareLogTypeEnums getEnum(Integer value) {
        return HareObjectUtils.ternary(value == null, null, getEnum(value.intValue()));
    }

    private static final Map<Integer, HareLogTypeEnums> MAP = new HashMap<>();

    static {
        for (HareLogTypeEnums enu : values()) {
            MAP.put(enu.getValue(), enu);
        }
    }

    public static HareLogTypeEnums getEnum(int value) {
        return MAP.get(value);
    }
}
