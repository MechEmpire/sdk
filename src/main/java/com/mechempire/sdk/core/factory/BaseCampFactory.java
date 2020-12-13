package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MapComponentConstant;
import com.mechempire.sdk.core.game.AbstractBaseCamp;
import com.mechempire.sdk.core.game.AbstractObstacle;
import com.mechempire.sdk.core.game.AbstractRoad;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:50
 */
public class BaseCampFactory extends AbstractGameMapComponentFactory {
    @Override
    public AbstractBaseCamp getBaseCamp(short baseCampId) {

        if (!MapComponentConstant.BASECAMP_TYPE.containsKey(baseCampId)) {
            return null;
        }

        AbstractBaseCamp instance = null;

        try {
            instance = (AbstractBaseCamp) MapComponentConstant.BASECAMP_TYPE.get(baseCampId).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return instance;
    }

    @Override
    public AbstractRoad getRoad(short roadId) {
        return null;
    }

    @Override
    public AbstractObstacle getObstacle(short obstacleId) {
        return null;
    }
}