package com.mechempire.sdk.core.game;

import java.util.List;

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
    protected long teamId;

    /**
     * 队伍名称
     */
    protected String teamName;

    /**
     * 机甲类列表
     */
    protected List<Class<?>> mechClassList;

    /**
     * 机甲列表
     */
    protected List<AbstractMech> mechList;

    abstract public List<Class<?>> getMechClassList();

    abstract public long getTeamId();

    abstract public String getTeamName();

    abstract public List<AbstractMech> getMechList();

    abstract public void setMechList(List<AbstractMech> mechList);
}