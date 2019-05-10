package com.gary.learning.design.builder;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class IPhone6 extends AbstractIPhone {
    static {
        System.out.println("the iphone 6");
    }

    @Override
    public String toString() {
        return "IPhone6{} " + super.toString();
    }
}
