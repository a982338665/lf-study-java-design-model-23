package pers.before.design.observer.test;

/**
 * create by lishengbo on 2018-05-30 08:55
 * 真实的观察者--
 *
 */
public class Aobserver implements observer {

    //观察人
    private String name;

    //观察内容
    private String content;

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

    //检测到观察对象被修改时，赋值操作
    public void update(target target) {
        String content = ((ATarget) target).getContent();
        this.content=content;
        System.out.println(name+"-->观察到内容："+content);

    }
}
