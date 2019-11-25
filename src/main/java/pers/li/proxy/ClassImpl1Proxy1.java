package pers.li.proxy;

public class ClassImpl1Proxy1 extends ClassImpl1 {

    @Override
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        super.test();
        long end = System.currentTimeMillis();
        System.err.println("time: "+ (end-start));
    }
}
