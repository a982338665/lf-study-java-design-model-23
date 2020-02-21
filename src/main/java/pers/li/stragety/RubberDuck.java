package pers.li.stragety;


import pers.li.stragety.impl.FlyNoWay;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("��ȫ���ƣ���ͺܺ�");
	}
	
	
	public void quack(){
		System.out.println("��~��~��~");
	}

}
