package com.gary.learning.design.factory.abstraction;

import com.gary.learning.design.factory.abstraction.model.Burrito;
import com.gary.learning.design.factory.abstraction.model.Omelette;

/**
 * Created by Gary on 2018-11-29.
 * 卷饼加蛋
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class BurritoAndOmeletteFactory implements IFoodFactory {

    @Override
    public IFood createFood() {
        return new Burrito();
    }

    @Override
    public IAdditional createAdditional() {
        return new Omelette();
    }
}
