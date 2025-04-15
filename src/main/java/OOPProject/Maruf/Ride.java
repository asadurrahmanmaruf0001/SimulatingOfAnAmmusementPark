package com.example.demo2.Maruf;

public class Ride {
    private String rideName;
    private String status;
    private int waitTime;

    public Ride(String rideName, String status, int waitTime) {
        this.rideName = rideName;
        this.status = status;
        this.waitTime = waitTime;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideName='" + rideName + '\'' +
                ", status='" + status + '\'' +
                ", waitTime=" + waitTime +
                '}';
    }
}
