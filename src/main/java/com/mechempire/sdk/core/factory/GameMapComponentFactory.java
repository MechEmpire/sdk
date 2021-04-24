package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractGameMapComponent;

import java.util.Objects;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:56
 * <p>
 * 地图组件抽象工厂
 */
public class GameMapComponentFactory {
    /**
     * 组建数量
     */
    private static int componentCount = 1;

    /**
     * 生成地图组件
     *
     * @param componentClazz 组件类
     * @param <T>            类
     * @return 新组件
     * @throws Exception 异常
     */
    public static <T extends AbstractGameMapComponent> T createComponent(Class<T> componentClazz) throws Exception {
        if (Objects.isNull(componentClazz)) {
            return null;
        }
        T component = componentClazz.newInstance();
        component.setId(componentCount++);
        return component;
    }
}