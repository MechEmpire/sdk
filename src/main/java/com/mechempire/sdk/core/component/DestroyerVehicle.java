package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.command.MoveCommand;
import com.mechempire.sdk.core.game.AbstractVehicle;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    protected double speed = 12.0;

    @Override
    public byte[] forward() {
        return MoveCommand.moveTo(this.id, 20.0, 20.0);
    }

    @Override
    public byte[] backward() {
        return new byte[0];
    }
}