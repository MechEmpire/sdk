package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.game.AbstractPosition;
import com.mechempire.sdk.core.game.AbstractWeapon;
import lombok.Data;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:48
 * <p>
 * 加农炮类
 */
@Data
public class CannonWeapon extends AbstractWeapon {

    @Override
    public void shooting() {

    }

    @Override
    public void collide() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public byte[] forward(double targetX, double targetY) {
        return new byte[0];
    }

    @Override
    public void updatePosition(AbstractPosition position) {

    }
}