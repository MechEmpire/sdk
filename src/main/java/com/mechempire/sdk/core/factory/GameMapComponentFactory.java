package com.mechempire.sdk.core.factory;

import com.mechempire.sdk.core.game.AbstractGameMapComponent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * package: com.mechempire.sdk.core.factory
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/16 上午11:09
 */
public class GameMapComponentFactory {

    /**
     * component 计数器
     */
    private static final AtomicInteger componentCount = new AtomicInteger(0);

    /**
     * 创建游戏组件对象, 为每一个对象填充 id
     *
     * @param componentClazz 游戏组建对象类
     * @return 游戏组件对象
     */
    public static AbstractGameMapComponent getComponent(Class<?> componentClazz) throws Exception {
        AbstractGameMapComponent component = (AbstractGameMapComponent) componentClazz.newInstance();
        int componentId = componentCount.incrementAndGet();
        component.setId(componentId);
        return component;
    }
}