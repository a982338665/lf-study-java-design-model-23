package pers.middleli.design.proxy;

/**
 * 聚合方式修改：由于代理的类和真实类都实现了接口，那么在代理对象中持有对象即可改为其父接口
 * 可达成松耦合
 * 此类用来添加时间
 */
public class ClassImpl1Proxy2$1 implements InterfaceClass {

    InterfaceClass classImpl1;

    public ClassImpl1Proxy2$1(InterfaceClass classImpl1) {
        this.classImpl1 = classImpl1;
    }

    @Override
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        classImpl1.test();
        long end = System.currentTimeMillis();
        System.err.println("time: "+ (end-start));
    }
}
