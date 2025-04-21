package OOPProject.Santo.ControllerCode;

public class PerformEndOfDayChecklists {
    private String rideId;
    private String checklistDetails;

    public PerformEndOfDayChecklists(String rideId, String checklistDetails) {
        this.rideId = rideId;
        this.checklistDetails = checklistDetails;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getChecklistDetails() {
        return checklistDetails;
    }

    public void setChecklistDetails(String checklistDetails) {
        this.checklistDetails = checklistDetails;
    }

    @Override
    public String toString() {
        return "PerformEndOfDayChecklists{" +
                "rideId='" + rideId + '\'' +
                ", checklistDetails='" + checklistDetails + '\'' +
                '}';
    }
}