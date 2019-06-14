package cn.tenbit.hare.core;

import cn.tenbit.hare.core.exception.HareException;
import cn.tenbit.hare.core.util.HareLogUtils;
import org.junit.Test;

import java.util.Date;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 12:04
 */
public class LogTest {

    @Test
    public void test() {
        HareLogUtils.trace("123");
        HareLogUtils.debug("123");
        HareLogUtils.info("123");
        HareLogUtils.warn("123");
        HareLogUtils.error("123");

        HareLogUtils.trace("123 {}", 1);
        HareLogUtils.debug("123 {}", "123");
        HareLogUtils.info("123 {}", new Date());
        HareLogUtils.warn("123 {}", new HareException("123"));
        HareLogUtils.error("123 {} {}", "1", "2");
    }
}
