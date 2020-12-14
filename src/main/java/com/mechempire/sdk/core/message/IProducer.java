package com.mechempire.sdk.core.message;

import java.util.Queue;

/**
 * package: com.mechempire.sdk.core.message
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 上午9:01
 * <p>
 * 消息生产者接口
 */
public interface IProducer {

    /**
     * 设置生产队列
     *
     * @param queue 队列对象
     */
    void setQueue(Queue<AbstractMessage> queue);

    /**
     * 生产消息
     */
    void product(AbstractMessage message);
}