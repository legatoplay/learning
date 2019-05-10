package com.gary.learning.design.proxy.test;

import com.gary.learning.design.proxy.Delivery;

/**
 * Created by Gary on 2018-11-28.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class ProxyTest {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        delivery.buy();
    }
}
