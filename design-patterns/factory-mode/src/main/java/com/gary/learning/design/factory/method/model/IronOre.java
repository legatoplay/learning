package com.gary.learning.design.factory.method.model;

import com.gary.learning.design.factory.method.IMcBlock;

/**
 * Created by Gary on 2018-11-29.
 * 铁矿石
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class IronOre implements IMcBlock {
    @Override
    public void getName() {
        System.out.println("铁矿石");
    }
}
