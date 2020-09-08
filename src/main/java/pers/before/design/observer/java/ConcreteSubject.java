package pers.before.design.observer.java;

import java.util.Observable;

/**
 * create by lishengbo on 2018-05-30 11:00
 *
 * 目标的具体实现：
 *
 */
public class ConcreteSubject extends Observable{

    /**
     * 记录对目标观察的内容
     */
    private String content ;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //内容变化-通知所有观察者
        //开启通知
        this.setChanged();
        //主动通知--首先-推模式
        this.notifyObservers(content);

        //拉模型
//        this.notifyObservers();
    }


}
