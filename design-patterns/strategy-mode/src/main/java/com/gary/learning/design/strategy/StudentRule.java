package com.gary.learning.design.strategy;

/**
 * Created by Gary on 2018-11-28.
 * 学生借阅策略
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class StudentRule implements IRule {
    @Override
    public void check() {
        System.out.println("学生可以借阅3本书");
    }
}
