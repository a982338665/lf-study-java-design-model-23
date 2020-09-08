package pers.before.design.factory.simple;

public class SendFactory {

    /**
     * 简单工厂模式:传递的字符串出错，则不能正确创建对象
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }


    /**
     * 多个工厂方法模式：提供多个工厂方法，分别创建对象
     * @return
     */
    public Sender produceMail() {

        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }


    /***
     *
     * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
     */

    public static Sender produceMailstatic () {

        return new MailSender();
    }

    public static Sender produceSmsstatic () {
        return new SmsSender();
    }

    /**
     * 利用反射-根据类的名称 生产对象
     */
    public static Sender produceByClass(String className) {

        Sender o = null;
        try {
            o = (Sender)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }

}
