package com.department.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 *
 */
@Controller
public class Teachers {

    @RequestMapping("/teachers")
    public String getListOfTeachers(Model model) {

        System.out.println("Controller entry");

        model.addAttribute("date", new Date().toString());

        System.out.println("Controller exit. model= " + model);

        return "teachers";

    }

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

}
