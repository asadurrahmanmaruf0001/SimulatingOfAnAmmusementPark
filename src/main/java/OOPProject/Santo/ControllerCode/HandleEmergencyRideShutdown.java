package OOPProject.Santo.ControllerCode;

public class HandleEmergencyRideShutdown {
    private String rideId;
    private String shutdownReason;

    public HandleEmergencyRideShutdown(String rideId, String shutdownReason) {
        this.rideId = rideId;
        this.shutdownReason = shutdownReason;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getShutdownReason() {
        return shutdownReason;
    }

    public void setShutdownReason(String shutdownReason) {
        this.shutdownReason = shutdownReason;
    }

    @Override
    public String toString() {
        return "HandleEmergencyRideShutdown{" +
                "rideId='" + rideId + '\'' +
                ", shutdownReason='" + shutdownReason + '\'' +
                '}';
    }
}

