package OOPProject.Santo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class OverseeStaffSchedulesController {

    @FXML
    private ComboBox<String> staffComboBox;
    @FXML
    private TextField shiftField;
    @FXML
    private TextArea conflictArea;
    @FXML
    private TextArea scheduleArea;

    private List<String> staffSchedules = new ArrayList<>();

    @FXML
    private void initialize() {
        // Populate staffComboBox with staff names (example)
        staffComboBox.getItems().addAll("Staff 1", "Staff 2", "Staff 3");
    }

    @FXML
    private void handleAssignShift() {
        String selectedStaff = staffComboBox.getValue();
        String shift = shiftField.getText();

        // Logic to check for conflicts (placeholder)
        if (staffSchedules.contains(selectedStaff + ": " + shift)) {
            conflictArea.setText("Conflict detected for " + selectedStaff + " on " + shift);
        } else {
            staffSchedules.add(selectedStaff + ": " + shift);
            conflictArea.clear();
            scheduleArea.appendText(selectedStaff + " assigned to " + shift + "\n");
        }
    }

    @FXML
    private void handleSaveSchedule() {
        // Logic to save the schedule and notify staff
        scheduleArea.appendText("Schedule saved and staff notified.\n");
    }
}
