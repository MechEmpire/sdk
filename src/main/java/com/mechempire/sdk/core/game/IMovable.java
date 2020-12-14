package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:35
 * <p>
 * 移动行为接口
 */
public interface IMovable extends IGameObjectBehavior {

    /**
     * 移动到指定坐标
     *
     * @param x x
     * @param y y
     */
    void moveTo(double x, double y);

    /**
     * 前进
     */
    void forward();

    void backward();

    void turnLeft();

    void turnRight();
}