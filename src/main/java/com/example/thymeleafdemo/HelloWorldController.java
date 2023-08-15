package com.example.thymeleafdemo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello World");
         return "helloworld";
    }

    @GetMapping("/style")
    public String style(){
        return "add-css-js-demo";
    }

}
