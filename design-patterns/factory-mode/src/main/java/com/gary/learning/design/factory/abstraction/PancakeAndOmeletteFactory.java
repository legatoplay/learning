package com.gary.learning.design.factory.abstraction;

import com.gary.learning.design.factory.abstraction.model.Omelette;
import com.gary.learning.design.factory.abstraction.model.Pancake;

/**
 * Created by Gary on 2018-11-29.
 * 卷饼加蛋
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class PancakeAndOmeletteFactory implements IFoodFactory {
    @Override
    public IFood createFood() {
        return new Pancake();
    }

    @Override
    public IAdditional createAdditional() {
        return new Omelette();
    }
}
