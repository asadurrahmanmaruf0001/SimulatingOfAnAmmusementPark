package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class UpdateRideDetailsEvent {
    private String rideName;
    private String updatedDetails;

    public UpdateRideDetailsEvent(String rideName, String updatedDetails) {
        this.rideName = rideName;
        this.updatedDetails = updatedDetails;
    }

    public String getRideName() {
        return rideName;
    }

    public String getUpdatedDetails() {
        return updatedDetails;
    }

    @Override
    public String toString() {
        return "UpdateRideDetailsEvent{" +
                "rideName='" + rideName + '\'' +
                ", updatedDetails='" + updatedDetails + '\'' +
                '}';
    }
}
