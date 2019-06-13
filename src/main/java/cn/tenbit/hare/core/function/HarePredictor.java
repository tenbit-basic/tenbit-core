package cn.tenbit.hare.core.function;

/**
 * @Author bangquan.qian
 * @Date 2019-06-12 19:20
 */
@FunctionalInterface
public interface HarePredictor<T> {

    boolean test(T t);
}
