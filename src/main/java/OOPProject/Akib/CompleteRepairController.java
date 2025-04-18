package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.CompleteRepairModel;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.ArrayList;

public class CompleteRepairController {
    @javafx.fxml.FXML
    private TextField equipmentNameTextField;
    @javafx.fxml.FXML
    private DatePicker repairDateDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    ArrayList<CompleteRepairModel> rl = new ArrayList<>();
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<CompleteRepairModel, String> repairDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CompleteRepairModel, String> descriptionTableColumn;
    @javafx.fxml.FXML
    private TableView<CompleteRepairModel> completeRepairTableView;
    @javafx.fxml.FXML
    private TableColumn<CompleteRepairModel, String> equipmentNameTableColumn;



    @javafx.fxml.FXML
    public void initialize() {
        // Set up table columns to match model properties
        equipmentNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        repairDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("repairDate"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String equipmentName = equipmentNameTextField.getText();
        String description = descriptionTextArea.getText();
        LocalDate repairDate = repairDateDatePicker.getValue();

        if (equipmentName.isEmpty() || repairDate == null || description.isEmpty()) {
            messageLabel.setText("Please fill in all fields.");
        }
        else {

            CompleteRepairModel repair = new CompleteRepairModel(equipmentName, repairDate, description);
            rl.add(repair);


            messageLabel.setText("Repair logged successfully.");

            equipmentNameTextField.clear();
            repairDateDatePicker.setValue(null);
            descriptionTextArea.clear();

            updateTable();

        }
    }
    private void updateTable() {
        completeRepairTableView.getItems().clear();
        completeRepairTableView.getItems().addAll(rl);
    }
}
