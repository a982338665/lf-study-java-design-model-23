package pers.middleli.design.proxy;

/**
 * 在切面前后，新加日志功能:
 * 如果使用继承，则需要继续继承，同理如果加多个功能，就会有多个实现类，而且是高度耦合的，也就是说他的实现顺序一旦写好，则不会变更
 * 例如：
 *  ClassImpl1Proxy1 extends ClassImpl1 在ClassImpl1中的test方法前后记录了时间差别
 *  ClassImpl1Proxy1$1 extends ClassImpl1Proxy1 在ClassImpl1Proxy1中的test方法前后又记录了日志
 *  那么，如果我要先做日志，后记录时间，则以上实现则不适用，需要重新写出继承关系
 *  重新做调整
 */
public class ClassImpl1Proxy1$1 extends ClassImpl1Proxy1 {

    @Override
    public void test() throws InterruptedException {
        System.err.println("starting log ...");
        super.test();
        System.err.println("end log ...");
    }
}
