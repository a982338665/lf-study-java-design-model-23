package pers.li.stragety;


import pers.li.stragety.impl.FlyWithWin;

public class MallardDuck extends Duck {

	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("display");
	}

}
