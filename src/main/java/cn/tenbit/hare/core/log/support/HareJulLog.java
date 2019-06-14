package cn.tenbit.hare.core.log.support;

import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.log.HareLog;
import lombok.extern.java.Log;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:26
 */
@Log
public class HareJulLog extends AbstractHareLog implements HareLog {

    @Override
    public void trace(String s) {
        log.fine(s);
    }

    @Override
    public void debug(String s) {
        log.config(s);
    }

    @Override
    public void info(String s) {
        log.info(s);
    }

    @Override
    public void warn(String s) {
        log.warning(s);
    }

    @Override
    public void error(String s) {
        log.severe(s);
    }

    @Override
    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    public <T> T exportLog() {
        return (T) log;
    }
}
