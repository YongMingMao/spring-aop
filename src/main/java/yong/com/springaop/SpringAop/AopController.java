package yong.com.springaop.SpringAop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AopController {
    @ResponseBody
    @RequestMapping("/aop")
    public String aopController(){
        return "执行成功" ;
    }
}
