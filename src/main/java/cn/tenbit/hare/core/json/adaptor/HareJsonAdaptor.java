package cn.tenbit.hare.core.json.adaptor;

import cn.tenbit.hare.core.common.unify.HareCommonHolder;
import cn.tenbit.hare.core.json.HareJson;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:21
 */
public class HareJsonAdaptor implements HareJson {

    private HareCommonHolder<HareJson> holder;

    public HareJsonAdaptor(HareCommonHolder<HareJson> holder) {
        this.holder = holder;
    }

    @Override
    public <T> T parseJavaObject(String str, Class<T> clz) {
        return holder.getTarget().parseJavaObject(str, clz);
    }

    @Override
    public <T> List<T> parseJavaArray(String str, Class<T> clz) {
        return holder.getTarget().parseJavaArray(str, clz);
    }

    @Override
    public String toJsonString(Object obj) {
        return holder.getTarget().toJsonString(obj);
    }

    @Override
    public <T> T exportJson() {
        return holder.getTarget().exportJson();
    }
}
