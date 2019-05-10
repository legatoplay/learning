package com.gary.learning.design.observer;

/**
 * Created by Gary on 2019-05-10.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-05-10
 * @since 0.0.1
 */
public class ObserverTest {
    public static void main(String[] args) {
        IObserver observer1 = new Observer("张三");
        IObserver observer2 = new Observer("李四");

        MyFriendCircle friendCircle = new MyFriendCircle();
        friendCircle.registerObserver(observer1);
        friendCircle.registerObserver(observer2);
        friendCircle.setMessage("回家吃饭");
        System.out.println("-------");
        friendCircle.deleteObserver(observer2);
        friendCircle.setMessage("回家吃饭");
    }
}
