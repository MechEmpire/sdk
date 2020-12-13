package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MechComponentConstant;
import com.mechempire.sdk.core.game.AbstractAmmunition;
import com.mechempire.sdk.core.game.AbstractVehicle;
import com.mechempire.sdk.core.game.AbstractWeapon;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午7:08
 * <p>
 * 载具工厂逻辑
 */
public class VehicleFactory extends AbstractMechComponentFactory {
    @Override
    public AbstractWeapon getWeapon(int weaponId) {
        return null;
    }

    @Override
    public AbstractVehicle getVehicle(int vehicleId) {
        if (!MechComponentConstant.VEHICLE_LIST.containsKey(vehicleId)) {
            return null;
        }

        AbstractVehicle instance = null;

        try {
            instance = (AbstractVehicle) MechComponentConstant.VEHICLE_LIST.get(vehicleId).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }

    @Override
    public AbstractAmmunition getAmmunition(int ammunitionId) {
        return null;
    }
}