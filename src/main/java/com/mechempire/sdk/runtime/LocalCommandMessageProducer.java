package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.message.AbstractMessage;
import com.mechempire.sdk.core.message.IProducer;

import java.util.Queue;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 下午6:16
 */
public class LocalCommandMessageProducer implements IProducer {
    /**
     * 消息队列
     */
    private Queue<AbstractMessage> queue;

    /**
     * 初始化 queue
     *
     * @param queue 队列
     */
    @Override
    public void setQueue(Queue<AbstractMessage> queue) {
        if (null != this.queue || null == queue) {
            return;
        }
        this.queue = queue;
    }

    @Override
    public void product(AbstractMessage message) {
        if (null == this.queue) {
            return;
        }
        this.queue.offer(message);
    }
}