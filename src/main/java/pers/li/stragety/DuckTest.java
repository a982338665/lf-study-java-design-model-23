package pers.li.stragety;

public class DuckTest {

	public static void main(String[] args){
		Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new BigYellow();
		duck = new SpaceDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
	}

}
