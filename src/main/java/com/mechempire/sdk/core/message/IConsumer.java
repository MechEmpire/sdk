package com.mechempire.sdk.core.message;

import java.util.Queue;

/**
 * package: com.mechempire.sdk.core.message
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 上午9:04
 * <p>
 * 消息消费者接口
 */
public interface IConsumer {

    /**
     * 设置消费队列
     *
     * @param queue 队列对象
     */
    void setQueue(Queue<AbstractMessage> queue);

    /**
     * 消费消息
     */
    AbstractMessage consume();
}