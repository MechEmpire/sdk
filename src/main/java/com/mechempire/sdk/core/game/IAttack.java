package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/14 下午6:04
 * <p>
 * 攻击行为接口
 */
public interface IAttack {

    /**
     * 射击
     */
    void shooting();

    /**
     * 碰撞
     */
    void collide();
}