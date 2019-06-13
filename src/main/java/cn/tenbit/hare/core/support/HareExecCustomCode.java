package cn.tenbit.hare.core.support;

import cn.tenbit.hare.core.exception.HareExecCode;

/**
 * @Author bangquan.qian
 * @Date 2019-06-13 18:38
 */
public interface HareExecCustomCode {

    HareExecCode UNSUPPORTED = HareExecCode.newFailure("unsupported");
}
