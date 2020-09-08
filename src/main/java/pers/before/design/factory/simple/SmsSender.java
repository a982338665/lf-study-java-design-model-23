package pers.before.design.factory.simple;

public class SmsSender implements Sender {
  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}
