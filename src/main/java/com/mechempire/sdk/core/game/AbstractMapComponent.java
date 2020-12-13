package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:21
 * <p>
 * 地图组件
 */
abstract public class AbstractMapComponent extends AbstractGameObject {

    /**
     * 对象起点 X 坐标
     */
    protected int positionX;

    /**
     * 对象起点 Y 坐标
     */
    protected int positionY;

    /**
     * 对象宽
     */
    protected int width;

    /**
     * 对象高
     */
    protected int height;
}