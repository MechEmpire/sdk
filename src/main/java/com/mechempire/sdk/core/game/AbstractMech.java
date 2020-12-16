package com.mechempire.sdk.core.game;

import com.mechempire.sdk.core.component.CannonWeapon;
import com.mechempire.sdk.core.component.DefaultAmmunition;
import com.mechempire.sdk.core.component.DestroyerVehicle;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:27
 * <p>
 * 机甲抽象类
 */
abstract public class AbstractMech extends AbstractGameMapComponent {
    /**
     * 载具类
     */
    protected Class<?> vehicleClazz = DestroyerVehicle.class;

    /**
     * 武器类
     */
    protected Class<?> weaponClazz = CannonWeapon.class;

    /**
     * 弹药类
     */
    protected Class<?> ammunitionClazz = DefaultAmmunition.class;

    /**
     * 载具
     */
    protected AbstractVehicle vehicle;

    /**
     * 武器
     */
    protected AbstractWeapon weapon;

    /**
     * 弹药
     */
    protected AbstractAmmunition ammunition;

    /**
     * 机甲位置
     */
    protected AbstractPosition position;

    public Class<?> getVehicleClazz() {
        return vehicleClazz;
    }

    public void setVehicleClazz(Class<?> vehicleClazz) {
        this.vehicleClazz = vehicleClazz;
    }

    public Class<?> getWeaponClazz() {
        return weaponClazz;
    }

    public void setWeaponClazz(Class<?> weaponClazz) {
        this.weaponClazz = weaponClazz;
    }

    public Class<?> getAmmunitionClazz() {
        return ammunitionClazz;
    }

    public void setAmmunitionClazz(Class<?> ammunitionClazz) {
        this.ammunitionClazz = ammunitionClazz;
    }

    public AbstractVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(AbstractVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public AbstractWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(AbstractWeapon weapon) {
        this.weapon = weapon;
    }

    public AbstractAmmunition getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(AbstractAmmunition ammunition) {
        this.ammunition = ammunition;
    }

    public AbstractPosition getPosition() {
        return position;
    }

    public void setPosition(AbstractPosition position) {
        this.position = position;
    }
}