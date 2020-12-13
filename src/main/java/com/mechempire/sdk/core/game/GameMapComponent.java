package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:21
 * <p>
 * 地图组件
 */
abstract public class GameMapComponent extends AbstractGameObject {

    /**
     * 对象 ID
     */
    protected int id;

    /**
     * 对象名称
     */
    protected String name;

    /**
     * 对象类型
     */
    protected String type;

    /**
     * 对象起点 X 坐标
     */
    protected double positionX;

    /**
     * 对象起点 Y 坐标
     */
    protected double positionY;

    /**
     * 对象宽
     */
    protected double width;

    /**
     * 对象高
     */
    protected double height;

    /**
     * 组件亲和性
     * 红方/中立/蓝方:1/0/-1
     * 缺省 0
     */
    protected short affinity = 0;

    public int getId() {
        return id;
    }

    public GameMapComponent setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GameMapComponent setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public GameMapComponent setType(String type) {
        this.type = type;
        return this;
    }

    public double getPositionX() {
        return positionX;
    }

    public GameMapComponent setPositionX(double positionX) {
        this.positionX = positionX;
        return this;
    }

    public double getPositionY() {
        return positionY;
    }

    public GameMapComponent setPositionY(double positionY) {
        this.positionY = positionY;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public GameMapComponent setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public GameMapComponent setHeight(double height) {
        this.height = height;
        return this;
    }

    public short getAffinity() {
        return affinity;
    }

    public GameMapComponent setAffinity(short affinity) {
        this.affinity = affinity;
        return this;
    }
}