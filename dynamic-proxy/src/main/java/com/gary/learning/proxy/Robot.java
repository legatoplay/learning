package com.gary.learning.proxy;

/**
 * Created by Gary on 2019-06-05.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-05
 * @since 0.0.1
 */
public class Robot implements IRobot {
    @Override
    public void sayHello(String name) {
        System.out.println("hello ".concat(name));
    }
}
