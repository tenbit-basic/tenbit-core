package cn.tenbit.hare.core;

import cn.tenbit.hare.core.exechain.HareExecuteChain;
import cn.tenbit.hare.core.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-19 17:04
 */
public class ExechainTest {

    @Test
    public void test() throws Exception {
        HareExecuteChain<StringBuilder> chain = HareExecuteChain.<StringBuilder>newBuilder()
                .then(e -> {
                    e.append("123");
                })
                .then(e -> {
                    e.append("abc");
                })
                .onFinally(e -> {
                    HarePrintUtils.console(e.toString());
                })
                .build();

        StringBuilder sb = new StringBuilder();
        chain.execute(sb);
    }
}
