package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // hello라는 url로 오면 이 컨트롤러가 호출될 것
    public String Hello(Model model){
         model.addAttribute("data", "hello!!!!");
         return "hello"; // <-여기 hello에 hello.html이 자동으로 붙는다.(관례가 그럼)
    }
}
