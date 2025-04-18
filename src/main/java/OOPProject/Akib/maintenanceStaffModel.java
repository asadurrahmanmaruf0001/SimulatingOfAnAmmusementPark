package OOPProject.Akib;

public class maintenanceStaffModel {
    private String task;
    private String equipment;
    private String issueSeverity;

    public maintenanceStaffModel(String task, String equipment, String issueSeverity) {
        this.task = task;
        this.equipment = equipment;
        this.issueSeverity = issueSeverity;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getIssueSeverity() {
        return issueSeverity;
    }

    public void setIssueSeverity(String issueSeverity) {
        this.issueSeverity = issueSeverity;
    }

    @Override
    public String toString() {
        return "maintenanceStaffModel{" +
                "task='" + task + '\'' +
                ", equipment='" + equipment + '\'' +
                ", issueSeverity='" + issueSeverity + '\'' +
                '}';
    }
}
