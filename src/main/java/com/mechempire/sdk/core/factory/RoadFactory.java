package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MapComponentConstant;
import com.mechempire.sdk.core.game.AbstractBaseCamp;
import com.mechempire.sdk.core.game.AbstractObstacle;
import com.mechempire.sdk.core.game.AbstractRoad;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:54
 */
public class RoadFactory extends AbstractGameMapComponentFactory {
    @Override
    public AbstractBaseCamp getBaseCamp(short baseCampType) {
        return null;
    }

    @Override
    public AbstractRoad getRoad(short roadType) {
        if (!MapComponentConstant.ROAD_TYPE.containsKey(roadType)) {
            return null;
        }

        AbstractRoad instance = null;

        try {
            instance = (AbstractRoad) MapComponentConstant.ROAD_TYPE.get(roadType).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }

    @Override
    public AbstractObstacle getObstacle(short obstacleType) {
        return null;
    }
}