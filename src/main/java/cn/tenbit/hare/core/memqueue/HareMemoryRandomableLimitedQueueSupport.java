package cn.tenbit.hare.core.memqueue;

import cn.tenbit.hare.core.util.HarePrintUtils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author bangquan.qian
 * @Date 2019-04-15 14:25
 */

public class HareMemoryRandomableLimitedQueueSupport<T extends Comparable> extends HareMemoryLimitedQueueSupport<T> {

    private int random = 3;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
        HarePrintUtils.jsonWithPrefixConsole(clzName, "setRandom", this.random);
    }

    public void randomOffer(T key) {
        if (key == null) {
            return;
        }

        int rand = (int) (ThreadLocalRandom.current().nextDouble() * random);
        if (rand != 0) {
            return;
        }

        offer(key);
    }
}
