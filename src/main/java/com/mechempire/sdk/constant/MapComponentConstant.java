package com.mechempire.sdk.constant;

import com.google.common.collect.ImmutableMap;
import com.mechempire.sdk.runtime.DefaultBaseCamp;
import com.mechempire.sdk.runtime.DefaultObstacle;
import com.mechempire.sdk.runtime.DefaultRoad;

import java.util.Map;

/**
 * package: com.mechempire.sdk.constant
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午9:16
 * <p>
 * 地图组件常量定义
 */
public class MapComponentConstant {

    public static final String COMPONENT_BASECAMP = "basecamp";

    public static final String COMPONENT_OBSTACLE = "obstacle";

    public static final String COMPONENT_ROAD = "road";

    // TODO 可以移植到数据库
    public static final short DEFAULT_BASECAMP_ID = 1;

    public static final short DEFAULT_OBSTACLE_ID = 1;

    public static final short DEFAULT_ROAD_ID = 1;

    public static final Map<Short, Class<?>> BASECAMP_TYPE =
            ImmutableMap.of(DEFAULT_BASECAMP_ID, DefaultBaseCamp.class);

    public static final Map<Short, Class<?>> OBSTACLE_TYPE =
            ImmutableMap.of(DEFAULT_OBSTACLE_ID, DefaultObstacle.class);

    public static final Map<Short, Class<?>> ROAD_TYPE =
            ImmutableMap.of(DEFAULT_ROAD_ID, DefaultRoad.class);
}