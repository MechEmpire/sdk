package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractAmmunition;
import com.mechempire.sdk.core.game.AbstractVehicle;
import com.mechempire.sdk.core.game.AbstractWeapon;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午7:09
 * <p>
 * 弹药工厂逻辑
 */
public class AmmunitionMechFactory extends AbstractMechComponentFactory {
    @Override
    public AbstractWeapon getWeapon(int weaponId) {
        return null;
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