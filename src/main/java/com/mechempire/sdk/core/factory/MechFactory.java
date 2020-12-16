package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.*;
import com.mechempire.sdk.runtime.Position2D;

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
            AbstractGameMapComponent component = GameMapComponentFactory.getComponent(mech.getVehicleClazz());
            AbstractVehicle vehicle = (AbstractVehicle) component;
            
            mech.setWidth(vehicle.getWidth());
            mech.setLength(vehicle.getLength());

            mech.setPosition(new Position2D(mech.getStartX(), mech.getStartY(), mech.getWidth(), mech.getLength()));
            // 载具与机甲宽度保持一致
            vehicle.setStartX(mech.getStartX());
            vehicle.setStartY(mech.getStartY());
            vehicle.setPosition(mech.getPosition());
            vehicle.setMech(mech);
            mech.setVehicle(vehicle);
        }

        if (null == mech.getWeapon()) {
            AbstractGameMapComponent component = GameMapComponentFactory.getComponent(mech.getWeaponClazz());
            AbstractWeapon weapon = (AbstractWeapon) component;
            weapon.setMech(mech);
            weapon.setPosition(mech.getPosition());
            mech.setWeapon(weapon);
        }

        if (null == mech.getAmmunition()) {
            AbstractGameMapComponent component = GameMapComponentFactory.getComponent(mech.getAmmunitionClazz());
            AbstractAmmunition ammunition = (AbstractAmmunition) component;
            ammunition.setMech(mech);
            ammunition.setPosition(mech.getPosition());
            mech.setAmmunition(ammunition);
        }
    }
}