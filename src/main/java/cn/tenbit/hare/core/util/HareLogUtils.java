package cn.tenbit.hare.core.util;

import cn.tenbit.hare.core.log.HareLog;
import cn.tenbit.hare.core.log.factory.HareLogFactory;
import org.apache.logging.log4j.Logger;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 11:59
 */
public class HareLogUtils {

    private static final HareLog LOG = HareLogFactory.getLogger();

    /**
     * default is Log4j2
     *
     * @see org.apache.logging.log4j.Logger
     * @see cn.tenbit.hare.core.log.constant.HareLogConsts#DEFAULT_LOG
     */
    public static Logger getLogger() {
        return LOG.exportLog();
    }

    public static void trace(String s) {
        LOG.trace(s);
    }

    public static void trace(String s, Object... objs) {
        LOG.trace(s, objs);
    }

    public static void trace(String s, Throwable t) {
        LOG.trace(s, t);
    }

    public static void debug(String s) {
        LOG.debug(s);
    }

    public static void debug(String s, Object... objs) {
        LOG.debug(s, objs);
    }

    public static void debug(String s, Throwable t) {
        LOG.debug(s, t);
    }

    public static void info(String s) {
        LOG.info(s);
    }

    public static void info(String s, Object... objs) {
        LOG.info(s, objs);
    }

    public static void info(String s, Throwable t) {
        LOG.info(s, t);
    }

    public static void warn(String s) {
        LOG.warn(s);
    }

    public static void warn(String s, Object... objs) {
        LOG.warn(s, objs);
    }

    public static void warn(String s, Throwable t) {
        LOG.warn(s, t);
    }

    public static void error(String s) {
        LOG.error(s);
    }

    public static void error(String s, Object... objs) {
        LOG.error(s, objs);
    }

    public static void error(String s, Throwable t) {
        LOG.error(s, t);
    }
}
