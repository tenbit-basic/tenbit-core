package cn.tenbit.hare.core.execintercept;

/**
 * @Author bangquan.qian
 * @Date 2019-06-20 10:40
 */
@FunctionalInterface
public interface HareOnCatchInterceptable<T> {

    T intercept(T target, Throwable e);
}
