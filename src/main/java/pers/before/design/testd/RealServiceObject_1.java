package pers.before.design.testd;

/**
 * create by lishengbo 2018/6/12
 */
public class RealServiceObject_1 implements serviceObject {

    private int id;

    private String name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notifyAllof(String content) {
        System.out.println(name+"收到通知:"+content);
    }
}
