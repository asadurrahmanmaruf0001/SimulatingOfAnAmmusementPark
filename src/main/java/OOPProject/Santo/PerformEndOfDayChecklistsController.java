package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PerformEndOfDayChecklistsController {

    @FXML
    private TextField rideNameField;
    @FXML
    private ComboBox<String> cleanlinessRatingComboBox;
    @FXML
    private TextArea issuesArea;
    @FXML
    private TextField durationField;
    @FXML
    private TextArea submissionStatusArea;

    @FXML
    private void initialize() {
        // Initialize cleanliness rating options (1-5)
        cleanlinessRatingComboBox.getItems().addAll("1", "2", "3", "4", "5");
    }

    @FXML
    private void handleSubmitChecklist() {
        String rideName = rideNameField.getText();
        String cleanlinessRating = cleanlinessRatingComboBox.getValue();
        String issuesFound = issuesArea.getText();
        String durationText = durationField.getText();

        // Validate that all required fields are filled
        if (rideName.isEmpty() || cleanlinessRating == null || durationText.isEmpty()) {
            submissionStatusArea.setText("Error: Please fill in all required fields.");
            return;
        }

        // Validate that duration is a number
        int duration;
        try {
            duration = Integer.parseInt(durationText);
        } catch (NumberFormatException e) {
            submissionStatusArea.setText("Error: Duration must be a valid number.");
            return;
        }

        // Logic to submit the checklist and store in the system (placeholder)
        // For example: saveChecklistToDatabase(rideName, cleanlinessRating, issuesFound, duration);

        // Display confirmation and summary of the report
        submissionStatusArea.setText("Checklist submitted successfully!\n" +
                "Ride Name: " + rideName + "\n" +
                "Cleanliness Rating: " + cleanlinessRating + "\n" +
                "Issues Found: " + (issuesFound.isEmpty() ? "None" : issuesFound) + "\n" +
                "Duration of Check: " + duration + " minutes.");
    }
}
