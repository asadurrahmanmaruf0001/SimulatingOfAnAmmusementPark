package OOPProject.Santo.ControllerCode;

import java.util.ArrayList;

public class Park {
    private String name;
    private String location;
    private ArrayList<Ride> rides;
    private int attendance;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
        this.rides = new ArrayList<>();
        this.attendance = 0;
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void trackAttendance(int numberOfVisitors) {
        attendance += numberOfVisitors;
    }
}
