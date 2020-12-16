package com.mechempire.sdk.core.game;

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
     * 弹药运行速度
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