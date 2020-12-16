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