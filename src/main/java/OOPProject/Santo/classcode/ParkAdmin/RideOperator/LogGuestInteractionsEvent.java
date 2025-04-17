package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class LogGuestInteractionsEvent {
    private String rideName;
    private int numberOfGuestsAssisted;
    private String specialInstructions;

    public LogGuestInteractionsEvent(String rideName, int numberOfGuestsAssisted, String specialInstructions) {
        this.rideName = rideName;
        this.numberOfGuestsAssisted = numberOfGuestsAssisted;
        this.specialInstructions = specialInstructions;
    }

    public String getRideName() {
        return rideName;
    }

    public int getNumberOfGuestsAssisted() {
        return numberOfGuestsAssisted;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    @Override
    public String toString() {
        return "LogGuestInteractionsEvent{" +
                "rideName='" + rideName + '\'' +
                ", numberOfGuestsAssisted=" + numberOfGuestsAssisted +
                ", specialInstructions='" + specialInstructions + '\'' +
                '}';
    }
}
