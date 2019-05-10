package com.gary.learning.design.observer;

/**
 * Created by Gary on 2019-05-10.
 * 被观察者
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-05-10
 * @since 0.0.1
 */
public interface IFriendCircle {
    /**
     * 添加观察者
     * 白名单
     *
     * @param observer
     */
    void registerObserver(IObserver observer);

    /**
     * 删除观察者
     * 黑名单
     *
     * @param observer
     */
    void deleteObserver(IObserver observer);

    /**
     * 通知
     */
    void notifyObserver();
}
