package com.gary.learning.design.proxy;

/**
 * Created by Gary on 2018-11-28.
 * 懒汉
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class Deadbeat implements ILunch {

    @Override
    public void buy() {
        System.out.println("买饭");
    }
}
