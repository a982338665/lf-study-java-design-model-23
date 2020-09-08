package pers.before.design.observer.last;

import java.util.ArrayList;
import java.util.List;

/**
 * create by lishengbo on 2018-05-30 11:36
 * 目标对象----
 */
public abstract class WeatherSubject {

    //用来保存注册的观察者对象
    public List<Observer> observers=new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }
    protected abstract void notifyServers();


}
