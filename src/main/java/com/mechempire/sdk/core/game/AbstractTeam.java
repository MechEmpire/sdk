package com.mechempire.sdk.core.game;

import java.util.ArrayList;
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
     * 最大允许的机甲数量
     */
    private static final short MAX_MECH_COUNT = 1; // 暂时支持一个

    /**
     * 队伍唯一 ID
     */
    protected long teamId;

    /**
     * 队伍名称
     */
    protected String teamName;

    /**
     * 机甲列表
     */
    protected List<AbstractMech> mecheList = new ArrayList<>(4);

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<AbstractMech> getMecheList() {
        return mecheList;
    }

    public final void setMecheList(List<AbstractMech> mecheList) {
        this.mecheList = mecheList;
    }

    public final void appendMech(AbstractMech mech) {
        if (this.mecheList.size() > MAX_MECH_COUNT) {
            return;
        }

        this.mecheList.add(mech);
    }
}