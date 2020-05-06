package com.spring.conttroller;

import com.spring.constants.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping("/home")
    public ModelAndView getHome(){
        ModelAndView modelAndView=new ModelAndView(Pages.HOME);
        return modelAndView;
    }
    @RequestMapping("/about")
    public ModelAndView getAbout(){
        ModelAndView modelAndView=new ModelAndView(Pages.ABOUT_US);
        return modelAndView;
    }
    @RequestMapping("/welcome")
    public ModelAndView getWelcome(){
        ModelAndView modelAndView=new ModelAndView("hello");
        modelAndView.addObject("welcome","1st mvc application");
        return modelAndView;
    }
}
