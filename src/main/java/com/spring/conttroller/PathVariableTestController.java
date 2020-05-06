package com.spring.conttroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Map;

@Controller
public class PathVariableTestController {
    @RequestMapping("/test1/{username}/{id}")
//public ModelAndView testPathVariables(@PathVariable ("username") String name,@PathVariable("id") String id)
    public ModelAndView testPathVariables(@PathVariable Map<String,String> map)
    {
        String name=map.get("username");
        String id=map.get("id");
        ModelAndView modelAndView=new ModelAndView("viewpage/testpath");
        modelAndView.addObject("username","hello "+name);
        modelAndView.addObject("id","your id is "+id);
        return modelAndView;
    }
}

