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
public class ObstacleFactory extends AbstractGameMapComponentFactory {
    @Override
    public AbstractBaseCamp getBaseCamp(short baseCampId) {
        return null;
    }

    @Override
    public AbstractRoad getRoad(short roadId) {
        return null;
    }

    @Override
    public AbstractObstacle getObstacle(short obstacleId) {
        if (!MapComponentConstant.OBSTACLE_TYPE.containsKey(obstacleId)) {
            return null;
        }

        AbstractObstacle instance = null;

        try {
            instance = (AbstractObstacle) MapComponentConstant.OBSTACLE_TYPE.get(obstacleId).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }
}