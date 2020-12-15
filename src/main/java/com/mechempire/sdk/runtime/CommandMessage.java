package com.mechempire.sdk.runtime;

import com.google.common.primitives.Bytes;
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

    /**
     * 指令序列
     */
    private byte[] commandSeq = new byte[0];

    /**
     * 填充指令序列
     *
     * @param commandSeq 新指令
     */
    public void appendCommandSeq(byte[] commandSeq) {
        this.commandSeq = Bytes.concat(this.commandSeq, commandSeq);
    }

    /**
     * 获取当前帧的指令序列
     *
     * @return 指令序列
     */
    public byte[] getCommandSeq() {
        return this.commandSeq;
    }

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

    public int getSeqNum() {
        return seqNum;
    }

    public CommandMessage setSeqNum(int seqNum) {
        this.seqNum = seqNum;
        return this;
    }
}