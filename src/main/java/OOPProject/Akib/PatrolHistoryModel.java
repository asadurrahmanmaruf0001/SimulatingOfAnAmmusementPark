package OOPProject.Akib;

public class PatrolHistoryModel {
    private String zone;
    private String startTime;
    private String endTime;

    public PatrolHistoryModel(String zone, String startTime, String endTime) {
        this.zone = zone;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "PatrolHistoryModel{" +
                "zone='" + zone + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
