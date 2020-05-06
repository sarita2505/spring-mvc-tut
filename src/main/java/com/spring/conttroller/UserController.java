package com.spring.conttroller;

import com.spring.model.User;
import com.spring.model.UserNamePropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;

@Controller
public class UserController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields(new String[]{"address.country"});
        webDataBinder.registerCustomEditor(String.class,"username",new UserNamePropertyEditor());
    }
    @RequestMapping(value = "/getinfo", method = RequestMethod.GET)
    public ModelAndView getMapping() throws Exception {
        String exception="IoException";
        if (exception.equalsIgnoreCase("IoException")){

                throw new IOException("IoException");

        }
       else if (exception.equals("NullPointer")){

            throw new NullPointerException("NullpointerException");
        }

        else if (exception.equals("Arithmetic")){

            throw new ArithmeticException("ArithmeticException");
        }
        ModelAndView modelAndView = new ModelAndView("viewpage/stdform");
        //modelAndView.addObject("result","form submitted");
        return modelAndView;
    }

    @ModelAttribute
    public void commonModel(Model model) {
        model.addAttribute("result", "form submitted");
    }

    @RequestMapping(value = "/postinfo2", method = RequestMethod.POST)
    public ModelAndView postMapping(@RequestParam(value = "username", defaultValue = "xyz") String name, @RequestParam("id") Integer id) {
        User user = new User();
        user.setUsername(name);
        user.setId(id);
        ModelAndView modelAndView = new ModelAndView("viewpage/stdresult");
        //modelAndView.addObject("result","form submitted");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/postinfo", method = RequestMethod.POST)
    public ModelAndView postMapping1(@Valid @ModelAttribute("user1") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("viewpage/stdform");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("viewpage/stdresult");
        //modelAndView.addObject("result","form submitted");
        //modelAndView.addObject("user",user);

        return modelAndView;
    }
}
