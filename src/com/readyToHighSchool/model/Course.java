package com.readyToHighSchool.model;
/**
 * @author Bo Dai
 * belongs to Student
 */
public class Course {
    private String id;
    private String name;
    private int progressPercentage;
    // todo
    // for search by (filename = __ & length =__) | watched = __
    // and our tree, the node should be Video
    private Tree<Video> videoTree;
    // as each video has a quiz, just use the video id to retrieve quiz
    private Map<String,Quiz> quizMap;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public Tree<Video> getVideoTree() {
        return videoTree;
    }

    public Map<String, Quiz> getQuizMap() {
        return quizMap;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public void setVideoTree(Tree<Video> videoTree) {
        this.videoTree = videoTree;
    }

    public void setQuizMap(Map<String, Quiz> quizMap) {
        this.quizMap = quizMap;
    }
}
