package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import OOPProject.Akib.EmergencyRepairModel;

import java.util.ArrayList;

public class EmergencyRepairController
{
    @javafx.fxml.FXML
    private TextField equipmentTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> urgencyComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    ArrayList<EmergencyRepairModel> er = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        urgencyComboBox.getItems().addAll("High", "Medium", "Low");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String equipment = equipmentTextField.getText();
        String description = descriptionTextArea.getText();
        String urgency = urgencyComboBox.getValue();

        if (equipment.isEmpty() || description.isEmpty() || urgency == null) {
            messageLabel.setText("Please fill in all fields.");
            return;
        }
        EmergencyRepairModel report = new EmergencyRepairModel(equipment, description, urgency);
        er.add(report);

        messageLabel.setText("Emergency report submitted with HIGH priority!");


        equipmentTextField.clear();
        descriptionTextArea.clear();
        urgencyComboBox.setValue(null);
    }
}