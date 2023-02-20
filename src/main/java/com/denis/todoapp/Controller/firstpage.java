package com.denis.todoapp.Controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class firstpage {
//    private static final Logger log= (Logger) LoggerFactory.getLogger(firstpage.class);
    @RequestMapping("/login")
    public String app(){
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
        modelMap.put("password", password);
        modelMap.put("name", name);
        return "welcome";
    }
}
