package com.gary.learning.design.builder;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class IPhoneDirector {
    private IBuilder builder;

    public IPhone6 buildIPhone6() {
        builder = new IPhone6Builder();
        return (IPhone6) builder.setColor("red")
                .setRAM(32)
                .getIPhone();
    }
}
