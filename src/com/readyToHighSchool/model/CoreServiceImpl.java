package com.readyToHighSchool.model;
/**
 * @author Bo Dai
 */
public class CoreServiceImpl implements CoreService{
    // it can be changed to any other type of database by changing the Dao
    private FirebaseDao dao;
    @Override
    public User login(String username, String email, String password) {
        // as we use firebase authentication, we just record login log
        return null;
    }

    @Override
    public Boolean logout(String username, String email) {
        // as we use firebase authentication, we just record logout log
        return null;
    }

    @Override
    public Boolean switchCourse(Student student, Course course) {
        // switch course according the Executive Function Rule
        // log
        // todo

        return true;
    }

    @Override
    public Boolean watchVideo(Student student, Video video) {
        // mark the video watched
        video.isWatched();
        // log
        // todo
        return null;
    }

    @Override
    public Boolean doQuiz(Student student, Quiz quiz) {
        // mark the quiz
        // log
        // todo
        return null;
    }

    @Override
    public void setVideoWatched(Student student, Video video) {
        // todo
    }

    @Override
    public void logging(Log log) {
        //todo
    }
}
