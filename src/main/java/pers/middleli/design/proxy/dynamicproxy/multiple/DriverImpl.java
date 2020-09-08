package pers.middleli.design.proxy.dynamicproxy.multiple;

public class DriverImpl implements Driver{
	public void doWork()
	{
		System.out.println("cook for you");
	}

	@Override
	public void driver() {
		System.err.println("driver ...");
	}
}
