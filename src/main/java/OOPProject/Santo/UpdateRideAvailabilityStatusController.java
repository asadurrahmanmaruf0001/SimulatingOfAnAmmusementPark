package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class UpdateRideAvailabilityStatusController {

    @FXML
    private ComboBox<String> rideComboBox;
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private TextArea validationStatusArea;
    @FXML
    private TextArea logStatusArea;

    @FXML
    private void initialize() {
        // Populate rideComboBox with ride names (example)
        rideComboBox.getItems().addAll("Roller Coaster", "Ferris Wheel", "Bumper Cars");
    }

    @FXML
    private void handleUpdateStatus() {
        String selectedRide = rideComboBox.getValue();
        String newStatus = statusComboBox.getValue();

        if (selectedRide == null || newStatus == null) {
            logStatusArea.appendText("Error: Please select a ride and a status.\n");
            return;
        }

        // Logic to validate if maintenance or shutdown is scheduled (placeholder)
        boolean isScheduled = checkScheduledMaintenance(selectedRide);
        if (isScheduled && newStatus.equals("Open")) {
            validationStatusArea.setText("Error: Maintenance is scheduled for this ride. Cannot set to Open.");
            return;
        } else {
            validationStatusArea.setText("Status updated successfully.");
        }
    }

    @FXML
    private void handleSaveStatus() {
        String selectedRide = rideComboBox.getValue();
        String newStatus = statusComboBox.getValue();

        if (selectedRide == null || newStatus == null) {
            logStatusArea.appendText("Error: Please select a ride and a status before saving.\n");
            return;
        }

        // Logic to save the updated status to the system (placeholder)
        // For example: saveRideStatusToDatabase(selectedRide, newStatus);

        logStatusArea.appendText("Updated status for " + selectedRide + " to " + newStatus + ".\n");
    }

    private boolean checkScheduledMaintenance(String ride) {
        // Placeholder logic to check if maintenance is scheduled for the selected ride
        // In a real application, this would query a database or data source
        return ride.equals("Ferris Wheel"); // Example: Assume Ferris Wheel has scheduled maintenance
    }
}
