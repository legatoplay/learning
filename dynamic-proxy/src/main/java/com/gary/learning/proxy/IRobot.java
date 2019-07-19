package com.gary.learning.proxy;

import java.util.List;

/**
 * Created by Gary on 2019-06-05.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-05
 * @since 0.0.1
 */
public interface IRobot {
    void sayHello(String name);

    List<String> getList();
}
