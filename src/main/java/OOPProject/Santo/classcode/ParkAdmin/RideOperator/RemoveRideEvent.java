package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class RemoveRideEvent {
    private String rideName;

    public RemoveRideEvent(String rideName) {
        this.rideName = rideName;
    }

    public String getRideName() {
        return rideName;
    }

    @Override
    public String toString() {
        return "RemoveRideEvent{" +
                "rideName='" + rideName + '\'' +
                '}';
    }
}