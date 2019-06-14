package cn.tenbit.hare.core.json.support;

import cn.tenbit.hare.core.json.HareJson;
import cn.tenbit.hare.core.support.HareExecCustomCode;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-14 11:20
 */
public abstract class AbstractHareJson implements HareJson {

    @Override
    public <T> T parseJavaObject(String str, Class<T> clz) {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }

    @Override
    public <T> List<T> parseJavaArray(String str, Class<T> clz) {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }

    @Override
    public String toJsonString(Object obj) {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }

    @Override
    public <T> T exportJson() {
        throw HareExecCustomCode.UNSUPPORTED.newException();
    }
}
