package cn.tenbit.hare.core.exechain;

/**
 * @Author bangquan.qian
 * @Date 2019-04-15 23:44
 */
@FunctionalInterface
public interface HareExecutable<T> {

    void execute(T target) throws Exception;
}
