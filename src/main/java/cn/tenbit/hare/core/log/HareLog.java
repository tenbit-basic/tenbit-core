package cn.tenbit.hare.core.log;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 10:18
 */
public interface HareLog {

    void trace(String s);

    void trace(String s, Object... objs);

    void trace(String s, Throwable t);

    void debug(String s);

    void debug(String s, Object... objs);

    void debug(String s, Throwable t);

    void info(String s);

    void info(String s, Object... objs);

    void info(String s, Throwable t);

    void warn(String s);

    void warn(String s, Object... objs);

    void warn(String s, Throwable t);

    void error(String s);

    void error(String s, Object... objs);

    void error(String s, Throwable t);

    <T> T exportLog();
}
