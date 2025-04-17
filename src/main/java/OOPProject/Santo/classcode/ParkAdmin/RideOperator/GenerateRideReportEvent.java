package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class GenerateRideReportEvent {
    private String rideName;
    private String reportType;

    public GenerateRideReportEvent(String rideName, String reportType) {
        this.rideName = rideName;
        this.reportType = reportType;
    }

    public String getRideName() {
        return rideName;
    }

    public String getReportType() {
        return reportType;
    }

    @Override
    public String toString() {
        return "GenerateRideReportEvent{" +
                "rideName='" + rideName + '\'' +
                ", reportType='" + reportType + '\'' +
                '}';
    }
}
