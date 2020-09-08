package pers.before.design.observer.test;

/**
 * create by lishengbo on 2018-05-30 08:54
 *
 * 真实的目标对象
 *
 */
public class ATarget extends target{

    //观察的内容
    private String content;

    public String getContent() {
        return content;
    }

    //在内容被修改时，通知所有的观察者
    public void setContent(String content) {
        this.content = content;
        this.notifyServers();
    }













}
