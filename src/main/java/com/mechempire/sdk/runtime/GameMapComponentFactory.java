package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.game.GameMapComponent;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午5:18
 */
public class GameMapComponentFactory {
    /**
     * 地图组件工厂类
     *
     * @param componentType 组件类型
     * @return 组建对象
     */
    public static GameMapComponent getGameMapComponent(String componentType) {
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