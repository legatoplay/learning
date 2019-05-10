package com.gary.learning.design.factory.abstraction.model;

import com.gary.learning.design.factory.abstraction.IFood;

/**
 * Created by Gary on 2018-11-29.
 * 手抓饼
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class HandCake implements IFood {
    public HandCake() {
        food();
    }

    @Override
    public void food() {
        System.out.println("手抓饼");
    }
}
