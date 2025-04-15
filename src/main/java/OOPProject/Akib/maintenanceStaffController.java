package OOPProject.Akib;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class maintenanceStaffController {
    @javafx.fxml.FXML
    private TableColumn taskTableColumn;
    @javafx.fxml.FXML
    private TextField filterBySkillsTextField;
    @javafx.fxml.FXML
    private TableView taskTableView;
    @javafx.fxml.FXML
    private DatePicker taskDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox selectMaintenanceStaffComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn equipmentTableColumn;
    @javafx.fxml.FXML
    private TableColumn issueSeverityTableColumn;

    ArrayList<Task> taskList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectMaintenanceStaffComboBox.getItems().addAll("Joshim", "Abul", "Jaker", "Labib");

        taskTableColumn.setCellValueFactory(new PropertyValueFactory<>("Task"));
        equipmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("Equipment"));
        issueSeverityTableColumn.setCellValueFactory(new PropertyValueFactory<>("Severity"));





    }

    @javafx.fxml.FXML
    public void assignStaffButtonOnAction(ActionEvent actionEvent) {
    }
}
