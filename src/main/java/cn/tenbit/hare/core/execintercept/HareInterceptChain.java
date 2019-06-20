package cn.tenbit.hare.core.execintercept;

import cn.tenbit.hare.core.util.HareAssertUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-20 10:20
 */
public class HareInterceptChain<T> {

    private List<HareInterceptable<T>> interceptables = new ArrayList<>();

    private HareOnCatchInterceptable<T> onCatchInterceptable;

    private HareInterceptable<T> onFinallyInterceptable;

    private HareInterceptChain() {
    }

    public static <T> HareInterceptChainBuilder<T> newBuilder() {
        return new HareInterceptChainBuilder<>();
    }

    public static class HareInterceptChainBuilder<T> {

        private HareInterceptChain<T> chain = new HareInterceptChain<>();

        public HareInterceptChainBuilder<T> then(HareInterceptable<T> interceptable) {
            HareAssertUtils.notNull(interceptable);
            chain.interceptables.add(interceptable);
            return this;
        }

        public HareInterceptChainBuilder<T> onCatch(HareOnCatchInterceptable<T> interceptable) {
            HareAssertUtils.notNull(interceptable);
            HareAssertUtils.isTrue(chain.onCatchInterceptable == null, "onCatch already set");
            chain.onCatchInterceptable = interceptable;
            return this;
        }

        public HareInterceptChainBuilder<T> onFinally(HareInterceptable<T> interceptable) {
            HareAssertUtils.notNull(interceptable);
            HareAssertUtils.isTrue(chain.onFinallyInterceptable == null, "onFinally already set");
            chain.onFinallyInterceptable = interceptable;
            return this;
        }

        public HareInterceptChain<T> build() {
            return chain;
        }
    }

    public T execute(T target) throws Exception {
        HareAssertUtils.notNull(target);
        try {
            for (HareInterceptable<T> interceptable : interceptables) {
                HareAssertUtils.notNull(target);
                target = interceptable.intercept(target);
            }
        } catch (Throwable e) {
            if (onCatchInterceptable != null) {
                HareAssertUtils.notNull(target);
                onCatchInterceptable.intercept(target, e);
            } else {
                throw e;
            }
        } finally {
            if (onFinallyInterceptable != null) {
                HareAssertUtils.notNull(target);
                onFinallyInterceptable.intercept(target);
            }
        }
        return target;
    }
}
