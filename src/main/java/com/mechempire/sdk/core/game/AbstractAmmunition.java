package com.mechempire.sdk.core.game;

import lombok.Data;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午6:57
 * <p>
 * 弹药抽象类
 */
@Data
abstract public class AbstractAmmunition extends AbstractGameMapComponent implements IMovable {
    /**
     * 弹药运行速度
     */
    protected double speed;

    /**
     * 所属机甲
     */
    protected AbstractMech mech;
}