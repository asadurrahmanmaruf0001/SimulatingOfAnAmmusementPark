package OOPProject.Akib;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class maintenanceTaskScheduleModel {

    private String maintenanceStaff;
    private LocalDate maintenanceDate;
    private String designatedWork;
    private String time;

    public String getMaintenanceStaff() {
        return maintenanceStaff;
    }

    public void setMaintenanceStaff(String maintenanceStaff) {
        this.maintenanceStaff = maintenanceStaff;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getDesignatedWork() {
        return designatedWork;
    }

    public void setDesignatedWork(String designatedWork) {
        this.designatedWork = designatedWork;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public maintenanceTaskScheduleModel(String maintenanceStaff, LocalDate maintenanceDate, String designatedWork, String time) {
        this.maintenanceStaff = maintenanceStaff;
        this.maintenanceDate = maintenanceDate;
        this.designatedWork = designatedWork;
        this.time = time;
    }
    @Override
    public String toString() {
        return "maintenanceTaskScheduleModel{" +
                "maintenanceStaff=" + maintenanceStaff +
                ", maintenanceDate=" + maintenanceDate +
                ", designatedWork='" + designatedWork + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
