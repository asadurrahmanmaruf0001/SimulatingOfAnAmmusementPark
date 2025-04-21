package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ScheduleMaintenanceController {

    @FXML
    private TextField staffNameField;
    @FXML
    private TextField staffRoleField;
    @FXML
    private TextField trainingSessionField;
    @FXML
    private TextField fireStaffNameField;
    @FXML
    private TextField evaluateStaffNameField;
    @FXML
    private TextArea statusArea;

    @FXML
    private void handleHireStaff() {
        String staffName = staffNameField.getText();
        String staffRole = staffRoleField.getText();

        if (staffName.isEmpty() || staffRole.isEmpty()) {
            statusArea.setText("Error: Please fill in all fields.");
            return;
        }

        // Logic to hire staff (placeholder)
        // For example: hireStaffInDatabase(staffName, staffRole);

        statusArea.setText("Staff hired successfully: " + staffName + " as " + staffRole + ".");
        clearFields();
    }

    @FXML
    private void handleScheduleTraining() {
        String trainingSession = trainingSessionField.getText();

        if (trainingSession.isEmpty()) {
            statusArea.setText("Error: Please enter training session details.");
            return;
        }

        // Logic to schedule training (placeholder)
        // For example: scheduleTrainingInDatabase(trainingSession);

        statusArea.setText("Training session scheduled successfully: " + trainingSession + ".");
        trainingSessionField.clear();
    }

    @FXML
    private void handleFireStaff() {
        String staffName = fireStaffNameField.getText();

        if (staffName.isEmpty()) {
            statusArea.setText("Error: Please enter the staff name to fire.");
            return;
        }

        // Logic to fire staff (placeholder)
        // For example: fireStaffInDatabase(staffName);

        statusArea.setText("Staff fired successfully: " + staffName + ".");
        fireStaffNameField.clear();
    }

    @FXML
    private void handleEvaluatePerformance() {
        String staffName = evaluateStaffNameField.getText();

        if (staffName.isEmpty()) {
            statusArea.setText("Error: Please enter the staff name to evaluate.");
            return;
        }

        // Logic to evaluate staff performance (placeholder)
        // For example: evaluateStaffPerformanceInDatabase(staffName);

        statusArea.setText("Performance evaluated successfully for: " + staffName + ".");
        evaluateStaffNameField.clear();
    }

    private void clearFields() {
        staffNameField.clear();
        staffRoleField.clear();
    }
}