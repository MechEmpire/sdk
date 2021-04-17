package com.mechempire.sdk.core.game;

import com.mechempire.sdk.constant.MechRunResult;
import com.mechempire.sdk.core.message.IProducer;
import com.mechempire.sdk.runtime.AgentWorld;

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
     *
     * @param producer   生成者队列
     * @param team       team 对象
     * @param agentWorld 世界对象
     * @return 结果
     */
    MechRunResult run(IProducer producer, AbstractTeam team, AgentWorld agentWorld);
}