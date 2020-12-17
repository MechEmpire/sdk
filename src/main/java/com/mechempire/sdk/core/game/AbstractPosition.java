package com.mechempire.sdk.core.game;

import lombok.Data;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/15 下午3:40
 * <p>
 * 质心位置
 */
@Data
abstract public class AbstractPosition extends AbstractGameObject {

    /**
     * x
     */
    protected double x;

    /**
     * y
     */
    protected double y;
}