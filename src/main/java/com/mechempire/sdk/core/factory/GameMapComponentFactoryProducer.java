package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.constant.MapComponentConstant;
import com.mechempire.sdk.core.game.AbstractGameMapComponent;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:56
 * <p>
 * 地图组件抽象工厂
 */
public class GameMapComponentFactoryProducer {

    /**
     * 生成各组件对应的工厂
     *
     * @param componentType 组件类型
     * @return 组件对应的工厂类
     */
    public static AbstractGameMapComponentFactory getFactory(String componentType) {
        if (null == componentType || componentType.length() == 0) {
            return null;
        }
        if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_BASECAMP)) {
            return new BaseCampFactory();
        } else if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_OBSTACLE)) {
            return new ObstacleFactory();
        } else if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_ROAD)) {
            return new RoadFactory();
        }
        return null;
    }

    /**
     * @param componentType 组件类型
     * @param componentId   组建 ID
     * @return 组建
     */
    public static AbstractGameMapComponent getComponent(String componentType, short componentId) {
        if (null == componentType || componentType.length() == 0 || componentId == 0) {
            return null;
        }
        if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_BASECAMP)) {
            return (new BaseCampFactory()).getBaseCamp(componentId);
        } else if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_OBSTACLE)) {
            return (new ObstacleFactory()).getObstacle(componentId);
        } else if (componentType.equalsIgnoreCase(MapComponentConstant.COMPONENT_ROAD)) {
            return (new RoadFactory()).getRoad(componentId);
        }
        return null;
    }
}