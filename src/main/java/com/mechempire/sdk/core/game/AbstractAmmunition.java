package com.mechempire.sdk.core.game;

import lombok.Getter;
import lombok.Setter;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午6:57
 * <p>
 * 弹药抽象类
 */
abstract public class AbstractAmmunition extends AbstractGameMapComponent implements IMovable {
    /**
     * 运行速度
     */
    protected double speed;

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