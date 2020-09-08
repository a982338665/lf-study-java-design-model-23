package pers.before.design.observer.last;

/**
 * create by lishengbo on 2018-05-30 11:50
 *
 * 真实的目标对象
 */
public class ConcreteWeatherSubject extends WeatherSubject{

    /**
     * 天气情况
     */
    private String content;

    public String getContent() {
        return content;
    }

    /**
     * 天气情况改变时，需要有针对性通知
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
        this.notifyServers();
    }

    /**
     * 通知
     */
    protected void notifyServers() {
        for (Observer s:observers
             ) {
            if(content.contains("雨")&&s.getName().equals("long")){
                s.update(this);
            }
            if(content.contains("雪")&&s.getName().equals("long")){
                s.update(this);
            }
            if(content.contains("雪")&&s.getName().equals("longMa")){
                s.update(this);
            }

        }
    }
}
