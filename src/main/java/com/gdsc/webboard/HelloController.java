package com.gdsc.webboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String index() {
        return "안녕하세요 webboard에 오신 것을 환영합니다";
    }

}
