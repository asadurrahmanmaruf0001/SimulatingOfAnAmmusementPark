package OOPProject.Santo.classcode.ParkAdmin.RideOperator;
public class SaveLogToDatabaseEvent {
    private String rideName;
    private String logData;

    public SaveLogToDatabaseEvent(String rideName, String logData) {
        this.rideName = rideName;
        this.logData = logData;
    }

    public String getRideName() {
        return rideName;
    }

    public String getLogData() {
        return logData;
    }

    @Override
    public String toString() {
        return "SaveLogToDatabaseEvent{" +
                "rideName='" + rideName + '\'' +
                ", logData='" + logData + '\'' +
                '}';
    }
}