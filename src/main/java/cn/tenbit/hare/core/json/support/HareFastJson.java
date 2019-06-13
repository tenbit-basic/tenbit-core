package cn.tenbit.hare.core.json.support;

import cn.tenbit.hare.core.json.HareJson;
import cn.tenbit.hare.core.support.HareExecCustomCode;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 17:21
 */
public class HareFastJson implements HareJson {

    @Override
    public <T> T parseJavaObject(String str, Class<T> clz) {
        return JSON.parseObject(str, clz);
    }

    @Override
    public <T> List<T> parseJavaArray(String str, Class<T> clz) {
        return JSON.parseArray(str, clz);
    }

    @Override
    public String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public <T> T exportJson() {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }
}
