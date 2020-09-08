package pers.before.design.test;

/**
 * create by lishengbo 2018/5/31
 */
public class test {

    public static void main(String[] args) {
        ConTarget conTarget = new ConTarget();

        ConObserver conObserver = new ConObserver();
        conObserver.setName("妈妈");
        ConObserver conObserver2 = new ConObserver();
        conObserver2.setName("爸爸");

        conTarget.add(conObserver);
        conTarget.add(conObserver2);

        conTarget.setContent(" 我爱你");


    }
}
