package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class HireStaffEvent {
    private String staffName;
    private String role;
    private String responsibilities;

    public HireStaffEvent(String staffName, String role, String responsibilities) {
        this.staffName = staffName;
        this.role = role;
        this.responsibilities = responsibilities;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getRole() {
        return role;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public String toString() {
        return "HireStaffEvent{" +
                "staffName='" + staffName + '\'' +
                ", role='" + role + '\'' +
                ", responsibilities='" + responsibilities + '\'' +
                '}';
    }
}
