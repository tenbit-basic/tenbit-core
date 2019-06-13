package cn.tenbit.hare.core.common.unify;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:15
 */
public class HareCommonHolder<T> {

    private T t;

    public HareCommonHolder(T t) {
        this.t = t;
    }

    public T getTarget() {
        return t;
    }
}
