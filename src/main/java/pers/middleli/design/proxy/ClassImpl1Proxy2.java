package pers.middleli.design.proxy;

public class ClassImpl1Proxy2 implements InterfaceClass {

    ClassImpl1 classImpl1;

    public ClassImpl1Proxy2(ClassImpl1 classImpl1) {
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
