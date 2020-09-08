package pers.before.design.factory.hard;

/**
 * create by lishengbo on 2018-05-29 16:10
 */
public class test {
    public static void main(String[] args) {


        SendFactory factory10000 = new SendFactory_10000();
        sendMail sendMail = factory10000.sendMail();
        sendMail.send();
        factory10000.sendSmS();

        SendFactory factory10086 = new SendFactory_10086();
        pers.li.design.factory.hard.sendMail sendMail1 = factory10086.sendMail();
        sendMail1.send();
        factory10086.sendSmS();

    }
}
