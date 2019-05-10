package com.gary.learning.design.factory.abstraction.model;

import com.gary.learning.design.factory.abstraction.IAdditional;

/**
 * Created by Gary on 2018-11-29.
 * 烤肠
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class Sausage implements IAdditional {
    public Sausage() {
        additional();
    }

    @Override
    public void additional() {
        System.out.println("烤肠");
    }
}
