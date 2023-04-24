package com.readyToHighSchool.model;

import java.util.List;
/**
 * @author Bo Dai
 * Student
 */
public class Student extends User{
    private int year;
    // todo including Rule to switch video
    private ExecutiveFuctionScore efs;
    private List<Course> courses;
    private Course currentCourse;

    public Student(String id, String username, String email, String password, String gender,int year,List<Course> courses) {
        super(id, username, email, password, gender);
        this.year = year;
        this.courses = courses;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEfs(ExecutiveFuctionScore efs) {
        this.efs = efs;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setCurrentCourse(Course currentCourse) {
        this.currentCourse = currentCourse;
    }

    public int getYear() {
        return year;
    }

    public ExecutiveFuctionScore getEfs() {
        return efs;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Course getCurrentCourse() {
        return currentCourse;
    }
}
