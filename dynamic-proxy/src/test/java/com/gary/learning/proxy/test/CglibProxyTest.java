package com.gary.learning.proxy.test;

import com.gary.learning.proxy.FishTank;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.Proxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Gary on 2019-06-05.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-05
 * @since 0.0.1
 */
public class CglibProxyTest {
    @Test
    public void test() {
        FishTank fishTank =new FishTank();
        FishTank fishTankProxy = (FishTank)Enhancer.create(
                fishTank.getClass(),
                (MethodInterceptor) (obj, method, args, proxy) -> {
                    System.out.println("before...");
                    Object ret;
                    ret = method.invoke(fishTank, args);
                    System.out.println("after...");
                    return ret;
                }
        );
        fishTankProxy.changeWater();
    }
}
