package com.gary.learning.design.factory.method;

import com.gary.learning.design.factory.method.model.CoalOre;

/**
 * Created by Gary on 2018-11-29.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-11-29
 * @since 0.0.1
 */
public class CoalOreFactory implements IFactory {
    @Override
    public IMcBlock product() {
        return new CoalOre();
    }
}
