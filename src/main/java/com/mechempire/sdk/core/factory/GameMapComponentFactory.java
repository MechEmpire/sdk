package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractGameMapComponent;
import com.mechempire.sdk.runtime.BaseCamp;
import com.mechempire.sdk.runtime.Bunker;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午5:18
 * <p>
 * 地图组件工厂类
 */
public class GameMapComponentFactory {
    /**
     * @param componentType 组件类型
     * @return 组建对象
     */
    public static AbstractGameMapComponent getGameMapComponent(String componentType) {
        if (componentType == null) {
            return null;
        }

        if (componentType.equalsIgnoreCase("basecamp")) {
            return new BaseCamp();
        } else if (componentType.equalsIgnoreCase("bunker")) {
            return new Bunker();
        }

        return null;
    }
}