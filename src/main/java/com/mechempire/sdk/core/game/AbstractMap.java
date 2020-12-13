package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.meta
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午1:51
 * <p>
 * 地图抽象类
 */
abstract public class AbstractMap extends AbstractGameObject {

    /**
     * 地图 ID
     */
    protected int id;

    /**
     * 地图宽
     */
    protected int width;

    /**
     * 地图高
     */
    protected int height;

    /**
     * 栅格宽
     */
    protected int gridWidth;

    /**
     * 栅格高
     */
    protected int gridHeight;

    /**
     * 地图名称
     */
    protected String name;

    /**
     * 地图版本
     */
    protected String version;
}