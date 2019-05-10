package com.gary.learning.design.prototype.test;

import com.gary.learning.design.prototype.Email;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email("买车优惠活动", "十一期间买车就送一个超级大娃娃");
        for (int i = 1; i < 100; i++) {
            Email copyEmail = email.clone();
            copyEmail.setReceiver(String.valueOf(i));
            System.out.println(copyEmail);
        }
    }
}
