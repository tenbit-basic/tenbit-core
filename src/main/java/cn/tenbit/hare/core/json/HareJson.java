package cn.tenbit.hare.core.json;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:11
 */
public interface HareJson {

    <T> T parseJavaObject(String str, Class<T> clz);

    <T> List<T> parseJavaArray(String str, Class<T> clz);

    String toJsonString(Object obj);

    <T> T exportJson();
}
