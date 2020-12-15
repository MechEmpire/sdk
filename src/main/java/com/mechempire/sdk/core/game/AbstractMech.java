package com.mechempire.sdk.core.game;

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
     * 载具 id
     */
    protected int vehicleId = 1;

    /**
     * 武器 id
     */
    protected int weaponId = 1;

    /**
     * 弹药 id
     */
    protected int ammunitionId = 1;

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

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getAmmunitionId() {
        return ammunitionId;
    }

    public void setAmmunitionId(int ammunitionId) {
        this.ammunitionId = ammunitionId;
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