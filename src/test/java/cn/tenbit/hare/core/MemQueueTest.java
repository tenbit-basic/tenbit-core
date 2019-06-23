package cn.tenbit.hare.core;

import cn.tenbit.hare.core.memqueue.HareMemoryLimitedQueue;
import cn.tenbit.hare.core.util.HarePrintUtils;
import cn.tenbit.hare.core.util.HareRandomUtils;
import cn.tenbit.hare.core.util.HareSleepUtils;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author bangquan.qian
 * @Date 2019-06-23 16:51
 */
public class MemQueueTest {

    @Test
    public void test() throws InterruptedException {
        HareMemoryLimitedQueue<Integer> queue = new HareMemoryLimitedQueue<>();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> {
            while (true) {
                queue.batchOffer(HareRandomUtils.randomNoRepeatIntegerList(10));
                HareSleepUtils.sleep(TimeUnit.MILLISECONDS, 300);
            }
        });

        executorService.execute(() -> {
            while (true) {
                queue.batchPoll(10);
                HareSleepUtils.sleep(TimeUnit.MILLISECONDS, 100);
            }
        });

        executorService.execute(() -> {
            while (true) {
                HarePrintUtils.console("queue size: " + queue.currentSize());
                HareSleepUtils.sleep(TimeUnit.SECONDS, 1);
            }
        });

        executorService.awaitTermination(60, TimeUnit.SECONDS);
    }
}
