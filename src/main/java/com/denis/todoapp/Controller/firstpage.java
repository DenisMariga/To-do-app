package com.denis.todoapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstpage {
    @RequestMapping("/firstpage")
    public String app(){
        return "index";
    }
}
