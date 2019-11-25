package pers.li.proxy;

/**
 * 聚合方式修改：由于代理的类和真实类都实现了接口，那么在代理对象中持有对象即可改为其父接口
 * 可达成松耦合
 * 此类用来添加日志
 */
public class ClassImpl1Proxy2$2 implements InterfaceClass {

    InterfaceClass classImpl1;

    public ClassImpl1Proxy2$2(InterfaceClass classImpl1) {
        this.classImpl1 = classImpl1;
    }

    @Override
    public void test() throws InterruptedException {
        System.err.println("starting log ...");
        classImpl1.test();
        System.err.println("end log ...");
    }
}
