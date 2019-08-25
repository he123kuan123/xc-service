package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;
import javassist.expr.Cast;

/**
 * @Auther: hekuan
 * @Date: 2019/7/28 0028 16:46
 * @Description:
 */
public class ExceptionCast {

    public static void cast(ResultCode resultCode){
            throw new CustomException(resultCode);
    }
}
