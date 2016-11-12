package com.department.domain;

/**
 *
 */
public class Clazz extends Domain {


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getFkTechId() {
        return fkTechId;
    }

    public void setFkTechId(int fkTechId) {
        this.fkTechId = fkTechId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private int fkTechId;
    private String className;
    private int hours;
}
