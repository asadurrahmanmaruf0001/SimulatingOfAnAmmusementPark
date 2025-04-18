package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.MaintenanceHistoryModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceHistoryController {
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> taskTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> staffTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> equipmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> outcomeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> taskTypeComboBox;
    @javafx.fxml.FXML
    private TableView<MaintenanceHistoryModel> historyTableView;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> equipmentTableColumn;

    ArrayList<MaintenanceHistoryModel> historyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        equipmentComboBox.getItems().addAll("Generator", "AC", "Ride", "Lights");
        taskTypeComboBox.getItems().addAll("Repair", "Inspection", "Cleaning", "Upgrade");

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        equipmentTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipment"));
        taskTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("taskType"));
        staffTableColumn.setCellValueFactory(new PropertyValueFactory<>("staff"));
        outcomeTableColumn.setCellValueFactory(new PropertyValueFactory<>("outcome"));


        historyList.add(new MaintenanceHistoryModel(LocalDate.of(2025, 04, 01), "Generator", "Repair", "Akib", "Fixed"));
        historyList.add(new MaintenanceHistoryModel(LocalDate.of(2025, 04, 05), "AC", "Inspection", "Noor", "Working fine"));
        historyList.add(new MaintenanceHistoryModel(LocalDate.of(2025, 04, 10), "Ride", "Repair", "Hassan", "Recurring issue"));

        updateTable(historyList);
    }

    private void updateTable(ArrayList<MaintenanceHistoryModel> list) {
        historyTableView.getItems().clear();
        historyTableView.getItems().addAll(list);
    }

    @javafx.fxml.FXML
    public void genarateReportButtonOnAction(ActionEvent actionEvent) {

    }


    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
        String selectedEquipment = equipmentComboBox.getValue();
        String selectedTaskType = taskTypeComboBox.getValue();
        LocalDate startDate = startDateDatePicker.getValue();
        LocalDate endDate = endDateDatePicker.getValue();

        historyTableView.getItems().clear();

        ArrayList<MaintenanceHistoryModel> filteredHistory = new ArrayList<>();

        for (MaintenanceHistoryModel record : historyList) {
            boolean matches = true;

            if (selectedEquipment != null && !selectedEquipment.isEmpty() && !record.getEquipment().equals(selectedEquipment)) {
                matches = false;
            }

            if (selectedTaskType != null && !selectedTaskType.isEmpty() && !record.getTaskType().equals(selectedTaskType)) {
                matches = false;
            }

            if (startDate != null && record.getDate().isBefore(startDate)) {
                matches = false;
            }
            if (endDate != null && record.getDate().isAfter(endDate)) {
                matches = false;
            }

            if (matches) {
                filteredHistory.add(record);
            }
            historyTableView.getItems().addAll(filteredHistory);
            if (filteredHistory.isEmpty()) {
                messageLabel.setText("No records found matching your criteria.");
            } else {
                messageLabel.setText("Found " + filteredHistory.size() + " maintenance records.");
            }


        }
    }

}