package pers.before.design.factory.hard;

/**
 * create by lishengbo on 2018-05-29 15:57
 * 抽象工厂实现类
 */
public class SendFactory_10000 implements SendFactory {

    public sendMail sendMail() {
        return new sendMail_10000();
    }

    public sendSMS sendSmS() {
        return new sendSMS_10000();
    }
}
