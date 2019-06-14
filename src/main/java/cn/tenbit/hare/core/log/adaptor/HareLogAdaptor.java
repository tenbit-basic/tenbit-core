package cn.tenbit.hare.core.log.adaptor;

import cn.tenbit.hare.core.common.unify.HareCommonHolder;
import cn.tenbit.hare.core.log.HareLog;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:33
 */
public class HareLogAdaptor implements HareLog {

    private HareCommonHolder<HareLog> holder;

    public HareLogAdaptor(HareCommonHolder<HareLog> holder) {
        this.holder = holder;
    }

    @Override
    public void trace(String s) {
        holder.getTarget().trace(s);
    }

    @Override
    public void trace(String s, Object... objs) {
        holder.getTarget().trace(s, objs);
    }

    @Override
    public void trace(String s, Throwable t) {
        holder.getTarget().trace(s, t);
    }

    @Override
    public void debug(String s) {
        holder.getTarget().debug(s);
    }

    @Override
    public void debug(String s, Object... objs) {
        holder.getTarget().debug(s, objs);
    }

    @Override
    public void debug(String s, Throwable t) {
        holder.getTarget().debug(s, t);
    }

    @Override
    public void info(String s) {
        holder.getTarget().info(s);
    }

    @Override
    public void info(String s, Object... objs) {
        holder.getTarget().info(s, objs);
    }

    @Override
    public void info(String s, Throwable t) {
        holder.getTarget().info(s, t);
    }

    @Override
    public void warn(String s) {
        holder.getTarget().warn(s);
    }

    @Override
    public void warn(String s, Object... objs) {
        holder.getTarget().warn(s, objs);
    }

    @Override
    public void warn(String s, Throwable t) {
        holder.getTarget().warn(s, t);
    }

    @Override
    public void error(String s) {
        holder.getTarget().error(s);
    }

    @Override
    public void error(String s, Object... objs) {
        holder.getTarget().error(s, objs);
    }

    @Override
    public void error(String s, Throwable t) {
        holder.getTarget().error(s, t);
    }

    @Override
    public <T> T exportLog() {
        return holder.getTarget().exportLog();
    }
}
