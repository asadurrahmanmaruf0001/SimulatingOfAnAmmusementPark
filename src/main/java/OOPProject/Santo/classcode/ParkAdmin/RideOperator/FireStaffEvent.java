package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class FireStaffEvent {
    private String staffName;

    public FireStaffEvent(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }

    @Override
    public String toString() {
        return "FireStaffEvent{" +
                "staffName='" + staffName + '\'' +
                '}';
    }
}
