package com.mechempire.sdk.core.component;

import com.mechempire.sdk.core.game.AbstractAmmunition;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:50
 */
public class DefaultAmmunition extends AbstractAmmunition {
    @Override
    public byte[] forward() {
        return new byte[0];
    }

    @Override
    public byte[] backward() {
        return new byte[0];
    }
}