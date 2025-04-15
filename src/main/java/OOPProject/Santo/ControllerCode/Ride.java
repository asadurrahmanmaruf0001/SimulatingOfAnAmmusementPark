package OOPProject.Santo.ControllerCode;


public class Ride {
    private String rideName;
    private int capacity;
    private int duration; // in minutes
    private boolean status; // true if running, false if stopped

    public Ride(String rideName, int capacity, int duration) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.duration = duration;
        this.status = false; // initially stopped
    }

    public void startRide() {
        status = true;
    }

    public void stopRide() {
        status = false;
    }

    public String getRideName() {
        return rideName;
    }

    public boolean isRunning() {
        return status;
    }
}