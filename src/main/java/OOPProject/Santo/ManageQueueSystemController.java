package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManageQueueSystemController {

    @FXML
    private ComboBox<String> rideComboBox;
    @FXML
    private TextField waitTimeField;
    @FXML
    private TextField queueCountField;
    @FXML
    private TextArea waitTimeDisplayArea;
    @FXML
    private TextArea logStatusArea;

    private final int MAX_CAPACITY = 100; // Example maximum capacity

    @FXML
    private void initialize() {
        // Populate rideComboBox with ride names (example)
        rideComboBox.getItems().addAll("Roller Coaster", "Ferris Wheel", "Bumper Cars");
    }

    @FXML
    private void handleUpdateWaitTime() {
        String selectedRide = rideComboBox.getValue();
        String waitTime = waitTimeField.getText();

        if (selectedRide == null || waitTime.isEmpty()) {
            logStatusArea.appendText("Error: Please select a ride and enter a wait time.\n");
            return;
        }

        // Logic to update the wait time (placeholder)
        waitTimeDisplayArea.appendText("Updated wait time for " + selectedRide + ": " + waitTime + " minutes.\n");
    }

    @FXML
    private void handleValidateCapacity() {
        String queueCountText = queueCountField.getText();
        if (queueCountText.isEmpty()) {
            logStatusArea.appendText("Error: Please enter the current queue count.\n");
            return;
        }

        int queueCount = Integer.parseInt(queueCountText);
        if (queueCount > MAX_CAPACITY) {
            logStatusArea.appendText("Warning: Queue exceeds maximum capacity of " + MAX_CAPACITY + ".\n");
        } else {
            logStatusArea.appendText("Queue is within capacity limits.\n");
        }
    }

    @FXML
    private void handleLogQueueData() {
        // Logic to log hourly queue data (placeholder)
        // For example: logQueueDataToDatabase();

        logStatusArea.appendText("Hourly queue data logged successfully.\n");
    }
}
