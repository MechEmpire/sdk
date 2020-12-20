package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.game.AbstractGameMap;
import com.mechempire.sdk.core.game.AbstractGameMapComponent;
import lombok.Data;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:01
 * <p>
 * 地图对象
 */
@Data
public class GameMap extends AbstractGameMap {

    @Override
    public AbstractGameMapComponent getMapComponent(int id) {
        return this.components.get(id);
    }

    @Override
    public void addMapComponent(AbstractGameMapComponent abstractGameMapComponent) {
        this.components.put(abstractGameMapComponent.getId(), abstractGameMapComponent);
    }
}