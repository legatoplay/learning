package com.gary.learning.design.observer;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by Gary on 2019-05-10.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-05-10
 * @since 0.0.1
 */
public class MyFriendCircle implements IFriendCircle {

    private String message;
    private static Set<IObserver> observers = new CopyOnWriteArraySet<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(this.message);
        }
    }

    //设置朋友圈信息
    public void setMessage(String message) {
        this.message = message;
        notifyObserver();//刷新
    }
}
