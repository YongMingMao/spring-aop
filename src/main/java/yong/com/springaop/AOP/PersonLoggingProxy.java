package yong.com.springaop.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonLoggingProxy {
    //代理对象（Target object）
    private  Person target ;

    public PersonLoggingProxy(Person target) {
        this.target = target;
    }

    public Person getLoggingProxy(){
        Person proxy = null ;
        //得到代理对象的ClassLoader
        ClassLoader loader = target.getClass().getClassLoader() ;
        //得到代理对象的类型
        Class[] interfaces = new Class[]{Person.class,DoSomething.class} ;
        //创建InvocationHandler
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                Class<?> aClass = proxy.getClass();
                System.out.println(aClass.getTypeName()+"调用了"+methodName);
                try {
                    method.invoke(target,args) ;
                }catch (Exception e){
                    e.getStackTrace() ;
                }
                System.out.println(aClass.getTypeName()+"执行完了"+methodName);
                return null;
            }
        };

        proxy = (Person) Proxy.newProxyInstance(loader,interfaces,handler) ;

        return proxy ;
    }
    public void setTarget(Person target) {
        this.target = target;
    }
}
