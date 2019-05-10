package com.gary.learning.design.factory.abstraction.model;

import com.gary.learning.design.factory.abstraction.IFood;

/**
 * Created by Gary on 2018-11-29.
 * 煎饼
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class Pancake implements IFood {
    public Pancake() {
        food();
    }

    @Override
    public void food() {
        System.out.println("煎饼");
    }
}
