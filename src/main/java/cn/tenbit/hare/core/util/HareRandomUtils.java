package cn.tenbit.hare.core.util;

import org.apache.commons.lang3.RandomUtils;

import java.util.*;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 15:22
 */
public class HareRandomUtils {

    public static int randomRangeInt(int original, int minus, int plus) {
        HareAssertUtils.isTrue(minus <= plus, "minus > plus");
        int result = (int) (Math.random() * (plus - minus + 1)) + minus;
        return original + result;
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static List<Integer> randomIntegerList(int size) {
        int[] arr = randomIntArray(size);
        List<Integer> lst = new ArrayList<>(arr.length);
        for (int idx = 0; idx < arr.length; idx++) {
            lst.add(arr[idx]);
        }
        return lst;
    }

    public static int[] randomIntArray(int size) {
        int[] arr = new int[size];
        for (int idx = 0; idx < size; idx++) {
            arr[idx] = RandomUtils.nextInt();
        }
        return arr;
    }

    public static List<Integer> randomNoRepeatIntegerList(int size) {
        Set<Integer> set = new HashSet<>(size);
        while (set.size() < size) {
            set.add(RandomUtils.nextInt());
        }
        return new ArrayList<>(set);
    }

    public static int[] randomNoRepeatIntArray(int size) {
        List<Integer> lst = randomNoRepeatIntegerList(size);
        int[] arr = new int[lst.size()];
        for (int idx = 0; idx < lst.size(); idx++) {
            arr[idx] = lst.get(idx);
        }
        return arr;
    }

    public static List<Integer> randomIntegerList(int size, int min, int max) {
        int[] arr = randomIntArray(size, min, max);
        List<Integer> lst = new ArrayList<>(arr.length);
        for (int idx = 0; idx < arr.length; idx++) {
            lst.add(arr[idx]);
        }
        return lst;
    }

    public static int[] randomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int idx = 0; idx < size; idx++) {
            arr[idx] = RandomUtils.nextInt(min, max);
        }
        return arr;
    }

    public static List<Integer> randomNoRepeatIntegerList(int size, int min, int max) {
        Set<Integer> set = new HashSet<>(size);
        while (set.size() < size) {
            set.add(RandomUtils.nextInt(min, max));
        }
        return new ArrayList<>(set);
    }

    public static int[] randomNoRepeatIntArray(int size, int min, int max) {
        List<Integer> lst = randomNoRepeatIntegerList(size, min, max);
        int[] arr = new int[lst.size()];
        for (int idx = 0; idx < lst.size(); idx++) {
            arr[idx] = lst.get(idx);
        }
        return arr;
    }
}
