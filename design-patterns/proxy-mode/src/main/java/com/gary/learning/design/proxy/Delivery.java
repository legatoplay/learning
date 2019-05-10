package com.gary.learning.design.proxy;

/**
 * Created by Gary on 2018-11-28.
 * 送餐员
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class Delivery implements ILunch {

    private ILunch lunch;

    public Delivery() {
        this.lunch = new Deadbeat();
    }

    @Override
    public void buy() {
        lunch.buy();
    }
}
