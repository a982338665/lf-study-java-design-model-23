package pers.before.design.observer;

/**
 * create by lishengbo on 2018-05-29 16:51
 * 观察者接口：
 * 定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {


    /**
     * 观察者进行更新的接口
     * 传入目标对象-方便获取相应的目标对象的状态
     * @param target
     */
    void update(target target);
}
