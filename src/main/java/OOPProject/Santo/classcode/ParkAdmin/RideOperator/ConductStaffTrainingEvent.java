package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class ConductStaffTrainingEvent {
    private String trainingTopic;
    private String trainingDate;
    private String staffInvolved;

    public ConductStaffTrainingEvent(String trainingTopic, String trainingDate, String staffInvolved) {
        this.trainingTopic = trainingTopic;
        this.trainingDate = trainingDate;
        this.staffInvolved = staffInvolved;
    }

    public String getTrainingTopic() {
        return trainingTopic;
    }

    public String getTrainingDate() {
        return trainingDate;
    }

    public String getStaffInvolved() {
        return staffInvolved;
    }

    @Override
    public String toString() {
        return "ConductStaffTrainingEvent{" +
                "trainingTopic='" + trainingTopic + '\'' +
                ", trainingDate='" + trainingDate + '\'' +
                ", staffInvolved='" + staffInvolved + '\'' +
                '}';
    }
}
