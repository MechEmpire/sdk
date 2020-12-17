package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.game.AbstractPosition;
import lombok.Data;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/15 下午3:42
 * <p>
 * 二维质心坐标
 */
@Data
public class Position2D extends AbstractPosition {

    /**
     * 坐标构造器
     *
     * @param x x
     * @param y y
     */
    public Position2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 质心坐标构造器
     *
     * @param startX 起点 x
     * @param startY 起点 y
     * @param width  宽
     * @param length 长
     */
    public Position2D(double startX, double startY, double width, double length) {
        this.x = startX + width / 2.0;
        this.y = startY + length / 2.0;
    }

    /**
     * 获取 x
     *
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * 获取 y
     *
     * @return y
     */
    public double getY() {
        return y;
    }
}