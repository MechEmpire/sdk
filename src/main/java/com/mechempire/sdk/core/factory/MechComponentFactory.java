package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MechComponentConstant;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:00
 * <p>
 * 机甲组件抽象类
 */
public class MechComponentFactory {

    /**
     * 获取机甲组件的工厂类
     *
     * @param componentType 组件类型
     * @return 工厂类
     */
    public static AbstractMechComponentFactory getFactory(String componentType) {
        if (null == componentType || componentType.length() == 0) {
            return null;
        }

        if (componentType.equalsIgnoreCase(MechComponentConstant.COMPONENT_WEAPON)) {
            return new WeaponFactory();
        } else if (componentType.equalsIgnoreCase(MechComponentConstant.COMPONENT_AMMUNITION)) {
            return new AmmunitionFactory();
        } else if (componentType.equalsIgnoreCase(MechComponentConstant.COMPONENT_VEHICLE)) {
            return new VehicleFactory();
        }

        return null;
    }
}