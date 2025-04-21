package OOPProject.Santo.ControllerCode;

public class ManageQueueSystem {
    private String rideId;
    private int currentWaitTime;

    public ManageQueueSystem(String rideId, int currentWaitTime) {
        this.rideId = rideId;
        this.currentWaitTime = currentWaitTime;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public int getCurrentWaitTime() {
        return currentWaitTime;
    }

    public void setCurrentWaitTime(int currentWaitTime) {
        this.currentWaitTime = currentWaitTime;
    }

    @Override
    public String toString() {
        return "ManageQueueSystem{" +
                "rideId='" + rideId + '\'' +
                ", currentWaitTime=" + currentWaitTime +
                '}';
    }
}