package com.mechempire.sdk.core.game;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mechempire.sdk.core.component.MapImageElement;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:51
 * <p>
 * 地图抽象类
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
     * 地图长 单位 px
     */
    protected double length;

    /**
     * 栅格宽 单位 px
     */
    protected double gridWidth;

    /**
     * 栅格长 单位 px
     */
    protected double gridLength;

    /**
     * 地图名称
     */
    protected String name = "map_v1";

    /**
     * 地图组件
     * hash 结构,便于查找
     */
    protected HashMap<Integer, AbstractGameMapComponent> components = Maps.newHashMap();

    /**
     * 地图图片元素
     */
    protected List<MapImageElement> imageElementList = Lists.newArrayList();

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