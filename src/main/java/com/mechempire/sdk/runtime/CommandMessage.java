package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.message.AbstractMessage;
import lombok.Setter;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 上午11:28
 * <p>
 * engine 调用 agent 产生的指令信息
 * <p>
 * battle 消费
 * <p>
 * commandSeq: byte command(1 byte) + int objectId(4 byte) + double x(8 byte) + double y(8 byte)
 */
public class CommandMessage extends AbstractMessage {

    /**
     * team id
     */
    @Setter
    private long teamId;
}