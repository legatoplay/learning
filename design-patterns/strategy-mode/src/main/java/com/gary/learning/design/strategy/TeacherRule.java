package com.gary.learning.design.strategy;

/**
 * Created by Gary on 2018-11-28.
 * 教师借阅策略
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class TeacherRule implements IRule {
    @Override
    public void check() {
        System.out.println("教师可以借阅10本书");
    }
}
