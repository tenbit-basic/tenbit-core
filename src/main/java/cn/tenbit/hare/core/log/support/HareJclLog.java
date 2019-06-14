package cn.tenbit.hare.core.log.support;

import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.log.HareLog;
import lombok.extern.apachecommons.CommonsLog;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:26
 */
@CommonsLog
public class HareJclLog extends AbstractHareLog implements HareLog {

    @Override
    public void trace(String s) {
        log.trace(s);
    }

    @Override
    public void trace(String s, Object... objs) {
        super.trace(s, objs);
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
        super.debug(s, objs);
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
        super.info(s, objs);
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
        super.warn(s, objs);
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
        super.error(s, objs);
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
