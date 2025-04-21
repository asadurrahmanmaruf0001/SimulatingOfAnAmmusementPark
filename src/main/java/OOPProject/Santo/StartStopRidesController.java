package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.time.LocalDateTime;

public class StartStopRidesController {

    @FXML
    private ComboBox<String> rideComboBox;
    @FXML
    private TextArea safetyCheckArea;
    @FXML
    private TextArea operationLogArea;

    private boolean safetyCheckPassed = false;

    @FXML
    private void initialize() {
        // Populate rideComboBox with ride names (example)
        rideComboBox.getItems().addAll("Roller Coaster", "Ferris Wheel", "Bumper Cars");
    }

    @FXML
    private void handleSafetyCheck() {
        String selectedRide = rideComboBox.getValue();
        // Perform safety checks (placeholder logic)
        safetyCheckPassed = true; // Assume checks pass for this example
        safetyCheckArea.setText("Safety checks passed for " + selectedRide + ".");
    }

    @FXML
    private void handleStartRide() {
        if (safetyCheckPassed) {
            String selectedRide = rideComboBox.getValue();
            LocalDateTime startTime = LocalDateTime.now();
            operationLogArea.appendText("Started " + selectedRide + " at " + startTime + ".\n");
            // Logic to start the ride
        } else {
            operationLogArea.appendText("Cannot start ride. Safety checks not passed.\n");
        }
    }

    @FXML
    private void handleStopRide() {
        String selectedRide = rideComboBox.getValue();
        LocalDateTime stopTime = LocalDateTime.now();
        operationLogArea.appendText("Stopped " + selectedRide + " at " + stopTime + ".\n");
        // Logic to stop the ride
    }
}
