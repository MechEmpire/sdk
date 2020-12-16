package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.*;

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
    public static void assemblyMech(AbstractMech mech) throws Exception {

        if (null == mech.getVehicle()) {
            AbstractGameMapComponent vehicle = GameMapComponentFactory.getComponent(mech.getVehicleClazz());
            mech.setVehicle((AbstractVehicle) vehicle);
        }

        if (null == mech.getWeapon()) {
            AbstractGameMapComponent weapon = GameMapComponentFactory.getComponent(mech.getWeaponClazz());
            mech.setWeapon((AbstractWeapon) weapon);
        }

        if (null == mech.getAmmunition()) {
            AbstractGameMapComponent ammunition = GameMapComponentFactory.getComponent(mech.getAmmunitionClazz());
            mech.setAmmunition((AbstractAmmunition) ammunition);
        }
    }
}