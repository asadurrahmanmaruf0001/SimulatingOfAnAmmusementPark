package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class AddRideEvent {
    private String rideName;
    private String rideType;
    private int capacity;

    public AddRideEvent(String rideName, String rideType, int capacity) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.capacity = capacity;
    }

    public String getRideName() {
        return rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "AddRideEvent{" +
                "rideName='" + rideName + '\'' +
                ", rideType='" + rideType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
