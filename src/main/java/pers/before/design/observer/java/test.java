package pers.before.design.observer.java;

/**
 * create by lishengbo on 2018-05-30 11:12
 */
public class test
{

    public static void main(String[] args) {

        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ConreteObserver huangming = new ConreteObserver();
        huangming.setName("黄明");
        //创建观察者
        ConreteObserver mom = new ConreteObserver();
        mom.setName("黄明MOM");

        //注册观察者
        subject.addObserver(huangming);
        subject.addObserver(mom);

        //目标对象发布内容
        subject.setContent("--------------------");




    }
}
