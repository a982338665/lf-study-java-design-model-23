package pers.middleli.design.stragety;


import pers.middleli.design.stragety.impl.FlyWithWin;

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
