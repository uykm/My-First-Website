package com.gdsc.webboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/webboard")
    @ResponseBody
    public void index() {
        System.out.println("index");
    }

    /*
    Error resolving template [redirect/question/list], template might not exist or might not be accessible by any of the configured Template Resolvers
org.thymeleaf.exceptions.TemplateInputException: Error resolving template [redirect/question/list], template might not exist or might not be accessible by any of the configured Template Resolvers
     */
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
