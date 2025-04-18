package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class SelectRideEvent {
    private String rideName;

    public SelectRideEvent(String rideName) {
        this.rideName = rideName;
    }

    public String getRideName() {
        return rideName;
    }

    @Override
    public String toString() {
        return "SelectRideEvent{" +
                "rideName='" + rideName + '\'' +
                '}';
    }
}
