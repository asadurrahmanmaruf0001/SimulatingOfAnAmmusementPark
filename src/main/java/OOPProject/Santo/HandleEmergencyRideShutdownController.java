package OOPProject.Santo;



import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HandleEmergencyRideShutdownController {

    @FXML
    private TextArea alertStatusArea;
    @FXML
    private TextArea incidentDetailsArea;
    @FXML
    private TextArea logStatusArea;

    private boolean emergencyDetected = false;

    @FXML
    private void handleDetectEmergency() {
        // Logic to detect unusual activity or receive an emergency alert (placeholder)
        emergencyDetected = true; // Assume an emergency is detected for this example
        alertStatusArea.setText("Emergency detected! Please take immediate action.");
    }

    @FXML
    private void handleEmergencyStop() {
        if (emergencyDetected) {
            // Logic to stop the ride immediately (placeholder)
            logStatusArea.appendText("Ride stopped due to emergency.\n");
            // Here you would implement the actual logic to stop the ride
        } else {
            logStatusArea.appendText("No emergency detected. Cannot stop the ride.\n");
        }
    }

    @FXML
    private void handleNotifyAdmin() {
        String incidentDetails = incidentDetailsArea.getText();
        if (incidentDetails.isEmpty()) {
            logStatusArea.appendText("Error: Please provide incident details before notifying admin.\n");
            return;
        }

        // Logic to notify the Park Admin (placeholder)
        logStatusArea.appendText("Notified Park Admin about the emergency shutdown.\n");

        // Log the incident details (placeholder)
        logStatusArea.appendText("Incident details logged: " + incidentDetails + "\n");

        // Clear the incident details area after notifying
        incidentDetailsArea.clear();
    }
}