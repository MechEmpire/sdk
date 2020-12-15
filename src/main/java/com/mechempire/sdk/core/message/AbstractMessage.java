package com.mechempire.sdk.core.message;

import com.google.common.primitives.Bytes;

/**
 * package: com.mechempire.engine.core.message
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 上午9:02
 */
abstract public class AbstractMessage {
    /**
     * 指令序列
     */
    protected byte[] commandSeq = new byte[0];

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
}