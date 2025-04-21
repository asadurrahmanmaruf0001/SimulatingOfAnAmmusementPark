package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManageRideOperationsController {

    @FXML
    private TextField rideNameField;
    @FXML
    private TextField rideTypeField;
    @FXML
    private TextField capacityField;
    @FXML
    private TextArea statusArea;

    @FXML
    private void handleAddRide() {
        String rideName = rideNameField.getText();
        String rideType = rideTypeField.getText();
        String capacityText = capacityField.getText();

        if (rideName.isEmpty() || rideType.isEmpty() || capacityText.isEmpty()) {
            statusArea.setText("Error: Please fill in all fields.");
            return;
        }

        // Validate capacity is a number
        int capacity;
        try {
            capacity = Integer.parseInt(capacityText);
        } catch (NumberFormatException e) {
            statusArea.setText("Error: Capacity must be a valid number.");
            return;
        }

        // Logic to add the ride to the system (placeholder)
        // For example: addRideToDatabase(rideName, rideType, capacity);

        statusArea.setText("Ride added successfully: " + rideName + " (" + rideType + ") with capacity " + capacity + ".");
        clearFields();
    }

    @FXML
    private void handleUpdateRide() {
        String rideName = rideNameField.getText();
        String rideType = rideTypeField.getText();
        String capacityText = capacityField.getText();

        if (rideName.isEmpty() || rideType.isEmpty() || capacityText.isEmpty()) {
            statusArea.setText("Error: Please fill in all fields.");
            return;
        }

        // Validate capacity is a number
        int capacity;
        try {
            capacity = Integer.parseInt(capacityText);
        } catch (NumberFormatException e) {
            statusArea.setText("Error: Capacity must be a valid number.");
            return;
        }

        // Logic to update the ride in the system (placeholder)
        // For example: updateRideInDatabase(rideName, rideType, capacity);

        statusArea.setText("Ride updated successfully: " + rideName + " (" + rideType + ") with capacity " + capacity + ".");
        clearFields();
    }

    @FXML
    private void handleRemoveRide() {
        String rideName = rideNameField.getText();

        if (rideName.isEmpty()) {
            statusArea.setText("Error: Please enter the ride name to remove.");
            return;
        }

        // Logic to remove the ride from the system (placeholder)
        // For example: removeRideFromDatabase(rideName);

        statusArea.setText("Ride removed successfully: " + rideName + ".");
        clearFields();
    }

    @FXML
    private void handleGenerateReport() {
        // Logic to generate a report on ride performance (placeholder)
        // For example: generateRideReport();

        statusArea.setText("Ride report generated successfully.");
    }

    private void clearFields() {
        rideNameField.clear();
        rideTypeField.clear();
        capacityField.clear();
    }
}