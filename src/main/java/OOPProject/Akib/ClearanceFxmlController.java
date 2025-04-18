package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import OOPProject.Akib.ClearanceModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClearanceFxmlController {
    @javafx.fxml.FXML
    private Label temporaryAccessCodeLabel;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker clearanceDurationButtonOnAction;
    @javafx.fxml.FXML
    private ComboBox<String> accessAreaComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;

    ArrayList<ClearanceModel> clearanceList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        accessAreaComboBox.getItems().addAll("Control Room", "Storage Area", "Maintenance Zone", "Server Room");
    }


    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {

        String name = nameTextField.getText();
        String area = accessAreaComboBox.getValue();
        LocalDate date = clearanceDurationButtonOnAction.getValue();


        if (name == null || name.isEmpty() || area == null || date == null) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }


        if (name.length() < 2) {
            statusLabel.setText("Name is too short.");
            return;
        }


        String accessCode = generateAccessCode();
        String clearanceDate = date.toString();


        ClearanceModel clearance = new ClearanceModel(name, area, clearanceDate, accessCode);
        clearanceList.add(clearance);


        statusLabel.setText("Clearance Granted!");
        temporaryAccessCodeLabel.setText("Code: " + accessCode);


        nameTextField.clear();
        accessAreaComboBox.setValue(null);
        clearanceDurationButtonOnAction.setValue(null);
    }


    private String generateAccessCode() {
        return "Akib2331454";
    }
}
