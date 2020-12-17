package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.game.AbstractAmmunition;
import lombok.Data;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:50
 */
@Data
public class DefaultAmmunition extends AbstractAmmunition {
    /**
     * 弹药速度
     */
    protected double speed = 40.0;

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public byte[] forward() {
        return new byte[0];
    }

    @Override
    public byte[] backward() {
        return new byte[0];
    }
}