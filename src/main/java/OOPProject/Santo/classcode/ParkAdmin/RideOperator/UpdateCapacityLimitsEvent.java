package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class UpdateCapacityLimitsEvent {
    private String rideName;
    private int newCapacityLimit;

    public UpdateCapacityLimitsEvent(String rideName, int newCapacityLimit) {
        this.rideName = rideName;
        this.newCapacityLimit = newCapacityLimit;
    }

    public String getRideName() {
        return rideName;
    }

    public int getNewCapacityLimit() {
        return newCapacityLimit;
    }

    @Override
    public String toString() {
        return "UpdateCapacityLimitsEvent{" +
                "rideName='" + rideName + '\'' +
                ", newCapacityLimit=" + newCapacityLimit +
                '}';
    }
}
