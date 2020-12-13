package com.mechempire.sdk.constant;

import com.google.common.collect.ImmutableMap;
import com.mechempire.sdk.runtime.CannonWeapon;
import com.mechempire.sdk.runtime.DefaultAmmunition;
import com.mechempire.sdk.runtime.DestroyerVehicle;

import java.util.Map;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:34
 */
public class MechComponentConstant {

    public static final String COMPONENT_WEAPON = "weapon";

    public static final String COMPONENT_VEHICLE = "vehicle";

    public static final String COMPONENT_AMMUNITION = "ammunition";

    public static final int ID_CANNON_WEAPON = 1; // 加农炮

    public static final int ID_DESTROYER_VEHICLE = 1; // 毁灭者

    public static final int ID_DEFAULT_AMMUNITION = 1; // 默认弹药

    public static final Map<Integer, Class<?>> WEAPON_LIST = ImmutableMap.of(ID_CANNON_WEAPON, CannonWeapon.class);

    public static final Map<Integer, Class<?>> VEHICLE_LIST = ImmutableMap.of(ID_DESTROYER_VEHICLE, DestroyerVehicle.class);

    public static final Map<Integer, Class<?>> AMMUNITION_LIST = ImmutableMap.of(ID_DEFAULT_AMMUNITION, DefaultAmmunition.class);

}