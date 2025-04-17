package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class NotifyStaffEvent {
    private String notificationMessage;
    private String notificationType; // OP or DP

    public NotifyStaffEvent(String notificationMessage, String notificationType) {
        this.notificationMessage = notificationMessage;
        this.notificationType = notificationType;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public String getNotificationType() {
        return notificationType;
    }

    @Override
    public String toString() {
        return "NotifyStaffEvent{" +
                "notificationMessage='" + notificationMessage + '\'' +
                ", notificationType='" + notificationType + '\'' +
                '}';
    }
}
