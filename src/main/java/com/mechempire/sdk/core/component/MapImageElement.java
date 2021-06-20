package com.mechempire.sdk.core.component;

import com.mechempire.sdk.constant.MapImageElementType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * package: com.mechempire.sdk.core.component
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2021/6/19 上午11:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapImageElement {

    private String source;

    private int offsetX;

    private int offsetY;

    private int width;

    private int height;

    private double opacity;

    private MapImageElementType imageType;
}