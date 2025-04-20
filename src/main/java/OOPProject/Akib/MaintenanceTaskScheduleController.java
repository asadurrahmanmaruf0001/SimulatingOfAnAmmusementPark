package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import OOPProject.Akib.maintenanceTaskScheduleModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceTaskScheduleController
{
    @javafx.fxml.FXML
    private Button submitButtonOnAction;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<maintenanceTaskScheduleModel, LocalDate> maintenanceDateTableColumn;
    @javafx.fxml.FXML
    private TableView<maintenanceTaskScheduleModel> workTableView;
    @javafx.fxml.FXML
    private TableColumn<maintenanceTaskScheduleModel, String> designatedWorkTableColumn;
    @javafx.fxml.FXML
    private TableColumn<maintenanceTaskScheduleModel, String> timeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> designatedWorkComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> maintenanceStaffComboBox;
    @javafx.fxml.FXML
    private TableColumn<maintenanceTaskScheduleModel, String> maintenanceStaffTableColumn;
    @javafx.fxml.FXML
    private Label messageLabel;

    ArrayList<maintenanceTaskScheduleModel> taskList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        maintenanceStaffComboBox.getItems().addAll("Akib", "Noor", "Hassan");
        designatedWorkComboBox.getItems().addAll("Repair", "Inspection", "Cleaning");

        maintenanceStaffTableColumn.setCellValueFactory(new PropertyValueFactory<>("maintenanceStaff"));
        maintenanceDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("maintenanceDate"));
        designatedWorkTableColumn.setCellValueFactory(new PropertyValueFactory<>("designatedWork"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String maintenanceStaff = maintenanceStaffComboBox.getValue();
        String designatedWork = designatedWorkComboBox.getValue();
        LocalDate maintenanceDate = maintenanceDateDatePicker.getValue();
        String time = timeTextField.getText();

        if (maintenanceStaff.isBlank() || designatedWork.isBlank() || maintenanceDate==null || time.isEmpty()) {
            messageLabel.setText("Validation Error! Please fill in all fields.");
            return;
        }

        maintenanceTaskScheduleModel task = new maintenanceTaskScheduleModel(maintenanceStaff,maintenanceDate, designatedWork, time);
        taskList.add(task);
        workTableView.getItems().setAll(taskList);

    }

}

