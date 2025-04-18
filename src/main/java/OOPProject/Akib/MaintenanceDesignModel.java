package OOPProject.Akib;

public class MaintenanceDesignModel {
    private String weekday;
    private String time;
    private String repairList;

    public MaintenanceDesignModel(String weekday, String time, String repairList) {
        this.weekday = weekday;
        this.time = time;
        this.repairList = repairList;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRepairList() {
        return repairList;
    }

    public void setRepairList(String repairList) {
        this.repairList = repairList;
    }

    @Override
    public String toString() {
        return "MaintenanceDesignModel{" +
                "weekday='" + weekday + '\'' +
                ", time='" + time + '\'' +
                ", repairList='" + repairList + '\'' +
                '}';
    }
}
