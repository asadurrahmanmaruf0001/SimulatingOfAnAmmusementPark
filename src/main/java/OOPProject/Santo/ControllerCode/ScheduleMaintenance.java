package OOPProject.Santo.ControllerCode;

public class ScheduleMaintenance {
    private String staffName;
    private String role;

    // Constructor
    public ScheduleMaintenance(String staffName, String role) {
        this.staffName = staffName;
        this.role = role;
    }


    @Override
    public String toString() {
        return "ScheduleMaintenance{" +
                "staffName='" + staffName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // Getters and Setters
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Methods
    public void hireStaff() {
        // Code to add new staff members
    }

    public void conductStaffTraining(String staffId) {
        // Code to schedule training sessions for staff
    }

    public void fireStaff(String staffId) {
        // Code to remove staff from the system
    }

    public void evaluateStaffPerformance(String staffId) {
        // Code to review staff performance metrics
    }
}