package pers.before.design.observer.last;

/**
 * create by lishengbo on 2018-05-30 13:12
 */
public class Concreteobserver implements  Observer {

    private String name;

    private String content;

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void update(WeatherSubject weatherSubject) {
        String content = ((ConcreteWeatherSubject) weatherSubject).getContent();
        System.out.println(name+":收到了-->"+content);
    }

    public String getName() {
        return this.name=name;
    }
}
