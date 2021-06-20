package com.mechempire.sdk.core.game;

import lombok.Getter;
import lombok.Setter;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:53
 * 武器抽象类
 */
abstract public class AbstractWeapon extends AbstractGameMapComponent implements IAttack, IRotatable, IMovable {

    /**
     * 伤害值
     */
    protected int damageValue;

    /**
     * 最大转角
     */
    protected int maxCorner;

    /**
     * 所属机甲
     */
    @Setter
    @Getter
    protected AbstractMech mech;

    @Override
    public void updatePosition(AbstractPosition position) {
        this.setPosition(position);
        double startX = position.getX() - this.getWidth() / 2.0;
        double startY = position.getY() - this.getLength() / 2.0;
        this.setStartX(startX);
        this.setStartY(startY);
    }
}