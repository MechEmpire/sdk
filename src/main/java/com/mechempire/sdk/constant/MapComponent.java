package com.mechempire.sdk.constant;

import com.mechempire.sdk.core.component.*;
import com.mechempire.sdk.core.game.AbstractGameMapComponent;
import lombok.Getter;
import lombok.Setter;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2021/4/24 上午11:23
 * <p>
 * 地图组件数据库
 */
public enum MapComponent {
    /**
     * 地图组件数据库
     */
    DEFAULT_BASECAMP(0, DefaultBaseCamp.class, "basecamp", "默认大本营"),
    DEFAULT_OBSTACLE(1000, DefaultObstacle.class, "obstacle", "默认障碍物"),
    DEFAULT_ROAD(2000, DefaultRoad.class, "road", "默认路"),
    DEFAULT_MECH(3000, null, "mech", "默认机甲"),
    CANNON_WEAPON(4000, CannonWeapon.class, "weapon", "加农炮"),
    DESTROYER_VEHICLE(5000, DestroyerVehicle.class, "vehicle", "毁灭者载具"),
    DEFAULT_AMMUNITION(6000, DefaultAmmunition.class, "ammunition", "默认子弹"),
    ;

    @Getter
    private final int id;

    @Getter
    @Setter
    private Class<? extends AbstractGameMapComponent> clazz;

    @Getter
    private final String type;

    @Getter
    private final String desc;

    MapComponent(int id, Class<? extends AbstractGameMapComponent> clazz, String type, String desc) {
        this.id = id;
        this.clazz = clazz;
        this.type = type;
        this.desc = desc;
    }
}