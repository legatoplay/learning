package com.gary.learning.design.factory.abstraction.model;

import com.gary.learning.design.factory.abstraction.IAdditional;

/**
 * Created by Gary on 2018-11-29.
 * 煎鸡蛋
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class Omelette implements IAdditional {
    public Omelette() {
        additional();
    }

    @Override
    public void additional() {
        System.out.println("煎鸡蛋");
    }
}
