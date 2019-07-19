package com.gary.learning.proxy;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<String> getList() {
        return new ArrayList<String>() {{
            this.add("1111");
        }};
    }
}
