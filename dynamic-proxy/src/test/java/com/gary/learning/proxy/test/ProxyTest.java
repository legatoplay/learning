package com.gary.learning.proxy.test;

import com.gary.learning.proxy.IRobot;
import com.gary.learning.proxy.Robot;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Gary on 2019-06-05.
 * java 动态代理，必须有接口定义
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-05
 * @since 0.0.1
 */
public class ProxyTest {
    @Test
    public void testRobot1() {
        IRobot robot = new Robot();
        IRobot finalRobot = robot;
        robot = (IRobot) Proxy.newProxyInstance(
                IRobot.class.getClassLoader(),
                robot.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("--before say hello...");
                    Object ret = method.invoke(finalRobot, args);
                    System.out.println("--after say hello...");
                    return ret;
                });
        robot.sayHello("test");
    }

    @Test
    public void testRobot2() {
        IRobot robot = new Robot();
        IRobot robotProxy = (IRobot) Proxy.newProxyInstance(
                IRobot.class.getClassLoader(),
                new Class[]{IRobot.class},
                (proxy, method, args) -> {
                    System.out.println("--before say hello...");
                    Object ret = method.invoke(robot, args);
                    System.out.println("--after say hello...");
                    return ret;
                });
        robotProxy.sayHello("test");
    }
}
