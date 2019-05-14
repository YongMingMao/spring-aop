package yong.com.springaop.SpringAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
    @Pointcut("execution(public * yong.com.springaop.SpringAop.*.*(..))")
    public  void pointCut(){}
    @Before("pointCut()")
    public  void doBefore(JoinPoint joinPoint){
        System.out.println("准备执行"+joinPoint.getSignature().getName());
    }
    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("已执行完"+joinPoint.getSignature().getName());
    }
//    下面可以接着写各种通知
////    返回通知
//////    @AfterReturning
//////    异常通知
//////    @AfterThrowing
//////    环绕通知
//////    @Around
}
