package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.command.MoveCommand;
import com.mechempire.sdk.core.game.AbstractVehicle;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:48
 * <p>
 * 毁灭者载具
 */
public class DestroyerVehicle extends AbstractVehicle {
    /**
     * 起点 X
     */
    protected double startX;

    /**
     * 起点 Y
     */
    protected double startY;

    /**
     * 对象宽
     */
    protected double width = 64.0;

    /**
     * 对象高
     */
    protected double length = 96.0;

    /**
     * 载具速度
     */
    protected double speed = 12.0;

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public byte[] forward() {
        return MoveCommand.moveTo(this.id, 20.0, 20.0);
    }

    @Override
    public byte[] backward() {
        return new byte[0];
    }
}