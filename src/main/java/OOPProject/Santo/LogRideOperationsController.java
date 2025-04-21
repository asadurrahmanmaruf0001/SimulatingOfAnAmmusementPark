package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;

public class LogRideOperationsController {

    @FXML
    private ComboBox<String> rideComboBox;
    @FXML
    private TextField startTimeField;
    @FXML
    private TextField endTimeField;
    @FXML
    private TextArea issuesArea;
    @FXML
    private TextArea logStatusArea;

    @FXML
    private void initialize() {
        // Populate rideComboBox with ride names (example)
        rideComboBox.getItems().addAll("Roller Coaster", "Ferris Wheel", "Bumper Cars");
    }

    @FXML
    private void handleSaveLog() {
        String selectedRide = rideComboBox.getValue();
        String startTime = startTimeField.getText();
        String endTime = endTimeField.getText();
        String issues = issuesArea.getText();

        // Validate input fields
        if (selectedRide == null || startTime.isEmpty() || endTime.isEmpty()) {
            logStatusArea.setText("Error: Please fill in all fields.");
            return;
        }

        // Logic to save the log in the database (placeholder)
        // For example: saveLogToDatabase(selectedRide, startTime, endTime, issues);

        // Log the operation status
        logStatusArea.appendText("Log saved for " + selectedRide + " from " + startTime + " to " + endTime + ".\n");
        if (!issues.isEmpty()) {
            logStatusArea.appendText("Issues encountered: " + issues + "\n");
        }

        // Clear the input fields after saving
        startTimeField.clear();
        endTimeField.clear();
        issuesArea.clear();
    }

    @FXML
    private void handleGenerateReport() {
        // Logic to generate a summary report of ride operations (placeholder)
        // For example: generateSummaryReport();

        logStatusArea.appendText("Summary report generated for ride operations.\n");
    }
}