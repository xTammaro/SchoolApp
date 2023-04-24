package com.readyToHighSchool.model;
/**
 * @author Bo Dai
 * For logging every action users do ,and will be shown on the personal info tab
 */
public class Log {
    private String email;
    private String action;
    private String timeStamp;
    private String deviceInfo;

    public Log(String email, String action, String timeStamp,String deviceInfo) {
        this.email = email;
        this.action = action;
        this.timeStamp = timeStamp;
        this.deviceInfo = deviceInfo;
    }
}
