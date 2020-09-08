package pers.before.design.observer.exp;

/**
 * create by lishengbo on 2018-05-29 16:50
 * 具体的目标对象-负责把有关状态存入到相应的观察者对象中
 *
 * 天气预报
 *
 */
public class ConcreteWeatherTarget extends Weathertarget {

    //目标对象状态
    //天气内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //拉模型---自己获取
        //this.notifyObservers();

        //推模型--推送指定内容
        this.notifyObservers(weatherContent);
    }
}
