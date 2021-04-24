package com.mechempire.sdk.core.game;

import com.mechempire.sdk.constant.MapComponent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:27
 * <p>
 * 机甲抽象类
 */
@Data
@EqualsAndHashCode(callSuper = true)
abstract public class AbstractMech extends AbstractGameMapComponent implements ILiving {
    /**
     * 载具组件
     */
    protected MapComponent vehicleComponent = MapComponent.DESTROYER_VEHICLE;

    /**
     * 武器组件
     */
    protected MapComponent weaponComponent = MapComponent.CANNON_WEAPON;

    /**
     * 弹药组件
     */
    protected MapComponent ammunitionComponent = MapComponent.DEFAULT_AMMUNITION;

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
     * 队伍
     */
    protected AbstractTeam team;

    /**
     * 更新机甲位置, 附带更新了附属组件的位置
     *
     * @param position 位置
     */
    public void updatePosition(AbstractPosition position) {
        this.setPosition(position);
        if (null != this.getVehicle()) {
            this.getVehicle().setPosition(position);
        }

        if (null != this.getWeapon()) {
            this.getWeapon().setPosition(position);
        }

        if (null != this.getAmmunition()) {
            this.getAmmunition().setPosition(position);
        }
    }
}