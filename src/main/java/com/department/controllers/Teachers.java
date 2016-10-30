package com.department.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 *
 */
@Controller
@RequestMapping("/")
public class Teachers {

    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("currentdate", new Date().toString());
        return "teachers";
    }

}
