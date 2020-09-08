package pers.before.design.testd;

/**
 * create by lishengbo 2018/6/12
 */
public class testtttt {

    public static void main(String[] args) {
        serviceCenter serviceCenter=new serviceCenter();

        RealServiceObject_1 realServiceObject_1 = new RealServiceObject_1();
        realServiceObject_1.setName("妈妈");
        RealServiceObject_1 realServiceObject_2 = new RealServiceObject_1();
        realServiceObject_2.setName("爸爸");
        RealServiceObject_1 realServiceObject_3 = new RealServiceObject_1();
        realServiceObject_3.setName("姐姐");

        serviceCenter.add(realServiceObject_1);
        serviceCenter.add(realServiceObject_2);
        serviceCenter.add(realServiceObject_3);

        serviceCenter.setContent("今天天气不错---");

    }
}
