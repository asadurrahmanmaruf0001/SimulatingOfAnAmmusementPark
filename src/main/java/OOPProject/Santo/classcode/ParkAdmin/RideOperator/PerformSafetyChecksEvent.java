package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class PerformSafetyChecksEvent {
    private String rideName;
    private boolean safetyIndicatorsChecked;
    private boolean restraintsChecked;
    private boolean emergencySystemsChecked;

    public PerformSafetyChecksEvent(String rideName, boolean safetyIndicatorsChecked, boolean restraintsChecked, boolean emergencySystemsChecked) {
        this.rideName = rideName;
        this.safetyIndicatorsChecked = safetyIndicatorsChecked;
        this.restraintsChecked = restraintsChecked;
        this.emergencySystemsChecked = emergencySystemsChecked;
    }

    public String getRideName() {
        return rideName;
    }

    public boolean isSafetyIndicatorsChecked() {
        return safetyIndicatorsChecked;
    }

    public boolean isRestraintsChecked() {
        return restraintsChecked;
    }

    public boolean isEmergencySystemsChecked() {
        return emergencySystemsChecked;
    }

    @Override
    public String toString() {
        return "PerformSafetyChecksEvent{" +
                "rideName='" + rideName + '\'' +
                ", safetyIndicatorsChecked=" + safetyIndicatorsChecked +
                ", restraintsChecked=" + restraintsChecked +
                ", emergencySystemsChecked=" + emergencySystemsChecked +
                '}';
    }
}
