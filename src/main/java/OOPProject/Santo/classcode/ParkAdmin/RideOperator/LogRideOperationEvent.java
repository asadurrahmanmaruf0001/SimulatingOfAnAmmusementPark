package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class LogRideOperationEvent {
    private String rideName;
    private String startTime;
    private String stopTime;
    private String issuesEncountered;

    public LogRideOperationEvent(String rideName, String startTime, String stopTime, String issuesEncountered) {
        this.rideName = rideName;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.issuesEncountered = issuesEncountered;
    }

    public String getRideName() {
        return rideName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public String getIssuesEncountered() {
        return issuesEncountered;
    }

    @Override
    public String toString() {
        return "LogRideOperationEvent{" +
                "rideName='" + rideName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", issuesEncountered='" + issuesEncountered + '\'' +
                '}';
    }
}
