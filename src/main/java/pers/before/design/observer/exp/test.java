package pers.before.design.observer.exp;

/**
 * create by lishengbo on 2018-05-29 17:26
 * 统一通知---各自处理
 */
public class test {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherTarget weather = new ConcreteWeatherTarget();


        //创建观察者
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteObserver.setObserverName("女朋友");
        concreteObserver.setremindThing("第一次约会====");


        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        concreteObserver2.setObserverName("岳母");
        concreteObserver2.setremindThing("购物----------");
        //注册观察者

        weather.attach(concreteObserver);
        weather.attach(concreteObserver2);

        //目标发布天气

        weather.setWeatherContent("明天天气不错~");

    }
}
