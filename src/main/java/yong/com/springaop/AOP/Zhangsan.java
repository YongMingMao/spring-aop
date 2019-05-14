package yong.com.springaop.AOP;

public class Zhangsan implements Person{
    private String name ;
    {
        name = "zhangsan" ;
    }
    @Override
    public void sayHello() {

        System.out.println("hello , I am "+ name);

    }
}
