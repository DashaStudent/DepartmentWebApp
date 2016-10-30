package com.department.controllers;

import com.department.dao.TeacherDao;
import com.department.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 *
 */
@Controller
public class Teachers {

    @Autowired
    TeacherDao teachersDao;

    @RequestMapping("/teachers")
    public String getListOfTeachers(Model model) {

        System.out.println("Controller entry");

        model.addAttribute("date", new Date().toString());
        List<Teacher> teachers = teachersDao.getAllTeachers();
        System.out.println(teachers.size());
        model.addAttribute("teachers", teachers);

        System.out.println("Controller exit. model= " + model);

        return "teachers";

    }

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

}
