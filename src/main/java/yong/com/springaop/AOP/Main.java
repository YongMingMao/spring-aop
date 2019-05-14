package yong.com.springaop.AOP;

public class Main {
    public static void main(String[] args) {
        Person zhangsan = new Zhangsan() ;
        Person proxy = new PersonLoggingProxy(zhangsan).getLoggingProxy();
        proxy.sayHello();

        Person lisi =new Lisi() ;
        Person proxy1 = new PersonLoggingProxy(lisi).getLoggingProxy();
        proxy1.sayHello();


    }
}
