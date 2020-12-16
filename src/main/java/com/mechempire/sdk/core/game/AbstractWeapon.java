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
abstract public class AbstractWeapon extends AbstractGameMapComponent implements IAttack, IRotatable {

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
}