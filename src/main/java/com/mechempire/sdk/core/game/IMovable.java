package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:35
 * <p>
 * 移动行为接口
 */
public interface IMovable {
    /**
     * 获取可移动对象速度
     *
     * @return 速度值
     */
    double getSpeed();

    /**
     * 根据对象的属性, 计算目标点坐标, 生成 moveTo 指令
     *
     * @param targetX 目的坐标 x
     * @param targetY 目的坐标 y
     * @return 字节序列
     */
    byte[] forward(double targetX, double targetY);

    /**
     * 更新坐标
     *
     * @param position 新坐标
     */
    void updatePosition(AbstractPosition position);
}