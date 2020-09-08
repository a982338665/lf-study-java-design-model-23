package pers.before.design.test;

/**
 * create by lishengbo 2018/5/31
 */
public class ConObserver implements AObserver {

    private String name;

    private String content;


    public void update(Targeta targeta) {
        String content = ((ConTarget) targeta).getContent();
        this.content=content;
        System.out.println(name+"收到消息："+content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
