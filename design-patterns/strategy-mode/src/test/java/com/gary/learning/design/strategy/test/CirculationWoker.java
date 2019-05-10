package com.gary.learning.design.strategy.test;

import com.gary.learning.design.strategy.RuleChecker;
import com.gary.learning.design.strategy.StaffRule;
import com.gary.learning.design.strategy.StudentRule;
import com.gary.learning.design.strategy.TeacherRule;

/**
 * Created by Gary on 2018-11-28.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-28
 * @since 0.0.1
 */
public class CirculationWoker {
    public static void main(String[] args) {
        RuleChecker ruleChecker = new RuleChecker(new StudentRule());
        ruleChecker.check();

        ruleChecker = new RuleChecker(new TeacherRule());
        ruleChecker.check();

        ruleChecker = new RuleChecker(new StaffRule());
        ruleChecker.check();
    }
}
