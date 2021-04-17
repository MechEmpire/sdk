package com.mechempire.sdk.constant;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/16 上午10:35
 */
public enum MechRunResult {
    SUCCESS(0, "执行成功"),
    READY(1, "准备中"),
    FAILED(2, "执行失败"),
    ;

    private final int code;

    private final String desc;

    MechRunResult(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
