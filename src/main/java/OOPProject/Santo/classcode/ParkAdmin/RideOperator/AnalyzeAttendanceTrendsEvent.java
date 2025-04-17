package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class AnalyzeAttendanceTrendsEvent {
    private String analysisPeriod; // e.g., "Last Month", "Last Year"
    private String analysisReport;

    public AnalyzeAttendanceTrendsEvent(String analysisPeriod, String analysisReport) {
        this.analysisPeriod = analysisPeriod;
        this.analysisReport = analysisReport;
    }

    public String getAnalysisPeriod() {
        return analysisPeriod;
    }

    public String getAnalysisReport() {
        return analysisReport;
    }

    @Override
    public String toString() {
        return "AnalyzeAttendanceTrendsEvent{" +
                "analysisPeriod='" + analysisPeriod + '\'' +
                ", analysisReport='" + analysisReport + '\'' +
                '}';
    }
}
