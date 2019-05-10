package com.gary.learning.design.builder;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public abstract class AbstractIPhone implements IPhone{
    private String color;
    private int RAM;

    public AbstractIPhone() {
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "AbstractIPhone{" +
                "color='" + color + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}
