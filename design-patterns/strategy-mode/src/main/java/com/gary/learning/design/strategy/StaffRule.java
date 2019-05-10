package com.gary.learning.design.strategy;

/**
 * Created by Gary on 2018-11-28.
 * 员工借书策略
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class StaffRule implements IRule {
    @Override
    public void check() {
        System.out.println("员工可以借阅5本书");
    }
}
