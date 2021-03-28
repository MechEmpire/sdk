package com.mechempire.sdk.math;

import com.mechempire.sdk.constant.RuntimeConstant;
import com.mechempire.sdk.core.game.AbstractPosition;
import com.mechempire.sdk.runtime.Position2D;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * package: com.mechempire.sdk.math
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/17 上午11:07
 * <p>
 * 坐标相关计算
 */
public class PositionCal {

    /**
     * 获取对象的下一帧位置
     *
     * @param fromX 当前帧 X
     * @param fromY 当前帧 Y
     * @param toX   下一帧 X
     * @param toY   下一帧 Y
     * @param speed 速度
     * @return 下一帧位置
     */
    public static AbstractPosition getComponentNextFrame2DPosition(double fromX, double fromY, double toX, double toY, double speed) {
        BigDecimal xIncr = getDifference(toX, fromX);
        BigDecimal yIncr = getDifference(toY, fromY);

        BigDecimal xNumerator = getProduct(getProduct(speed, RuntimeConstant.FRAME_GAP).doubleValue(), xIncr.doubleValue());
        BigDecimal yNumerator = getProduct(getProduct(speed, RuntimeConstant.FRAME_GAP).doubleValue(), yIncr.doubleValue());

        BigDecimal denominator = BigDecimal.valueOf(
                Math.pow(getDifference(toX, fromX).pow(2).add(getDifference(toY, fromY).pow(2)).doubleValue(), 0.5)
        );

        BigDecimal deltaX = BigDecimal.valueOf(0), deltaY = BigDecimal.valueOf(0);
        if (denominator.doubleValue() > 0.0) {
            deltaX = xNumerator.divide(denominator, RoundingMode.HALF_UP);
            deltaY = yNumerator.divide(denominator, RoundingMode.HALF_UP);

            if (Math.abs(xIncr.doubleValue()) < Math.abs(deltaX.doubleValue())) {
                deltaX = xIncr;
            }

            if (Math.abs(yIncr.doubleValue()) < Math.abs(deltaY.doubleValue())) {
                deltaY = yIncr;
            }
        }
        return new Position2D(BigDecimal.valueOf(fromX).add(deltaX).doubleValue(),
                BigDecimal.valueOf(fromY).add(deltaY).doubleValue());
    }

    /**
     * 获取两数之差
     *
     * @param num1 num1
     * @param num2 num2
     * @return 差
     */
    public static BigDecimal getDifference(double num1, double num2) {
        return BigDecimal.valueOf(num1).subtract(BigDecimal.valueOf(num2));
    }

    /**
     * 获取两数之积
     *
     * @param num1 num1
     * @param num2 num2
     * @return 积
     */
    public static BigDecimal getProduct(double num1, double num2) {
        return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2));
    }
}