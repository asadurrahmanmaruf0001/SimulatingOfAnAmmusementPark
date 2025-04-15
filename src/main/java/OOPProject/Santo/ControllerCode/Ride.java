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

    @Override
    public String toString() {
        return "Ride{" +
                "rideName='" + rideName + '\'' +
                ", capacity=" + capacity +
                ", duration=" + duration +
                ", status=" + status +
                '}';
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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