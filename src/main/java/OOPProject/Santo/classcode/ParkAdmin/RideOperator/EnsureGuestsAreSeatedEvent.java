package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class EnsureGuestsAreSeatedEvent {
    private String rideName;
    private int numberOfGuestsChecked;
    private boolean allRestraintsSecure;

    public EnsureGuestsAreSeatedEvent(String rideName, int numberOfGuestsChecked, boolean allRestraintsSecure) {
        this.rideName = rideName;
        this.numberOfGuestsChecked = numberOfGuestsChecked;
        this.allRestraintsSecure = allRestraintsSecure;
    }

    public String getRideName() {
        return rideName;
    }

    public int getNumberOfGuestsChecked() {
        return numberOfGuestsChecked;
    }

    public boolean areAllRestraintsSecure() {
        return allRestraintsSecure;
    }

    @Override
    public String toString() {
        return "EnsureGuestsAreSeatedEvent{" +
                "rideName='" + rideName + '\'' +
                ", numberOfGuestsChecked=" + numberOfGuestsChecked +
                ", allRestraintsSecure=" + allRestraintsSecure +
                '}';
    }
}
