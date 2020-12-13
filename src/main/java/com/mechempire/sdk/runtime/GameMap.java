package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.game.AbstractGameMap;
import com.mechempire.sdk.core.game.GameMapComponent;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:01
 * <p>
 * 地图对象
 */
public class GameMap extends AbstractGameMap {

    @Override
    public GameMapComponent getMapComponent(int id) {
        return this.components.get(id);
    }

    @Override
    public void addMapComponent(GameMapComponent gameMapComponent) {
        this.components.put(gameMapComponent.getId(), gameMapComponent);
    }
}