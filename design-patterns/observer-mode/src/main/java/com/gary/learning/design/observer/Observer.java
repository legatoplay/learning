package com.gary.learning.design.observer;

/**
 * Created by Gary on 2019-05-10.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-05-10
 * @since 0.0.1
 */
public class Observer implements IObserver {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "接收到消息:" + message);
    }
}
