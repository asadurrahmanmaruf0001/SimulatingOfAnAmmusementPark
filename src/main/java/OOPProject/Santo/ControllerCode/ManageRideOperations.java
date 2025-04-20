package OOPProject.Santo.ControllerCode;

public class ManageRideOperations {
    private String rideName;
    private String rideType;
    private int capacity;

    // Constructor
    public ManageRideOperations(String rideName, String rideType, int capacity) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ManageRideOperations{" +
                "rideName='" + rideName + '\'' +
                ", rideType='" + rideType + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Methods
    public void addRide() {
        // Code to add a new ride
    }

    public void updateRideDetails(String newDetails) {
        // Code to update existing ride information
    }

    public void removeRide() {
        // Code to remove a ride from the system
    }

    public void generateRideReport() {
        // Code to generate a report on ride performance
    }
}