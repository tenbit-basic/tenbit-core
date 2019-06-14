package cn.tenbit.hare.core.json.support;

import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.json.HareJson;
import com.google.gson.Gson;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 17:21
 */
public class HareGson extends AbstractHareJson implements HareJson {

    private Gson gson = new Gson();

    @Override
    public <T> T parseJavaObject(String str, Class<T> clz) {
        return gson.fromJson(str, clz);
    }

    @Override
    public <T> List<T> parseJavaArray(String str, Class<T> clz) {
        return super.parseJavaArray(str, clz);
    }

    @Override
    public String toJsonString(Object obj) {
        return gson.toJson(obj);
    }

    @Override
    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    public <T> T exportJson() {
        return (T) gson;
    }
}
