package cn.tenbit.hare.core.log.support;

import cn.tenbit.hare.core.log.HareLog;
import cn.tenbit.hare.core.support.HareExecCustomCode;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 11:24
 */
public abstract class AbstractHareLog implements HareLog {

    @Override
    public void trace(String s) {
        unsupported();
    }

    @Override
    public void trace(String s, Object... objs) {
        unsupported();
    }

    @Override
    public void trace(String s, Throwable t) {
        unsupported();
    }

    @Override
    public void debug(String s) {
        unsupported();
    }

    @Override
    public void debug(String s, Object... objs) {
        unsupported();
    }

    @Override
    public void debug(String s, Throwable t) {
        unsupported();
    }

    @Override
    public void info(String s) {
        unsupported();
    }

    @Override
    public void info(String s, Object... objs) {
        unsupported();
    }

    @Override
    public void info(String s, Throwable t) {
        unsupported();
    }

    @Override
    public void warn(String s) {
        unsupported();
    }

    @Override
    public void warn(String s, Object... objs) {
        unsupported();
    }

    @Override
    public void warn(String s, Throwable t) {
        unsupported();
    }

    @Override
    public void error(String s) {
        unsupported();
    }

    @Override
    public void error(String s, Object... objs) {
        unsupported();
    }

    @Override
    public void error(String s, Throwable t) {
        unsupported();
    }

    @Override
    public <T> T exportLog() {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }

    private void unsupported() {
        HareExecCustomCode.UNSUPPORTED.makeThrow();
    }
}
