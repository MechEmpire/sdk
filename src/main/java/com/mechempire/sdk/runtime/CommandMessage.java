package com.mechempire.sdk.runtime;

import com.mechempire.sdk.core.message.AbstractMessage;

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
    private int teamId;

    /**
     * 清空指令序列
     */
    public void cleanCommandSeq() {
        this.commandSeq = null;
        this.commandSeq = new byte[0];
    }

    public int getTeamId() {
        return teamId;
    }

    public CommandMessage setTeamId(int teamId) {
        this.teamId = teamId;
        return this;
    }
}