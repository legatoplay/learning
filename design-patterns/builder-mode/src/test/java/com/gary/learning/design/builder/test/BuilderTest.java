package com.gary.learning.design.builder.test;


import com.gary.learning.design.builder.IPhone6;
import com.gary.learning.design.builder.IPhoneDirector;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class BuilderTest {
    public static void main(String[] args) {
        IPhone6 iPhone6 = new IPhoneDirector().buildIPhone6();
        System.out.println(iPhone6.toString());
    }
}
