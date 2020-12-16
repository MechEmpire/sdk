package com.mechempire.sdk.util;

/**
 * package: com.mechempire.sdk.util
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/16 上午11:35
 */
public class ClassCastUtil {

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object object) {
        return (T) object;
    }
}