package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.IncidentReportModel;

import java.util.ArrayList;


public class IncidentReportFxmlController {
    @javafx.fxml.FXML
    private ComboBox<String> selectIncidentComboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private Label messageLabel;

    ArrayList<IncidentReportModel> incident = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        // Add predefined incident categories
        selectIncidentComboBox.getItems().addAll("Unauthorized Access", "Theft", "Suspicious Activity", "Equipment Damage", "Emergency Situation");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String location = locationTextField.getText();
        String time = timeTextField.getText();
        String description = descriptionTextArea.getText();
        String incidentType = selectIncidentComboBox.getValue();

        if (location.isEmpty() || time.isEmpty() || description.isEmpty() || incidentType == null) {
            messageLabel.setText("Please fill all the fields");
            return;
        }

        IncidentReportModel report = new IncidentReportModel(location, time, description, incidentType);
        incident.add(report);

        messageLabel.setText("Incident reported successfully and control center notified");

        locationTextField.clear();
        timeTextField.clear();
        descriptionTextArea.clear();
        selectIncidentComboBox.getSelectionModel().clearSelection();
    }

}
