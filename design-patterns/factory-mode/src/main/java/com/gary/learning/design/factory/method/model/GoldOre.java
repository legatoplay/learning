package com.gary.learning.design.factory.method.model;

import com.gary.learning.design.factory.method.IMcBlock;

/**
 * Created by Gary on 2018-11-29.
 * 金矿石
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class GoldOre implements IMcBlock {
    @Override
    public void getName() {
        System.out.println("金矿石");
    }
}
