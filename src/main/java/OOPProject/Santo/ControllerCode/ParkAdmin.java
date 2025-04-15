package OOPProject.Santo.ControllerCode;


import java.util.ArrayList;

public class ParkAdmin {
    private String name;
    private String employeeID;
    private ArrayList<Ride> rides;
    private int totalVisitors;

    public ParkAdmin(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
        this.rides = new ArrayList<>();
        this.totalVisitors = 0;
    }

    @Override
    public String toString() {
        return "ParkAdmin{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", rides=" + rides +
                ", totalVisitors=" + totalVisitors +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }

    public void setTotalVisitors(int totalVisitors) {
        this.totalVisitors = totalVisitors;
    }

    // Add methods for managing rides, attendance, staff, and reports
    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void recordEntry(int numberOfVisitors) {
        totalVisitors += numberOfVisitors;
    }

    public void generateDailyReport() {
        System.out.println("Daily Attendance Report: " + totalVisitors + " visitors.");
    }
}
