package pers.li.stragety;


import pers.li.stragety.impl.FlyNoWay;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("������ܴ�ȫ��ƻ�");
	}

}
