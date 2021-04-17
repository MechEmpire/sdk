package com.mechempire.sdk.util;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * package: com.mechempire.sdk.util
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2021/4/3 下午10:39
 */
public class SafeSetUtil {
    /**
     * 设置 proto 属性, 过滤 null 值, 防止 npe
     *
     * @param value    value
     * @param consumer consumer
     * @param <T>      类型
     */
    public static <T> void safeSet(T value, Consumer<T> consumer) {
        if (Objects.nonNull(value)) {
            consumer.accept(value);
        }
    }
}