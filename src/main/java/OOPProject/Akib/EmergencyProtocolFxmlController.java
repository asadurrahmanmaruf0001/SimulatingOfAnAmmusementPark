package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.EmergencyProtocolModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EmergencyProtocolFxmlController {
    @javafx.fxml.FXML
    private TableColumn<EmergencyProtocolModel, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EmergencyProtocolModel, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextArea logTextArea;
    @javafx.fxml.FXML
    private TableView<EmergencyProtocolModel> protocolTableView;
    @javafx.fxml.FXML
    private Label clearanceStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<EmergencyProtocolModel, String> descriptionTableColumn;

    private ArrayList<EmergencyProtocolModel> protocol = new ArrayList<>();
    private String officerId = "123456";

    @javafx.fxml.FXML
    public void initialize() {
        // Set up table columns
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        protocol.add(new EmergencyProtocolModel("Fire", "Handle fire emergencies", "Inactive"));
        protocol.add(new EmergencyProtocolModel("Medical", "Handle medical issues", "Inactive"));
        protocol.add(new EmergencyProtocolModel("Evacuation", "Evacuate the area", "Inactive"));


        for (EmergencyProtocolModel proto : protocol) {
            protocolTableView.getItems().add(proto);
        }
    }


        @javafx.fxml.FXML
    public void activeButtonOnAction(ActionEvent actionEvent) {
            EmergencyProtocolModel selected = protocolTableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                if (hasClearance()) {selected.setStatus("Active");protocolTableView.refresh();

                    String log = "Activated: " + selected.getName() +
                            "\nOfficer ID: " + officerId +
                            "\nTime: " + LocalDateTime.now() +
                            "\nZone: Main Zone\n\n";
                    logTextArea.appendText(log);
                    clearanceStatusLabel.setText("Protocol Activated");
                } else {
                    clearanceStatusLabel.setText("Access Denied: Low Clearance");
                }
            } else {
                clearanceStatusLabel.setText("Please select a protocol");
            }
    }

    public void viewStepsButtonOnAction(javafx.event.ActionEvent actionEvent) {
        EmergencyProtocolModel selected = protocolTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            clearanceStatusLabel.setText("Please select a protocol");
            return;
        }

        String protocolName = selected.getName();

        if (protocolName.equals("Fire")) {
            logTextArea.appendText("Steps for Fire Protocol:\n");
            logTextArea.appendText("- Pull fire alarm\n");
            logTextArea.appendText("- Call fire department\n");
            logTextArea.appendText("- Evacuate building\n\n");
        }

        if (protocolName.equals("Medical")) {
            logTextArea.appendText("Steps for Medical Protocol:\n");
            logTextArea.appendText("- Call for help\n");
            logTextArea.appendText("- Give first aid\n");
            logTextArea.appendText("- Wait for medics\n\n");
        }

        if (protocolName.equals("Evacuation")) {
            logTextArea.appendText("Steps for Evacuation Protocol:\n");
            logTextArea.appendText("- Tell everyone to leave\n");
            logTextArea.appendText("- Use emergency exits\n");
            logTextArea.appendText("- Go to safe zone\n\n");
        }
    }

    private boolean hasClearance() {

        return officerId.equals("123456");
    }


}
