package pers.before.design.observer.last;

/**
 * create by lishengbo on 2018-05-30 11:45
 *
 */
public interface Observer {


    public void update(WeatherSubject weatherSubject);


    public String  getName();

}
