package com.gary.learning.design.factory.abstraction;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public interface IFoodFactory {
    IFood createFood();

    IAdditional createAdditional();
}
