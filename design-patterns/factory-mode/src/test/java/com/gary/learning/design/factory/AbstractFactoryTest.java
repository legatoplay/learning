package com.gary.learning.design.factory;

import com.gary.learning.design.factory.abstraction.IFoodFactory;
import com.gary.learning.design.factory.abstraction.PancakeAndOmeletteFactory;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFoodFactory foodFactory = new PancakeAndOmeletteFactory();
        foodFactory.createFood();
        foodFactory.createAdditional();
    }
}
