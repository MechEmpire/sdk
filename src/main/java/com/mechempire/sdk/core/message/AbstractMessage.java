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
     * 字节序列
     */
    protected byte[] byteSeq = new byte[0];

    /**
     * 填充字节序列
     *
     * @param byteSeq 新序列
     */
    public void appendByteSeq(byte[] byteSeq) {
        this.byteSeq = Bytes.concat(this.byteSeq, byteSeq);
    }

    /**
     * 获取字节序列
     *
     * @return 字节序列
     */
    public byte[] getByteSeq() {
        return this.byteSeq;
    }

    /**
     * 清空指令序列
     */
    public void clearByteSeq() {
        this.byteSeq = null;
        this.byteSeq = new byte[0];
    }
}