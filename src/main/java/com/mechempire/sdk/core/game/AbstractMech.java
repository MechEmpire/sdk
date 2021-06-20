package com.mechempire.sdk.core.game;

import com.mechempire.sdk.constant.MapComponent;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

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
abstract public class AbstractMech extends AbstractGameMapComponent implements ILiving, IMovable {
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
    @Override
    public void updatePosition(AbstractPosition position) {
        this.setPosition(position);
        double startX = position.getX() - this.getWidth() / 2.0;
        double startY = position.getY() - this.getLength() / 2.0;
        this.setStartX(startX);
        this.setStartY(startY);
        if (Objects.nonNull(this.getVehicle())) {
            this.getVehicle().updatePosition(position);
        }

        if (Objects.nonNull(this.getWeapon())) {
            this.getWeapon().updatePosition(position);
        }

        if (Objects.nonNull(this.getAmmunition())) {
            this.getAmmunition().updatePosition(position);
        }
    }
}