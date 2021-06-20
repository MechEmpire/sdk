package com.mechempire.sdk.runtime;

import com.google.common.collect.Lists;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * package: com.mechempire.sdk.runtime
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2021/5/9 下午7:18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientGameMap extends GameMap {

    /**
     * 地图背景
     */
    protected Background background;

    /**
     * 图片组件
     */
    protected List<ImageView> imageViewList = Lists.newArrayList();
}