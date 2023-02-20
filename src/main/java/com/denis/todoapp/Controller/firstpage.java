package com.denis.todoapp.Controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class firstpage {
    private static final Logger log= (Logger) LoggerFactory.getLogger(firstpage.class);
    @RequestMapping("/firstpage")
    public String app(){
        log.info("name");
        return "index";
    }
}
