package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.AssignDutyModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class AssignDutyFxmlController {
    @javafx.fxml.FXML
    private TableColumn<AssignDutyModel, String> assignedZoneTableColumn;
    @javafx.fxml.FXML
    private TextField dutyZoneTextField;
    @javafx.fxml.FXML
    private TableColumn<AssignDutyModel, String> officerNameTableColumn;
    @javafx.fxml.FXML
    private Label selectedOfficerLabel;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableView<AssignDutyModel> securityTableView;

    private ArrayList<AssignDutyModel> officers = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        officerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        assignedZoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignedZone"));

        // Add sample data
        officers.add(new AssignDutyModel("Akib", ""));
        officers.add(new AssignDutyModel("Noor", ""));
        officers.add(new AssignDutyModel("Hassan", ""));

        for (AssignDutyModel officer : officers) {
            securityTableView.getItems().add(officer);

        }


    }

    @javafx.fxml.FXML
    public void assignButtonOnAction(ActionEvent actionEvent) {
        AssignDutyModel selectedOfficer = securityTableView.getSelectionModel().getSelectedItem();

        if (selectedOfficer == null) {
            messageLabel.setText("Please select an officer first.");
            return;
        }

        String zone = dutyZoneTextField.getText().trim();

        if (zone.isEmpty()) {
            messageLabel.setText("Please enter a duty zone.");
            return;
        }

        if (!selectedOfficer.getAssignedZone().isEmpty()) {
            messageLabel.setText("An officer is already assigned to this area ");
            return;
        }


        selectedOfficer.setAssignedZone(zone);
        messageLabel.setText("Assigned " + selectedOfficer.getName() + " to zone: " + zone);


        securityTableView.refresh();
    }

    @javafx.fxml.FXML
    public void notifyNotificationButtonOnAction(ActionEvent actionEvent) {
        AssignDutyModel selectedOfficer = securityTableView.getSelectionModel().getSelectedItem();

        if (selectedOfficer == null || selectedOfficer.getAssignedZone().isEmpty()) {
            messageLabel.setText("Please assign a zone first before notifying.");
        }
        else {
            messageLabel.setText("Notification sent to " + selectedOfficer.getName()
                    + " for duty at " + selectedOfficer.getAssignedZone());
        }
    }
}

