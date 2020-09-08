package pers.middleli.design.proxy;

import java.util.Random;

/**
 * 目标类:
 * 问题引入1：当此类是一个jar包的时候，无法修改源码，那么怎么去看test()方法执行使用了多长时间？
 *      1.不能使用new，然后在方法调用前后加时间，取时间差 {@link Test1#newSolver()},这样会包括jdk环境准备时间
 *      2.使用继承：（组合） {@link ClassImpl1Proxy1#test()},{@link Test1#extendsSolver()}
 *      3.使用接口持有对象：（聚合） {@link ClassImpl1Proxy2#test()} {@link Test1#interfaceSolver()}
 * 问题引入2：聚合和组合代理，哪个更好？聚合更好
 *      1.继承方式的代理，如果需要继续在外部加功能，则需要继续新继承类实现 {@link ClassImpl1Proxy1$1}{@link Test1#extendsSolver$1()}
 *      2.聚合代理：{@link ClassImpl1Proxy2$1}{@link ClassImpl1Proxy2$2}{@link Test1#interfaceSolver$1$2()}
 * 问题引入3：静态代理，如果类中有N个方法需要代理，现在有N个类，那么重复的工作量会有很多，因为每一个类的每一个方法都需要做代理
 * 问题引入4：动态代理：
 *      1.
 *
 */
public class ClassImpl1 implements InterfaceClass {
    @Override
    public void test() throws InterruptedException {
        System.err.println("classImpl run ...");
        Thread.sleep(new Random().nextInt(10000));
    }
}
