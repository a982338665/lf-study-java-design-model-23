package pers.middleli.design.stragety;


import pers.middleli.design.stragety.impl.FlyWithWin;

public class RedheadDuck extends Duck {

	public RedheadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("�ҵ�ͷ�Ǻ�ɫ��");
	}

}
