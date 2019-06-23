package cn.tenbit.hare.core.memqueue;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author bangquan.qian
 * @Date 2019-04-15 14:12
 */
@Slf4j
public class HareMemoryLimitedQueueSupport<T extends Comparable> {

    protected String clzName = this.getClass().getSimpleName();

    private Set<T> queue = new ConcurrentSkipListSet<>();

    private AtomicInteger currentSize = new AtomicInteger(0);

    private AtomicBoolean lock = new AtomicBoolean(false);

    private int maxSize = 1024;

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int currentSize() {
        return currentSize.get();
    }

    public void batchOffer(List<T> elements) {
        if (CollectionUtils.isEmpty(elements)) {
            return;
        }

        for (T element : elements) {
            offer(element);
        }
    }

    public void offer(T element) {
        if (element == null) {
            return;
        }

        if (currentSize.get() >= maxSize) {
            // 溢出丢弃策略
            log.error("to the maximize queue size, data: " + JSON.toJSONString(element));
            return;
        }

        try {
            if (lock.get()) {
                return;
            }

            queue.add(element);
            currentSize.incrementAndGet();
        } catch (Exception e) {
            log.error(clzName + " offer error", e);
        }
    }

    public List<T> batchPoll(int expectSize) {
        if (expectSize < 1) {
            return Collections.emptyList();
        }

        try {
            if (lock.get()) {
                return Collections.emptyList();
            }

            lock.set(true);

            Set<T> elementSet = new HashSet<>(expectSize);
            for (T element : queue) {
                elementSet.add(element);
                if (elementSet.size() >= expectSize) {
                    break;
                }
            }

            for (T element : elementSet) {
                queue.remove(element);
                currentSize.decrementAndGet();
            }

            return new ArrayList<>(elementSet);
        } catch (Exception e) {
            log.error(clzName + " batchPoll error", e);
        } finally {
            lock.set(false);
        }

        return Collections.emptyList();
    }
}
