package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.command.MoveCommand;
import com.mechempire.sdk.core.game.AbstractVehicle;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:48
 * <p>
 * 毁灭者载具
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
    protected double length = 64.0;

    /**
     * 载具速度 px/ms
     */
    @Getter
    protected double speed = 0.00005;

    @Override
    public byte[] forward(double targetX, double targetY) {
        return MoveCommand.moveTo(this.id, targetX, targetY);
    }
}