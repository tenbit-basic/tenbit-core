package cn.tenbit.hare.core.log.support;

import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.log.HareLog;
import lombok.extern.log4j.Log4j2;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:26
 */
@Log4j2
public class HareLog4j2Log extends AbstractHareLog implements HareLog {

    @Override
    public void trace(String s) {
        log.trace(s);
    }

    @Override
    public void trace(String s, Object... objs) {
        log.trace(s, objs);
    }

    @Override
    public void trace(String s, Throwable t) {
        log.trace(s, t);
    }

    @Override
    public void debug(String s) {
        log.debug(s);
    }

    @Override
    public void debug(String s, Object... objs) {
        log.debug(s, objs);
    }

    @Override
    public void debug(String s, Throwable t) {
        log.debug(s, t);
    }

    @Override
    public void info(String s) {
        log.info(s);
    }

    @Override
    public void info(String s, Object... objs) {
        log.info(s, objs);
    }

    @Override
    public void info(String s, Throwable t) {
        log.info(s, t);
    }

    @Override
    public void warn(String s) {
        log.warn(s);
    }

    @Override
    public void warn(String s, Object... objs) {
        log.warn(s, objs);
    }

    @Override
    public void warn(String s, Throwable t) {
        log.warn(s, t);
    }

    @Override
    public void error(String s) {
        log.error(s);
    }

    @Override
    public void error(String s, Object... objs) {
        log.error(s, objs);
    }

    @Override
    public void error(String s, Throwable t) {
        log.error(s, t);
    }

    @Override
    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    public <T> T exportLog() {
        return (T) log;
    }
}
