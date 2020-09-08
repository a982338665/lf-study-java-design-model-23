package pers.before.design.factory.hard;

/**
 * create by lishengbo on 2018-05-29 15:54
 *
 * 发送消息的抽象工厂接口：
 *
 */
public interface SendFactory {

    public sendMail sendMail();

    public sendSMS sendSmS();
}
