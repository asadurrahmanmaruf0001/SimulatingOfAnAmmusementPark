package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class StartOrStopRideEvent {
    private String rideName;
    private boolean isStarted;
    private String notificationToAdmin;

    public StartOrStopRideEvent(String rideName, boolean isStarted, String notificationToAdmin) {
        this.rideName = rideName;
        this.isStarted = isStarted;
        this.notificationToAdmin = notificationToAdmin;
    }

    public String getRideName() {
        return rideName;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public String getNotificationToAdmin() {
        return notificationToAdmin;
    }

    @Override
    public String toString() {
        return "StartOrStopRideEvent{" +
                "rideName='" + rideName + '\'' +
                ", isStarted=" + isStarted +
                ", notificationToAdmin='" + notificationToAdmin + '\'' +
                '}';
    }
}


