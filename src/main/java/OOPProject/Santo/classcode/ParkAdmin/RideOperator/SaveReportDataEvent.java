package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class SaveReportDataEvent {
    private String reportType;
    private String reportData;

    public SaveReportDataEvent(String reportType, String reportData) {
        this.reportType = reportType;
        this.reportData = reportData;
    }

    public String getReportType() {
        return reportType;
    }

    public String getReportData() {
        return reportData;
    }

    @Override
    public String toString() {
        return "SaveReportDataEvent{" +
                "reportType='" + reportType + '\'' +
                ", reportData='" + reportData + '\'' +
                '}';
    }
}
