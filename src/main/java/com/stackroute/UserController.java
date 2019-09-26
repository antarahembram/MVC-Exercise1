package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {

            @RequestMapping(method = RequestMethod.GET)
            public String display(ModelMap model)
            {
                ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
                User user=context.getBean(User.class);   // creating user object
                model.addAttribute("message", user.getName().toString());    // setting user name as message and sending to jsp
                return "index";
            }


}
