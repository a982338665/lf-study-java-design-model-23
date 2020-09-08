package pers.middleli.design.proxy;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {

//        newSolver();
//        extendsSolver();
//        interfaceSolver();
//        extendsSolver$1();
        interfaceSolver$1$2();
    }


    public static void newSolver() throws InterruptedException {
        InterfaceClass interfaceClass =  new ClassImpl1();
        long start = System.currentTimeMillis();
        interfaceClass.test();
        long end = System.currentTimeMillis();
        System.err.println("time: "+ (end-start));
    }
    public static void extendsSolver() throws InterruptedException {
        InterfaceClass interfaceClass =  new ClassImpl1Proxy1();
        interfaceClass.test();
    }
    public static void interfaceSolver() throws InterruptedException {
        ClassImpl1 classImpl1 = new ClassImpl1();
        InterfaceClass interfaceClass =  new ClassImpl1Proxy2(classImpl1);
        interfaceClass.test();
    }

    public static void extendsSolver$1() throws InterruptedException {
        InterfaceClass interfaceClass =  new ClassImpl1Proxy1$1();
        interfaceClass.test();
    }

    public static void interfaceSolver$1$2() throws InterruptedException {
        //申明目标类
        ClassImpl1 classImpl1 =  new ClassImpl1();
        //时间代理类
        ClassImpl1Proxy2$1 classImpl1Proxy2$1 = new ClassImpl1Proxy2$1(classImpl1);
        //日志代理类
        ClassImpl1Proxy2$2 classImpl1Proxy2$2 = new ClassImpl1Proxy2$2(classImpl1Proxy2$1);
        classImpl1Proxy2$2.test();
        System.err.println("交换顺序也无需产生更多类...");
        //日志代理类
        ClassImpl1Proxy2$2 classImpl1Proxy2$22 = new ClassImpl1Proxy2$2(classImpl1);
        //时间代理类
        ClassImpl1Proxy2$1 classImpl1Proxy2$11 = new ClassImpl1Proxy2$1(classImpl1Proxy2$22);
        classImpl1Proxy2$11.test();

    }
}
