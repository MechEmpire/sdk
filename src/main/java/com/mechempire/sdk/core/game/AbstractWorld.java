package com.mechempire.sdk.core.game;

import com.mechempire.sdk.constant.EngineStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/15 下午3:17
 * <p>
 * 世界类
 */
public abstract class AbstractWorld extends AbstractGameObject {
    /**
     * 宽
     */
    @Getter
    @Setter
    protected double windowWidth = 0.0;

    /**
     * 长
     */
    @Getter
    @Setter
    protected double windowLength = 0.0;

    /**
     * 引擎运行状态
     */
    @Getter
    @Setter
    protected EngineStatus engineStatus;

    /**
     * 地图
     */
    @Getter
    @Setter
    protected AbstractGameMap gameMap;
}