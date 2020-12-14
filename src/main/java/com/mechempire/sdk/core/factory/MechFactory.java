package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MechComponentConstant;
import com.mechempire.sdk.core.game.AbstractMech;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 下午2:38
 */
public class MechFactory {

    /**
     * 装配机甲
     * <p>
     * todo: 需要判断运行时状态, 运行时不做任何操作
     *
     * @param mech 待装配的机甲
     */
    public static void assemblyMech(AbstractMech mech) {

        if (null == mech.getVehicle()) {
            AbstractMechComponentFactory vehicleFactory = MechComponentFactoryProducer.getFactory(MechComponentConstant.COMPONENT_VEHICLE);
            mech.setVehicle(vehicleFactory.getVehicle(mech.getVehicleId()));
        }

        if (null == mech.getWeapon()) {
            AbstractMechComponentFactory weaponFactory = MechComponentFactoryProducer.getFactory(MechComponentConstant.COMPONENT_WEAPON);
            mech.setWeapon(weaponFactory.getWeapon(mech.getWeaponId()));
        }

        if (null == mech.getAmmunition()) {
            AbstractMechComponentFactory ammunitionFactory = MechComponentFactoryProducer.getFactory(MechComponentConstant.COMPONENT_AMMUNITION);
            mech.setAmmunition(ammunitionFactory.getAmmunition(mech.getAmmunitionId()));
        }
    }
}