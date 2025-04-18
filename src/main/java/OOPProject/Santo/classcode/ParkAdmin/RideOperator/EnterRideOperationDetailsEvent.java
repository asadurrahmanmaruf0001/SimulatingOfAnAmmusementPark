package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class EnterRideOperationDetailsEvent {
    private String rideName;
    private String startTime;
    private String endTime;
    private String issuesEncountered;

    public EnterRideOperationDetailsEvent(String rideName, String startTime, String endTime, String issuesEncountered) {
        this.rideName = rideName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.issuesEncountered = issuesEncountered;
    }

    public String getRideName() {
        return rideName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getIssuesEncountered() {
        return issuesEncountered;
    }

    @Override
    public String toString() {
        return "EnterRideOperationDetailsEvent{" +
                "rideName='" + rideName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", issuesEncountered='" + issuesEncountered + '\'' +
                '}';
    }
}
