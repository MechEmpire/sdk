package com.mechempire.sdk.core.game;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:53
 * 武器抽象类
 */
@EqualsAndHashCode(callSuper = true)
@Data
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
    protected AbstractMech mech;
}