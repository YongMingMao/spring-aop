package yong.com.springaop.AOP;

public class Lisi implements Person ,DoSomething{
    private  String name ;

    @Override
    public void haveLunch() {
        System.out.println("having lunch>>>>>>");
    }

    {
        name = "Lisi" ;
    }
    @Override
    public void sayHello() {

        System.out.println("hello , I am "+ name);

    }

}
