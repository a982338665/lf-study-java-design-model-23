package pers.before.design.observer.last;


/**
 * create by lishengbo on 2018-05-30 13:15
 */
public class test {

    public static void main(String[] args) {

        //目标
        ConcreteWeatherSubject concreteSubject = new ConcreteWeatherSubject();

        //监听者
        Concreteobserver concreteobserver = new Concreteobserver();
        concreteobserver.setName("longMa");

        Concreteobserver concreteobserver2 = new Concreteobserver();
        concreteobserver2.setName("long");

        //注册监听者
        concreteSubject.add(concreteobserver);
        concreteSubject.add(concreteobserver2);

        //设置回馈消息
        concreteSubject.setContent("明天下也下雨-->");




    }
}
