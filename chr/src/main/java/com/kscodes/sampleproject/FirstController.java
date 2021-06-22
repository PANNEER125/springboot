package com.kscodes.sampleproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/firstpage")
public class FirstController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView print() {

        ModelAndView mv = new ModelAndView("firstpage");
        mv.addObject("displayMessage", "This is the first page of Spring MVC");
        return mv;
    }
}