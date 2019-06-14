package cn.tenbit.hare.core.json.factory;

import cn.tenbit.hare.core.common.unify.HareCommonHolder;
import cn.tenbit.hare.core.json.HareJson;
import cn.tenbit.hare.core.json.adaptor.HareJsonAdaptor;
import cn.tenbit.hare.core.json.constant.HareJsonConsts;
import cn.tenbit.hare.core.json.constant.HareJsonTypeEnums;
import cn.tenbit.hare.core.json.support.HareCustomJson;
import cn.tenbit.hare.core.json.support.HareFastJson;
import cn.tenbit.hare.core.json.support.HareGson;
import cn.tenbit.hare.core.json.support.HareJackson;
import cn.tenbit.hare.core.util.HareAssertUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 16:17
 */
public class HareJsonFactory {

    public static HareJson getJson() {
        return getJson(HareJsonConsts.DEFAULT_JSON);
    }

    public static HareJson getFastJson() {
        return getJson(HareJsonTypeEnums.FASTJSON);
    }

    public static HareJson getGson() {
        return getJson(HareJsonTypeEnums.GSON);
    }

    public static HareJson getJackson() {
        return getJson(HareJsonTypeEnums.JACKSON);
    }

    public static HareJson getCustom() {
        return getJson(HareJsonTypeEnums.CUSTOM);
    }

    private static HareJson getJson(HareJsonTypeEnums enu) {
        HareAssertUtils.notNull(enu);

        HareJson hareJson = null;
        switch (enu) {
            default:
                break;
            case CUSTOM:
                hareJson = new HareCustomJson();
                break;
            case JACKSON:
                hareJson = new HareJackson();
                break;
            case GSON:
                hareJson = new HareGson();
                break;
            case FASTJSON:
                hareJson = new HareFastJson();
                break;
        }
        return new HareJsonAdaptor(new HareCommonHolder<>(hareJson));
    }
}
