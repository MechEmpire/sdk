package com.mechempire.sdk.core.game;

import lombok.Data;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:21
 * <p>
 * 地图组件
 */
@Data
abstract public class AbstractGameMapComponent extends AbstractGameObject {
    /**
     * 对象 ID
     */
    public int id;

    /**
     * 对象名称
     */
    protected String name;

    /**
     * 对象类型
     */
    protected String type;

    /**
     * 对象坐标位置
     */
    protected AbstractPosition position;

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
}