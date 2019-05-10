package com.gary.learning.design.decorator;

/**
 * Created by Gary on 2018-11-28.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class BaseFine implements IFine {

    @Override
    public void fine() {
        System.out.println("你被罚款了");
    }
}
