package pers.before.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * create by lishengbo on 2018-05-29 16:49
 * 目标对象 知道观察他的观察者，并提供注册，添加和删除观察者的接口
 */
public class target {

    //用来保存注册的观察者对象
    private List<Observer> observers=new ArrayList<Observer>();

    //注册观察者对象
    public void attach(Observer observer){
        observers.add(observer);
    }
    //删除观察者对象
    public void detach(Observer observer){
        observers.remove(observer);
    }
    //通知观察者对象-需要通知已注册的观察者列表中的所有观察者，此方法只有子类可以调用，故protected
    protected void notifyObservers(){
        for (Observer ob:observers
             ) {
            ob.update(this);
        }
    }

}
