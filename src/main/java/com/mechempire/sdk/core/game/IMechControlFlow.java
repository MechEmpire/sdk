package com.mechempire.sdk.core.game;

import com.mechempire.sdk.core.message.IProducer;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 下午1:05
 * <p>
 * 机甲运行控制
 */
public interface IMechControlFlow {

    /**
     * 启动机甲
     */
    void run(IProducer producer, AbstractTeam team);
}