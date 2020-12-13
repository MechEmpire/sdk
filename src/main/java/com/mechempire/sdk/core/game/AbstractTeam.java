package com.mechempire.sdk.core.game;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午3:01
 * <p>
 * 队伍抽象类
 */
abstract public class AbstractTeam extends AbstractGameObject {

    /**
     * 队伍唯一 ID
     */
    private long teamId;

    /**
     * 队伍名称
     */
    private String teamName;

    /**
     * 成员数量
     */
    private short memberCount;
}