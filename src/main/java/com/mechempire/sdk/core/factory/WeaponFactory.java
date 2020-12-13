package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MechComponentConstant;
import com.mechempire.sdk.core.game.AbstractAmmunition;
import com.mechempire.sdk.core.game.AbstractVehicle;
import com.mechempire.sdk.core.game.AbstractWeapon;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午7:04
 * <p>
 */
public class WeaponFactory extends AbstractMechComponentFactory {
    @Override
    public AbstractWeapon getWeapon(int weaponId) {
        if (!MechComponentConstant.WEAPON_LIST.containsKey(weaponId)) {
            return null;
        }

        AbstractWeapon instance = null;

        try {
            instance = (AbstractWeapon) MechComponentConstant.WEAPON_LIST.get(weaponId).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }

    @Override
    public AbstractVehicle getVehicle(int vehicleId) {
        return null;
    }

    @Override
    public AbstractAmmunition getAmmunition(int ammunitionId) {
        return null;
    }
}