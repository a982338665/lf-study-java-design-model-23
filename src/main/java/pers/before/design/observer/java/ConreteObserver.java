package pers.before.design.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * create by lishengbo on 2018-05-30 11:05
 *
 * 具体的观察者对象
 */
public class ConreteObserver implements Observer{

    /**
     * 观察者
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param o    -传的是目标引用---拉模式
     * @param arg  -推送的内容   ---推模式
     */
    public void update(Observable o, Object arg) {
        //推
        System.out.println(name+"收到消息推--->："+arg);
        //拉
        System.out.println(name+"收到消息拉："+((ConcreteSubject)o).getContent());
    }
}
