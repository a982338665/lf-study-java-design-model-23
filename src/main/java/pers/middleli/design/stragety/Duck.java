package pers.middleli.design.stragety;

public abstract class Duck {
  
	public void quack(){
		System.out.println("quack");
	}
	
	public abstract void display();
	
	
	private FlyingStragety flyingStragety;


	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	
	public void fly(){
		flyingStragety.performFly();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
