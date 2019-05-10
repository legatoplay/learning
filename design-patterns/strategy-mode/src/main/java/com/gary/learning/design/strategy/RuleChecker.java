package com.gary.learning.design.strategy;

/**
 * Created by Gary on 2018-11-28.
 * 借阅规则检查
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class RuleChecker {

    private IRule rule;

    public RuleChecker(IRule rule) {
        this.rule = rule;
    }

    public void check() {
        this.rule.check();
    }
}
