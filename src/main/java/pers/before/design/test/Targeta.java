package pers.before.design.test;

import java.util.ArrayList;
import java.util.List;

/**
 * create by lishengbo 2018/5/31
 */
public class Targeta {


    List<AObserver> list=new ArrayList<AObserver>();

    public void add(AObserver observer){
        list.add(observer);
    }
    public void remove(AObserver observer){
        list.remove(observer);
    }
    public void notifyAlls(){
        for (AObserver ob :
                list) {
            ob.update(this);
        }
    }

}
