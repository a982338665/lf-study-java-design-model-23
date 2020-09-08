package pers.middleli.design.singleton;

/**
 * 饿汉式：类加载时初始化，线程安全
 *      优点：没有加锁，执行效率会提高。
 *      缺点：类加载时就初始化，分配内存。
 *      基于 classloader 机制避免了多线程的同步问题，
 */
public class HungrySingleton {

    //1.构造方法私有化
    private HungrySingleton(){}

    //2.私有静态属性
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //3.对外公开获取方法
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
