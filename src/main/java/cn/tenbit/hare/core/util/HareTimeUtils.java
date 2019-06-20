package cn.tenbit.hare.core.util;

import cn.tenbit.hare.core.common.constant.HareConsts;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 15:46
 */
public class HareTimeUtils {

    private static final DateTimeFormatter formatter = DateTimeFormat.forPattern(HareConsts.PRINT_DATE_PATTERN);

    public static String currentFormatTime() {
        return formatter.print(currentTimeMillis());
    }

    public static String currentTimeMillisString() {
        return HareStringUtils.toNotNullString(currentTimeMillis());
    }

    public static Long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
