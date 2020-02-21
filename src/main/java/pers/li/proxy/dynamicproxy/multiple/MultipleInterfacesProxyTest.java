package pers.li.proxy.dynamicproxy.multiple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class MultipleInterfacesProxyTest {

    public static void main(String[] args) throws Exception {

        //创建代理对象CookImpl
        Cook cook = new CookImpl();
        //2.创建调用处理器对象
        ProxyHandler handler1 = new ProxyHandler(cook);

        Driver driver = new DriverImpl();
        ProxyHandler handler2 = new ProxyHandler(driver);


        //
        Object proxy1 = getProxy(handler1, new Class[]{Cook.class,Driver.class});
        Object proxy2 = getProxy(handler2, new Class[]{Driver.class,Cook.class});

        Cook c = (Cook) proxy1;
        c.doWork();
        c.cook();

        Driver d = (Driver) proxy2;
        d.doWork();
        d.driver();
    }

    /**
     * 公共的代理类的调用处理器
     * @param handler
     * @param classes new Class<?>[]{Cook.class, Driver.class},需要代理的接口数据
     * @return
     */
    public static Object getProxy(ProxyHandler handler,Class[] classes) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取类加载器
        ClassLoader cl = MultipleInterfacesProxyTest.class.getClassLoader();
        //2.创建代理类：代理两个接口
        Class<?> proxyClass = Proxy.getProxyClass(cl, classes);
        //3.生成代理对象：两个接口
        Object proxy = proxyClass.getConstructor(new Class[]{InvocationHandler.class}).
                newInstance(new Object[]{handler});
        //打印相关信息++++++++++++++++++++++++++++++++++++++++++
        printInfo(proxyClass, proxy);
        //4.返回代理对象
        return proxy;
    }

    private static void printInfo(Class<?> proxyClass, Object proxy) {
        //5.输出判断：代理类是否是ProxyClass
        System.out.println(Proxy.isProxyClass(proxyClass));
        //6.将生成的代理对象强转为代理对象Proxy
        Proxy p = (Proxy) proxy;
        //7.打印出代理类的实际处理器-即自定义的ProxyHandler
        System.out.println(p.getInvocationHandler(proxy).getClass().getName());
        //8.生成的代理类的名称com.sun.proxy.$Proxy0
        System.out.println("proxy类型:" + proxyClass.getName());
        //9.代理对象都继承于java.lang.reflect.Proxy，但是获取父类确是Object而不是Proxy
        Class father = proxyClass.getSuperclass();
        //10.java.lang.reflect.Proxy
        System.out.println("proxy的父类类型:" + father.getName());
        //父类接口
        Class[] cs = proxy.getClass().getInterfaces();
        for (Class c : cs) {
            System.out.println("proxy的父接口类型:" + c.getName());
        }
        System.out.println("=====================");
        Method[] ms = proxy.getClass().getMethods();
        for (Method m : ms) {
            System.out.println("调用方法 " + m.getName() + "；参数为 " + Arrays.deepToString(m.getParameters()));
        }
        System.out.println("=====================");
    }

    ;



}
