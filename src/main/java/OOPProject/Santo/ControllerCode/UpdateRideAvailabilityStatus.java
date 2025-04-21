package OOPProject.Santo.ControllerCode;

public class UpdateRideAvailabilityStatus {
    private String rideId;
    private String status; // e.g., "open", "maintenance", "closed"

    public UpdateRideAvailabilityStatus(String rideId, String status) {
        this.rideId = rideId;
        this.status = status;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UpdateRideAvailabilityStatus{" +
                "rideId='" + rideId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}