package pers.before.design.factory.hard;

/**
 * create by lishengbo on 2018-05-29 15:57
 * 抽象工厂实现类
 */
public class SendFactory_10086 implements SendFactory {

    public sendMail sendMail() {
        return new sendMail_10086();
    }

    public sendSMS sendSmS() {
        return new sendSMS_10086();
    }
}
