package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class EvaluateStaffPerformanceEvent {
    private String staffName;
    private String performanceMetrics;
    private String feedback;

    public EvaluateStaffPerformanceEvent(String staffName, String performanceMetrics, String feedback) {
        this.staffName = staffName;
        this.performanceMetrics = performanceMetrics;
        this.feedback = feedback;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getPerformanceMetrics() {
        return performanceMetrics;
    }

    public String getFeedback() {
        return feedback;
    }

    @Override
    public String toString() {
        return "EvaluateStaffPerformanceEvent{" +
                "staffName='" + staffName + '\'' +
                ", performanceMetrics='" + performanceMetrics + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
