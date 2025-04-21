package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ManageEmergencySituationsController {

    @FXML
    private TextArea emergencyAlertArea;
    @FXML
    private TextArea emergencyDetailsArea;
    @FXML
    private TextArea logOutputArea;

    @FXML
    private void handleNotifyStaff() {
        // Logic to notify staff
        logOutputArea.appendText("Staff notified about the emergency.\n");
    }

    @FXML
    private void handleInitiateProtocol() {
        // Logic to initiate emergency protocol
        logOutputArea.appendText("Emergency protocol initiated.\n");
    }

    @FXML
    private void handleLogIncident() {
        // Logic to log the incident
        String alert = emergencyAlertArea.getText();
        String details = emergencyDetailsArea.getText();
        logOutputArea.appendText("Incident logged: " + alert + " - " + details + "\n");
    }
}
