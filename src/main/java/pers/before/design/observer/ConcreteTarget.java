package pers.before.design.observer;

/**
 * create by lishengbo on 2018-05-29 16:50
 * 具体的目标对象-负责把有关状态存入到相应的观察者对象中
 *
 * 天气预报
 *
 */
public class ConcreteTarget extends target {

    //目标对象状态
    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    //状态改变时候通知
    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        this.notifyObservers();
    }
}
