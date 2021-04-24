package com.mechempire.sdk.constant;

import lombok.Getter;

/**
 * 组件亲和性
 * @author tairy
 */
public enum TeamAffinity {
    /**
     * 红方
     */
    RED(-1, "红方"),

    /**
     * 蓝方
     */
    BLUE(1, "蓝方"),
    ;

    @Getter
    private final int code;

    @Getter
    private final String desc;

    TeamAffinity(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
