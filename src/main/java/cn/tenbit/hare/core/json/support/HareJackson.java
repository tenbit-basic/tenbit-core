package cn.tenbit.hare.core.json.support;

import cn.tenbit.hare.core.common.constant.HareConsts;
import cn.tenbit.hare.core.exception.HareException;
import cn.tenbit.hare.core.json.HareJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 17:21
 */
public class HareJackson extends AbstractHareJson implements HareJson {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T parseJavaObject(String str, Class<T> clz) {
        try {
            return mapper.readValue(str, clz);
        } catch (IOException e) {
            throw HareException.of(e);
        }
    }

    @Override
    public <T> List<T> parseJavaArray(String str, Class<T> clz) {
        return super.parseJavaArray(str, clz);
    }

    @Override
    public String toJsonString(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw HareException.of(e);
        }
    }

    @Override
    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    public <T> T exportJson() {
        return (T) mapper;
    }
}
