package com.gary.learning.design.builder;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class IPhone6Builder implements IBuilder {
    AbstractIPhone iPhone = new IPhone6();

    @Override
    public IBuilder setColor(String color) {
        iPhone.setColor(color);
        return this;
    }


    @Override
    public IBuilder setRAM(int ram) {
        iPhone.setRAM(ram);
        return this;
    }

    @Override
    public IPhone getIPhone() {
        return iPhone;
    }
}
