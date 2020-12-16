package com.mechempire.sdk.core.game;

import com.mechempire.sdk.core.component.CannonWeapon;
import com.mechempire.sdk.core.component.DefaultAmmunition;
import com.mechempire.sdk.core.component.DestroyerVehicle;
import lombok.Data;

/**
 * package: com.mechempire.sdk.core.game
 *
 * @author <tairy> tairyguo@gmail.com
 * @date 2020/12/13 下午8:27
 * <p>
 * 机甲抽象类
 */
@Data
abstract public class AbstractMech extends AbstractGameMapComponent implements ILiving {
    /**
     * 载具类
     */
    protected Class<?> vehicleClazz = DestroyerVehicle.class;

    /**
     * 武器类
     */
    protected Class<?> weaponClazz = CannonWeapon.class;

    /**
     * 弹药类
     */
    protected Class<?> ammunitionClazz = DefaultAmmunition.class;

    /**
     * 载具
     */
    protected AbstractVehicle vehicle;

    /**
     * 武器
     */
    protected AbstractWeapon weapon;

    /**
     * 弹药
     */
    protected AbstractAmmunition ammunition;
}