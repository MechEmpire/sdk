package com.mechempire.sdk.core.game;

import lombok.Data;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:52
 * <p>
 * 载具抽象类
 */
@Data
abstract public class AbstractVehicle extends AbstractGameMapComponent implements IMovable {
    /**
     * 载具速度
     */
    protected double speed;

    /**
     * 所属机甲对象
     */
    protected AbstractMech mech;
}