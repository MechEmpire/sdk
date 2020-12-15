package com.mechempire.sdk.core.command;

import com.google.common.primitives.Bytes;
import com.mechempire.sdk.core.game.AbstractCommand;

import java.nio.ByteBuffer;

/**
 * package: com.mechempire.sdk.core.command
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/15 上午11:06
 */
public class MoveCommand extends AbstractCommand {

    /**
     * 指定对象移动到目标点
     * 0x00
     *
     * @param objectId 对象 ID
     * @param x        x
     * @param y        y
     */
    public static byte[] moveTo(int objectId, double x, double y) {
        return Bytes.concat(new byte[]{0x0}, ByteBuffer.allocate(4).putInt(objectId).array(),
                ByteBuffer.allocate(8).putDouble(x).array(), ByteBuffer.allocate(8).putDouble(y).array());
    }
}