package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:52
 * <p>
 * 载具抽象类
 */
abstract public class AbstractVehicle extends AbstractGameMapComponent implements IMovable {
    /**
     * 载具速度
     */
    protected double speed;

    /**
     * 宽:px
     */
    protected double width;

    /**
     * 高:px
     */
    protected double height;

    /**
     * 位置
     */
    private AbstractPosition position;
}