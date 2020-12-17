package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractGameMapComponent;
import com.mechempire.sdk.core.game.AbstractPosition;
import com.mechempire.sdk.runtime.Position2D;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/17 上午10:15
 * <p>
 * 坐标工厂
 */
public class PositionFactory {

    /**
     * 获取对象质心坐标
     *
     * @param component 对象
     * @return 坐标
     */
    public static AbstractPosition getPosition(AbstractGameMapComponent component) {
        return new Position2D(component.getStartX(), component.getStartY(), component.getWidth(), component.getLength());
    }
}