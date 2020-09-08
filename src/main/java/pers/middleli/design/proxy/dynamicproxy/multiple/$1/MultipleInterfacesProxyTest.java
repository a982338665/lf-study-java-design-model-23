package pers.middleli.design.proxy.dynamicproxy.multiple.$1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class MultipleInterfacesProxyTest {

    public static void main(String[] args) throws Exception {

        //创建代理对象CookImpl
        Cook cook = new CookImpl();
        //1.获取类加载器
        ClassLoader cl = MultipleInterfacesProxyTest.class.getClassLoader();
        //2.创建调用处理器对象
        ProxyHandler handler = new ProxyHandler(cook);

        //生成代理类型
        // Subject proxySubject =
        //        		(Subject) Proxy.newProxyInstance
        //        		  (SubjectImpl.class.getClassLoader(),
        //                   SubjectImpl.class.getInterfaces(), handler);
        //3.创建代理类：代理两个接口
        //此处要注意，接口的先后顺序，因为之前的代理对象为cook，所以要把cookie放在前面，当他们是同名方法的时候，此时
        //Driver执行的dowork方法实际执行的是Cook的此方法
        Class<?> proxyClass = Proxy.getProxyClass(cl, new Class<?>[]{Cook.class, Driver.class});

        //4.生成代理对象：两个接口
        Object proxy = proxyClass.getConstructor(new Class[]{InvocationHandler.class}).
                newInstance(new Object[]{handler});
        //5.输出判断：代理类是否是ProxyClass
        System.out.println(Proxy.isProxyClass(proxyClass));

        //6.将生成的代理对象强转为代理对象Proxy
        Proxy p = (Proxy) proxy;
        //7.打印出
        System.out.println(p.getInvocationHandler(proxy).getClass().getName());
        System.out.println("proxy类型:" + proxyClass.getName());

        //代理对象都继承于java.lang.reflect.Proxy，但是获取父类确是Object而不是Proxy
        Class father = proxyClass.getSuperclass();
        System.out.println("proxy的父类类型:" + father.getName());

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

        Cook c = (Cook) proxy;
        c.doWork();
        c.cook();

        Driver d = (Driver) proxy;
        d.doWork();
        d.driver();
    }
}
