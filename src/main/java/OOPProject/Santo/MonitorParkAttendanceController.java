package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MonitorParkAttendanceController {

    @FXML
    private TextField rideNameField;
    @FXML
    private TextField newCapacityField;
    @FXML
    private TextArea statusArea;

    @FXML
    private void handleNotifyStaff() {
        // Logic to notify staff about peak times (placeholder)
        // For example: notifyStaffAboutPeakTimes();

        statusArea.setText("Staff notified about peak times successfully.");
    }

    @FXML
    private void handleAnalyzeTrends() {
        // Logic to analyze attendance trends (placeholder)
        // For example: analyzeAttendanceTrends();

        statusArea.setText("Attendance trends analyzed successfully.");
    }

    @FXML
    private void handleUpdateCapacity() {
        String rideName = rideNameField.getText();
        String newCapacityText = newCapacityField.getText();

        if (rideName.isEmpty() || newCapacityText.isEmpty()) {
            statusArea.setText("Error: Please fill in all fields.");
            return;
        }

        // Validate new capacity is a number
        int newCapacity;
        try {
            newCapacity = Integer.parseInt(newCapacityText);
        } catch (NumberFormatException e) {
            statusArea.setText("Error: New capacity must be a valid number.");
            return;
        }

        // Logic to update the capacity limit in the system (placeholder)
        // For example: updateRideCapacityInDatabase(rideName, newCapacity);

        statusArea.setText("Capacity for " + rideName + " updated to " + newCapacity + " successfully.");
        clearFields();
    }

    private void clearFields() {
        rideNameField.clear();
        newCapacityField.clear();
    }
}