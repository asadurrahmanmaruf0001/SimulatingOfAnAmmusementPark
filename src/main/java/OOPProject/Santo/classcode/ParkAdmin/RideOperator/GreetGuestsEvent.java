package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class GreetGuestsEvent {
    private String rideName;
    private String safetyInstructions;

    public GreetGuestsEvent(String rideName, String safetyInstructions) {
        this.rideName = rideName;
        this.safetyInstructions = safetyInstructions;
    }

    public String getRideName() {
        return rideName;
    }

    public String getSafetyInstructions() {
        return safetyInstructions;
    }

    @Override
    public String toString() {
        return "GreetGuestsEvent{" +
                "rideName='" + rideName + '\'' +
                ", safetyInstructions='" + safetyInstructions + '\'' +
                '}';
    }
}
