package proxy.staticProxy;

import proxy.Clothes;

public class StaticProxy implements Clothes {

    private Clothes clothes;

    public StaticProxy(Clothes clothes){
        this.clothes = clothes;
    }

    public void wear() {
        System.out.println("静态代理调用");
        clothes.wear();
    }
}
