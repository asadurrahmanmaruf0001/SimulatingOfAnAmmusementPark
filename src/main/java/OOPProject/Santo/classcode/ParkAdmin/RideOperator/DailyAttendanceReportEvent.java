package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class DailyAttendanceReportEvent {
    private int totalVisitors;
    private int totalRideUsage;

    public DailyAttendanceReportEvent(int totalVisitors, int totalRideUsage) {
        this.totalVisitors = totalVisitors;
        this.totalRideUsage = totalRideUsage;
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }

    public int getTotalRideUsage() {
        return totalRideUsage;
    }

    @Override
    public String toString() {
        return "DailyAttendanceReportEvent{" +
                "totalVisitors=" + totalVisitors +
                ", totalRideUsage=" + totalRideUsage +
                '}';
    }
}
