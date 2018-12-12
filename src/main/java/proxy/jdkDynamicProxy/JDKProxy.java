package proxy.jdkDynamicProxy;

import proxy.Clothes;
import proxy.Hat;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Clothes clothes;

    public JDKProxy(Clothes clothes){
        this.clothes = clothes;
    }

    public static Object getProxy(Clothes clothes){
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Clothes.class}, new JDKProxy(clothes));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK 动态代理调用");

        return method.invoke(clothes, args);
    }
}
