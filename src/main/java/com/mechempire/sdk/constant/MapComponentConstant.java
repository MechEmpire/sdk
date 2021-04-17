package com.mechempire.sdk.constant;

import lombok.Getter;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:16
 * <p>
 * 地图组件常量定义
 */
public enum MapComponentConstant {
    COMPONENT_BASECAMP(1, "basecamp"),
    COMPONENT_OBSTACLE(2, "obstacle"),
    COMPONENT_ROAD(3, "road"),
    COMPONENT_MECH(4, "mech"),
    COMPONENT_WEAPON(5, "weapon"),
    COMPONENT_VEHICLE(6, "vehicle"),
    ;

    @Getter
    private final int code;

    @Getter
    private final String name;

    MapComponentConstant(int code, String name) {
        this.code = code;
        this.name = name;
    }
}