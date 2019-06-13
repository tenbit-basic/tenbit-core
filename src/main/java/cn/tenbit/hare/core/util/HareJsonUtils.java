package cn.tenbit.hare.core.util;

import cn.tenbit.hare.core.json.HareJson;
import cn.tenbit.hare.core.json.factory.HareJsonFactory;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 17:57
 */
public class HareJsonUtils {

    private static final HareJson HARE_JSON = HareJsonFactory.getJson();

    public static String toJsonString(Object obj) {
        return HARE_JSON.toJsonString(obj);
    }

    public static <T> T parseJavaObject(String str, Class<T> clz) {
        return HARE_JSON.parseJavaObject(str, clz);
    }

    public static <T> List<T> parseJavaArray(String str, Class<T> clz) {
        return HARE_JSON.parseJavaArray(str, clz);
    }

    public static String toJsonString(Object obj, SerializerFeature... features) {
        return JSON.toJSONString(obj, features);
    }
}
