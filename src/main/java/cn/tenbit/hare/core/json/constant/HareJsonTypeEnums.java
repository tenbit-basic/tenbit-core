package cn.tenbit.hare.core.json.constant;

import cn.tenbit.hare.core.util.HareObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:28
 */
public enum HareJsonTypeEnums {

    JACKSON(0),
    GSON(1),
    FASTJSON(2),
    ;

    private int value;

    HareJsonTypeEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static HareJsonTypeEnums getEnum(Integer value) {
        return HareObjectUtils.ternary(value == null, null, getEnum(value.intValue()));
    }

    private static final Map<Integer, HareJsonTypeEnums> MAP = new HashMap<>();

    static {
        for (HareJsonTypeEnums enu : values()) {
            MAP.put(enu.getValue(), enu);
        }
    }

    public static HareJsonTypeEnums getEnum(int value) {
        return MAP.get(value);
    }
}
