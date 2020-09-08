package pers.middleli.design.proxy.dynamicproxy.multiple;

public class CookImpl implements Cook{
	public void doWork()
	{
		System.out.println("cook for you");
	}

	@Override
	public void cook() {
		System.err.println("cook ...");
	}
}
