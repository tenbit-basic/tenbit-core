package cn.tenbit.hare.core.log.factory;

import cn.tenbit.hare.core.common.unify.HareCommonHolder;
import cn.tenbit.hare.core.log.HareLog;
import cn.tenbit.hare.core.log.adaptor.HareLogAdaptor;
import cn.tenbit.hare.core.log.constant.HareLogConsts;
import cn.tenbit.hare.core.log.constant.HareLogTypeEnums;
import cn.tenbit.hare.core.log.support.*;
import cn.tenbit.hare.core.util.HareAssertUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:34
 */
public class HareLogFactory {

    public static HareLog getLogger() {
        return getLogger(HareLogConsts.DEFAULT_LOG);
    }

    public static HareLog getSlf4jLogger() {
        return getLogger(HareLogTypeEnums.SLF4J);
    }

    public static HareLog getLog4jLogger() {
        return getLogger(HareLogTypeEnums.LOG4J);
    }

    public static HareLog getLog4j2Logger() {
        return getLogger(HareLogTypeEnums.LOG4J2);
    }

    public static HareLog getJulLogger() {
        return getLogger(HareLogTypeEnums.JUL);
    }

    public static HareLog getJclLogger() {
        return getLogger(HareLogTypeEnums.JCL);
    }

    public static HareLog getConsoleLogger() {
        return getLogger(HareLogTypeEnums.CONSOLE);
    }

    private static HareLog getLogger(HareLogTypeEnums enu) {
        HareAssertUtils.notNull(enu);

        HareLog hareLog = null;
        switch (enu) {
            default:
                break;
            case CONSOLE:
                hareLog = new HareConsoleLog();
                break;
            case JUL:
                hareLog = new HareJulLog();
                break;
            case JCL:
                hareLog = new HareJclLog();
                break;
            case LOG4J:
                hareLog = new HareLog4jLog();
                break;
            case LOG4J2:
                hareLog = new HareLog4j2Log();
                break;
            case SLF4J:
                hareLog = new HareSlf4jLog();
                break;
        }
        return new HareLogAdaptor(new HareCommonHolder<>(hareLog));
    }
}
