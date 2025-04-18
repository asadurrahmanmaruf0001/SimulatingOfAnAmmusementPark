package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class GenerateSummaryReportEvent {
    private String rideName;
    private String reportContent;

    public GenerateSummaryReportEvent(String rideName, String reportContent) {
        this.rideName = rideName;
        this.reportContent = reportContent;
    }

    public String getRideName() {
        return rideName;
    }

    public String getReportContent() {
        return reportContent;
    }

    @Override
    public String toString() {
        return "GenerateSummaryReportEvent{" +
                "rideName='" + rideName + '\'' +
                ", reportContent='" + reportContent + '\'' +
                '}';
    }
}