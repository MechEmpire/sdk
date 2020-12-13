package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractAmmunition;
import com.mechempire.sdk.core.game.AbstractVehicle;
import com.mechempire.sdk.core.game.AbstractWeapon;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午6:51
 * <p>
 * 机甲抽象工厂
 */
abstract public class AbstractMechFactory {

    /**
     * 武器工厂
     *
     * @param weaponId 武器 ID
     * @return 武器对象
     */
    public abstract AbstractWeapon getWeapon(int weaponId);

    /**
     * 载具工厂
     *
     * @param vehicleId 载具 ID
     * @return 载具对象
     */
    public abstract AbstractVehicle getVehicle(int vehicleId);

    /**
     * 弹药工厂
     *
     * @param ammunitionId 弹药 ID
     * @return 弹药对象
     */
    public abstract AbstractAmmunition getAmmunition(int ammunitionId);
}