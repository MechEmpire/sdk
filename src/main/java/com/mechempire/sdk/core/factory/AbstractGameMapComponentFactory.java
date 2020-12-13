package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractBaseCamp;
import com.mechempire.sdk.core.game.AbstractObstacle;
import com.mechempire.sdk.core.game.AbstractRoad;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:44
 * <p>
 * 地图组件抽象工厂
 */
abstract public class AbstractGameMapComponentFactory {

    abstract public AbstractBaseCamp getBaseCamp(short baseCampId);

    abstract public AbstractRoad getRoad(short roadId);

    abstract public AbstractObstacle getObstacle(short obstacleId);
}