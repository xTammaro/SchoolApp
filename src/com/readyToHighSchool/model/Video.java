package com.readyToHighSchool.model;

import java.util.List;

/**
 * @author Bo Dai
 * the Video entity stores info about videos
 * it will be the Node of our tree, the compareTo method will be used there
 */
public class Video implements Comparable{
    private String id;
    private String fileName;
    private String url;
    private int executiveFunctionScore;
    private int length;
    private int resolution_length;
    private int resolution_width;
    private boolean playing;
    private int playbackSpeed;
    private int volume;
    private boolean watched;

    // Constructor
    public Video(List<String> keywords,String url, int length, int resolution_length, int resolution_width) {
        this.length = length;
        this.resolution_length = resolution_length;
        this.resolution_width = resolution_width;
        this.playing = false;
        this.playbackSpeed = 1;
        this.volume = 50;
        this.watched = false;
    }

    // Getters and setters

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getResolution_length() {
        return resolution_length;
    }

    public void setResolution_length(int resolution_length) {
        this.resolution_length = resolution_length;
    }

    public void setResolution_width(int resolution_width) {
        this.resolution_width = resolution_width;
    }

    public int getResolution_width() {
        return resolution_width;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public int getPlaybackSpeed() {
        return playbackSpeed;
    }

    public void setPlaybackSpeed(int playbackSpeed) {
        this.playbackSpeed = playbackSpeed;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getUrl() {
        return url;
    }

    public int getExecutiveFunctionScore() {
        return executiveFunctionScore;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setExecutiveFunctionScore(int executiveFunctionScore) {
        this.executiveFunctionScore = executiveFunctionScore;
    }
    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
    // Methods


//    public void play() {
//        if (!playing) {
//            playing = true;
//            // Invoke API to start playing the video
//        }
//    }
//
//    public void pause() {
//        if (playing) {
//            playing = false;
//            // Invoke API to pause the video
//        }
//    }
//
//    public void stop() {
//        playing = false;
//        // Invoke API to stop the video
//    }
//
//    public void adjustPlaybackSpeed(int speed) {
//        playbackSpeed = speed;
//        // Invoke API to adjust the video playback speed
//    }
//
//    public void adjustVolume(int volume) {
//        this.volume = volume;
//        // Invoke API to adjust the video volume
//    }

    @Override
    public int compareTo(Object o) {
        //todo
        //for sorting when construct the video tree

        return 0;
    }
}

