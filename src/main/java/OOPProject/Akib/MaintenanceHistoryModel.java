package OOPProject.Akib;

import java.time.LocalDate;

public class MaintenanceHistoryModel {
    private LocalDate date;
    private String equipment;
    private String taskType;
    private String staff;
    private String outcome;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "MaintenanceHistoryModel{" +
                "date='" + date + '\'' +
                ", equipment='" + equipment + '\'' +
                ", taskType='" + taskType + '\'' +
                ", staff='" + staff + '\'' +
                ", outcome='" + outcome + '\'' +
                '}';
    }

    public MaintenanceHistoryModel(LocalDate date, String equipment, String taskType, String staff, String outcome) {
        this.date = date;
        this.equipment = equipment;
        this.taskType = taskType;
        this.staff = staff;
        this.outcome = outcome;
    }
}
