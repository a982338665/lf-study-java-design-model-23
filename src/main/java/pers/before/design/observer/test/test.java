package pers.before.design.observer.test;

/**
 * create by lishengbo on 2018-05-30 09:06
 */
public class test {

    public static void main(String[] args) {


        //创建观察目标
        ATarget aTarget = new ATarget();


        //创建观察者
        Aobserver aobserver = new Aobserver();
        aobserver.setName("lishengbo");

        Aobserver aobserver2 = new Aobserver();
        aobserver2.setName("hailaing");
        //注册观察者
        aTarget.add(aobserver);
        aTarget.add(aobserver2);

        //观察的目标发布的内容
        aTarget.setContent("hello、，everybody");




    }
}
