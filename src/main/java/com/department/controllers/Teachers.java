package com.department.controllers;

import com.department.dao.TeacherDao;
import com.department.domain.Clazz;
import com.department.domain.Teacher;
import com.department.dto.TeacherDto;
import com.department.dto.TeachersTableDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

        TeachersTableDto teachersTableDto = new TeachersTableDto();
        List<TeacherDto> list = new ArrayList<TeacherDto>();

        model.addAttribute("date", new Date().toString());
        List<Teacher> teachers = teachersDao.getAllTeachers();

        for (Teacher teacher : teachers) {

            TeacherDto teacherDto = new TeacherDto();
            teacherDto.setTeacher(teacher);

            List<Clazz> classes = teachersDao.getClassesByTeacherId(teacher.getId());
            teacherDto.setClasses(classes);

            list.add(teacherDto);
        }

        teachersTableDto.setTeachers(list);

        System.out.println(teachers.size());
        model.addAttribute("teachersTableDto", teachersTableDto);

        return "teachers";

    }

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

}
