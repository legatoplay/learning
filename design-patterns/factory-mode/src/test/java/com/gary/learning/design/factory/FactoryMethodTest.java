package com.gary.learning.design.factory;

import com.gary.learning.design.factory.method.CoalOreFactory;
import com.gary.learning.design.factory.method.IMcBlock;
import com.gary.learning.design.factory.method.IronOreFactory;

/**
 * Created by Gary on 2018-11-29.
 * 工厂方法模式测试
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IMcBlock mcBlock = (new CoalOreFactory()).product();
        mcBlock.getName();

        mcBlock = (new IronOreFactory()).product();
        mcBlock.getName();
    }
}
