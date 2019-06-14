package cn.tenbit.hare.core.common.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:26
 */
public interface HareConsts {

    String EMPTY = StringUtils.EMPTY;

    String SPACE = StringUtils.SPACE;

    String NL = System.getProperty("line.separator", "\n");

    String SUPPRESS_WARNING_UNCHECKED = "unchecked";
    String SUPPRESS_WARNING_RAWTYPE = "rawtype";
    String SUPPRESS_WARNING_DEPRECATION = "deprecation";
}
