package com.mechempire.sdk.core.game;

import java.util.HashMap;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:51
 * <p>
 * 地图抽象类
 */
abstract public class AbstractGameMap extends AbstractGameObject {

    /**
     * 地图 ID
     */
    protected int id = 0;

    /**
     * 地图宽 单位 px
     */
    protected double width;

    /**
     * 地图高 单位 px
     */
    protected double height;

    /**
     * 栅格宽 单位 px
     */
    protected double gridWidth;

    /**
     * 栅格高 单位 px
     */
    protected double gridHeight;

    /**
     * 地图名称
     */
    protected String name = "mechempire_map";

    /**
     * 地图版本
     */
    protected String version = "v1";

    /**
     * 地图组件
     * hash 结构,便于查找
     */
    protected HashMap<Integer, AbstractGameMapComponent> components = new HashMap<>(8);

    /**
     * 从地图组件 hash 中获取某个组件
     *
     * @param id id
     * @return 组件对象
     */
    public abstract AbstractGameMapComponent getMapComponent(int id);

    /**
     * 为地图添加组件
     *
     * @param abstractGameMapComponent 组件对象
     */
    public abstract void addMapComponent(AbstractGameMapComponent abstractGameMapComponent);
}