package OOPProject.Akib;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import OOPProject.Akib.maintenanceStaffModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class maintenanceStaffController {
    @javafx.fxml.FXML
    private TableColumn<maintenanceStaffModel, String> taskTableColumn;
    @javafx.fxml.FXML
    private TextField filterBySkillsTextField;
    @javafx.fxml.FXML
    private TableView<maintenanceStaffModel> taskTableView;
    @javafx.fxml.FXML
    private DatePicker taskDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> selectMaintenanceStaffComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<maintenanceStaffController, String> equipmentTableColumn;
    @javafx.fxml.FXML
    private TableColumn<maintenanceStaffModel, String> issueSeverityTableColumn;

    ArrayList<maintenanceStaffModel> taskList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        selectMaintenanceStaffComboBox.getItems().addAll("Akib_CSE", "Noor_Mechanical", "Hassan_Electrical");

        taskTableColumn.setCellValueFactory(new PropertyValueFactory<>("task"));
        equipmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipment"));
        issueSeverityTableColumn.setCellValueFactory(new PropertyValueFactory<>("issueSeverity"));


        taskList.add(new maintenanceStaffModel("Fix Lights", "Light", "High"));
        taskList.add(new maintenanceStaffModel("Repair Ride", "Roller Coaster", "Medium"));

        for (maintenanceStaffModel task : taskList) {
            taskTableView.getItems().add(task);
        }
    }

    @javafx.fxml.FXML
    public void assignStaffButtonOnAction(ActionEvent actionEvent) {
        maintenanceStaffModel selectedTask = taskTableView.getSelectionModel().getSelectedItem();
        String selectedStaff = selectMaintenanceStaffComboBox.getValue();
        LocalDate selectedDate = taskDateDatePicker.getValue();


        if (selectedTask == null || selectedStaff == null || selectedDate == null) {
            messageLabel.setText("Please select task, staff, and date.");
        } else {
            messageLabel.setText("Assigned " + selectedStaff + " on " + selectedDate + " to: " + selectedTask.getTask());
        }
    }

}
