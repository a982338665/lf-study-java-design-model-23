package pers.li.singleton;

/**
 * 线程安全的懒汉式：
 *  1.使用synchronized关键字：
 *      1.将并行改为串行执行，保证实例化只有一次
 *      2.实例化成功后，依旧有锁，那么在并发访问时，等同于读读加锁，性能较差不推荐
 */
public class LazySingletonSafe1 {

    //1.构造方法私有化
    private LazySingletonSafe1(){}

    //2.私有静态属性
    private static LazySingletonSafe1 hungrySingleton = null;

    //3.对外公开获取方法
    public static synchronized LazySingletonSafe1 getInstance(){
        //步骤1
        if(hungrySingleton == null){
            //步骤2
            hungrySingleton = new LazySingletonSafe1();
        }
        //步骤3
        return hungrySingleton;
    }
}
