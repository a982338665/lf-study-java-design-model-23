package pers.before.design.observer.exp;

/**
 * create by lishengbo on 2018-05-29 16:53
 *
 * 具体的观察者对象，实现更新的方法，使自身状态和目标状态一致
 * 名字跟提醒消息，自己设置，content获取
 */
public class ConcreteObserver implements Observer {

    //观察者状态----与目标状态保持一致
//    private String obserberStatus;


    /**
     * 观察者(订阅者)名字
     */
    private String observerName;
    /**
     * 天气内容
     */
    private String weatherContent;
    /**
     * 提醒内容 提醒约会/购物
     */
    private String remindThing;


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getremindThing() {
        return remindThing;
    }

    public void setremindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    /**
     * 获取目标类的状态同步到观察者状态中
     * @param target
     */
    public void update(Weathertarget target) {
//        obserberStatus=((ConcreteWeatherTarget)target).getWeatherContent();
        weatherContent=((ConcreteWeatherTarget)target).getWeatherContent();
        System.out.println(observerName+"收到了："+weatherContent+","+remindThing);
    }
    /**
     * 推模型实现--按需定制
     * @param content
     */
    public void update(String content) {
        weatherContent=content;
        System.out.println(observerName+"收到了："+weatherContent+","+remindThing);
    }
}
