package pers.before.design.test;

/**
 * create by lishengbo 2018/5/31
 */
public class ConTarget extends Targeta {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyAlls();
    }
}
