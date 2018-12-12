package proxy.jdkDynamicProxy;

import proxy.Clothes;
import proxy.cglibDynamicProxy.Shirt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy2 implements InvocationHandler {

    private Shirt shirt;

    public JDKProxy2(Shirt shirt){
        this.shirt = shirt;
    }

    public static Object getProxy(Shirt shirt){
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Shirt.class}, new JDKProxy2(shirt));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK 动态代理调用2");

        return method.invoke(shirt, args);
    }
}
