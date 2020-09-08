package pers.before.design.factory.simple;

public class FactoryTest {
  
    public static void main(String[] args) {

        /**
         * 简单工厂模式测试———————————————————————————————————————————————————————
         */
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
        /**
         * 多个工厂方法模式测试————————————————————————————————————————————————————
         */
        Sender sender2 = factory.produceMail();
        sender2.Send();
        /**
         * 静态工厂模式测试———————————————————————————————————————————————————————
         */
        Sender sender3 = SendFactory.produceMailstatic();
        sender3.Send();

        /**
         * 由于静态工厂模式不需要实例化工厂类，所以最常用=======
         */


        /**
         * 利用反射进行工厂模式实现---类的全路径
         */
        Sender sender1 = SendFactory.produceByClass("pers.before.design.factory.simple.SmsSender");
        sender1.Send();

    }  
}
