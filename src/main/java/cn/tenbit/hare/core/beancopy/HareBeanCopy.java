package cn.tenbit.hare.core.beancopy;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 14:10
 */
public interface HareBeanCopy<S, R> {

    R copy(S src, Class<R> retCLz, String... ignoreProperties);
}
