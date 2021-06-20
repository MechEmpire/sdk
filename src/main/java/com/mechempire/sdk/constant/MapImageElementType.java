package com.mechempire.sdk.constant;

import lombok.Getter;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2021/6/19 上午11:59
 * <p>
 * 这个类的名字要与 common_data.proto 中 ElementType 保持一致
 */
public enum MapImageElementType {
    /**
     * 普通图片
     */
    COMMON(1, "common"),

    /**
     * 背景图片
     */
    BACKGROUND(2, "background"),

    /**
     * logo
     */
    LOGO(3, "logo"),
    ;

    MapImageElementType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Getter
    private final int code;

    @Getter
    private final String desc;
}