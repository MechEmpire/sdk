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
 */
public class CommandMessage extends AbstractMessage {

    /**
     * team id
     */
    private int teamId;

    /**
     * 消息序列号
     */
    private int seqNum;

    public int getTeamId() {
        return teamId;
    }

    public CommandMessage setTeamId(int teamId) {
        this.teamId = teamId;
        return this;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public CommandMessage setSeqNum(int seqNum) {
        this.seqNum = seqNum;
        return this;
    }
}