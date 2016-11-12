package com.department.dto;

import com.department.domain.Clazz;
import com.department.domain.Teacher;

import java.util.List;

/**
 *
 */
public class TeacherDto {
    private Teacher teacher;
    List<Clazz> classes;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Clazz> getClasses() {
        return classes;
    }

    public void setClasses(List<Clazz> classes) {
        this.classes = classes;
    }
}
