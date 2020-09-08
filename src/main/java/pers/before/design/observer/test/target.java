package pers.before.design.observer.test;

import java.util.ArrayList;
import java.util.List;

/**
 * create by lishengbo on 2018-05-30 08:53
 * 观察的-----目标对象
 */
public class target {

    private  List<observer> observers=new ArrayList<observer>();

    public void add(observer observer){
        observers.add(observer);
    }
    public void remove(observer observer){
        observers.remove(observer);
    }
    public void notifyServers(){
        for (int i = 0; i <observers.size() ; i++) {
            observers.get(i).update(this);
        }
    }


}
