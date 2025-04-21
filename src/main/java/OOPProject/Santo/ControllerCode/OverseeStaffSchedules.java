package OOPProject.Santo.ControllerCode;

public class OverseeStaffSchedules {
    private String staffId;
    private String shiftDetails;

    public OverseeStaffSchedules(String staffId, String shiftDetails) {
        this.staffId = staffId;
        this.shiftDetails = shiftDetails;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getShiftDetails() {
        return shiftDetails;
    }

    public void setShiftDetails(String shiftDetails) {
        this.shiftDetails = shiftDetails;
    }

    @Override
    public String toString() {
        return "OverseeStaffSchedules{" +
                "staffId='" + staffId + '\'' +
                ", shiftDetails='" + shiftDetails + '\'' +
                '}';
    }
}


