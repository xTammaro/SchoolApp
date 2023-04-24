package com.readyToHighSchool.model;
/**
 * @author Bo Dai
 * the interface for all main functions in the system
 * if there are too much method, should be decomposed
 */
public interface CoreService {
    // User related
    User login(String username, String email, String password);
    Boolean logout(String username,String email);

    //Student related
    Boolean switchCourse(Student student, Course course);
    Boolean watchVideo(Student student, Video video);
    Boolean doQuiz(Student student,Quiz quiz);
    void setVideoWatched(Student student,Video video);

    //log related
    public void logging(Log log);
}
