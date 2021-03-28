package com.mechempire.sdk.core.game;

import javafx.scene.shape.Shape;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * package: com.mechempire.sdk.core
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午2:21
 * <p>
 * 地图组件
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
     * 对象质心位置
     */
    protected AbstractPosition position;

    /**
     * 起点 X
     */
    protected double startX;

    /**
     * 起点 Y
     */
    protected double startY;

    /**
     * 对象宽
     */
    protected double width;

    /**
     * 对象长
     */
    protected double length;

    /**
     * 组件亲和性
     * 红方/中立/蓝方:1/0/-1
     * 缺省 0
     */
    protected short affinity = 0;

    /**
     * shape
     */
    protected Shape shape;
}