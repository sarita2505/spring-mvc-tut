package com.spring.conttroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamTest {
    @RequestMapping(value = "/getinfo1",method = RequestMethod.GET)
    public ModelAndView getMapping(){
        ModelAndView modelAndView=new ModelAndView("viewpage/stdform");
        return modelAndView;
    }
    @RequestMapping(value = "/postinfo1",method = RequestMethod.POST)
    public ModelAndView postMapping(@RequestParam (value="username",defaultValue = "xyz") String name,@RequestParam ("id") Integer id){
        ModelAndView modelAndView=new ModelAndView("viewpage/stdresult");
        modelAndView.addObject("result","form submitted for  "+name+" and id is "+id);
        return modelAndView;
    }
}
