package proxy;

import proxy.cglibDynamicProxy.CglibProxy;
import proxy.cglibDynamicProxy.Shirt;
import proxy.jdkDynamicProxy.JDKProxy;
import proxy.jdkDynamicProxy.JDKProxy2;
import proxy.staticProxy.StaticProxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 静态代理
        Hat hat = new Hat();
        StaticProxy staticProxy = new StaticProxy(hat);
        staticProxy.wear();

        // JDK 动态调用
        Clothes hatJDKProxy = (Clothes) JDKProxy.getProxy(hat);
        hatJDKProxy.wear();

        Shirt shirt = new Shirt();

        /*// JDK 动态调用2  Shirt is not an interface
        Shirt hatJDKProxy2 = (Shirt) JDKProxy2.getProxy(shirt);
        hatJDKProxy2.wear();*/

        // CGLIB 动态调用
        Shirt hatCglibProxy = (Shirt) CglibProxy.getProxy(shirt);
        hatCglibProxy.wear();
    }


}
