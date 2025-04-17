package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class GenerateAndDisplayReportEvent {
    private String reportContent; // This could include text, charts, and graphs

    public GenerateAndDisplayReportEvent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportContent() {
        return reportContent;
    }

    @Override
    public String toString() {
        return "GenerateAndDisplayReportEvent{" +
                "reportContent='" + reportContent + '\'' +
                '}';
    }
}
