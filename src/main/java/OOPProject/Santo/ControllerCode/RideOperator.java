package OOPProject.Santo.ControllerCode;

public class RideOperator {
    private String name;
    private String employeeID;

    public RideOperator(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public void startRide(Ride ride) {
        ride.startRide();
    }

    public void stopRide(Ride ride) {
        ride.stopRide();
    }

    public void assistGuests() {
        // Logic for assisting guests
    }
}
