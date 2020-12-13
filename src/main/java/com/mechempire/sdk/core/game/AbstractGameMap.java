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
     * 地图宽
     */
    protected double width;

    /**
     * 地图高
     */
    protected double height;

    /**
     * 栅格宽
     */
    protected double gridWidth;

    /**
     * 栅格高
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
    protected HashMap<Integer, GameMapComponent> components = new HashMap<>(8);

    /**
     * 从地图组件 hash 中获取某个组件
     *
     * @param id id
     * @return 组件对象
     */
    public abstract GameMapComponent getMapComponent(int id);

    /**
     * 为地图添加组件
     *
     * @param gameMapComponent 组件对象
     */
    public abstract void addMapComponent(GameMapComponent gameMapComponent);

    public int getId() {
        return id;
    }

    public AbstractGameMap setId(int id) {
        this.id = id;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public AbstractGameMap setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public AbstractGameMap setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getGridWidth() {
        return gridWidth;
    }

    public AbstractGameMap setGridWidth(double gridWidth) {
        this.gridWidth = gridWidth;
        return this;
    }

    public double getGridHeight() {
        return gridHeight;
    }

    public AbstractGameMap setGridHeight(double gridHeight) {
        this.gridHeight = gridHeight;
        return this;
    }

    public String getName() {
        return name;
    }

    public AbstractGameMap setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public AbstractGameMap setVersion(String version) {
        this.version = version;
        return this;
    }
}