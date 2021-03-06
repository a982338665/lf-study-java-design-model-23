package pers.middleli.design.proxy.dynamicproxy.multiple;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理类的调用处理器
 */
class ProxyHandler implements InvocationHandler {
    private Object cook;
    public ProxyHandler(Object cook){
        this.cook = cook;
    }

    //此函数在代理对象调用任何一个方法时都会被调用。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
    	System.out.println("proxy类型:" + proxy.getClass().getName());
        Class[] cs = proxy.getClass().getInterfaces();
        for (Class c : cs) {
            System.out.println("proxy的父接口类型:" + c.getName());
        }
    	System.out.println("调用方法 " + method + "；参数为 " + Arrays.deepToString(args));
        Object result = method.invoke(cook, args);
        return result;
    }
}
