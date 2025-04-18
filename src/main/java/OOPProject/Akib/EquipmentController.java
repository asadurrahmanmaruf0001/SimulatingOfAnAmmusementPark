package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.EquipmentModel;
import javafx.scene.control.cell.PropertyValueFactory;


import java.time.LocalDate;
import java.util.ArrayList;
import javafx.event.ActionEvent;
public class EquipmentController
{

    @javafx.fxml.FXML
    private DatePicker StartDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EquipmentModel, String> usageHistoryTableColumn;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn<EquipmentModel, String> equipmentIDTableColumn;
    @javafx.fxml.FXML
    private TableView<EquipmentModel> equipmentTableView;
    @javafx.fxml.FXML
    private TableColumn<EquipmentController, String> equipmentNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EquipmentModel, String> lastMaintenanceDateTableColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<EquipmentModel, String> statusTableColumn;

    ArrayList<EquipmentModel> equipmentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        equipmentIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentID"));
        equipmentNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        usageHistoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("usageHistory"));
        lastMaintenanceDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("lastMaintenanceDate"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        equipmentList.add(new EquipmentModel("01", "Pump", "Used daily", LocalDate.of(2024, 12, 1)));
        equipmentList.add(new EquipmentModel("02", "Generator", "Used weekly", LocalDate.of(2023, 10, 15))); // Overdue
        equipmentList.add(new EquipmentModel("03", "Cooler", "Used occasionally", LocalDate.of(2025, 3, 5)));

        showAllEquipment();
    }
    private void showAllEquipment() {
        equipmentTableView.getItems().clear();
        for (EquipmentModel eq : equipmentList) {
            equipmentTableView.getItems().add(eq);
        }

    }

    @javafx.fxml.FXML
    public void reportButtonOnAction(ActionEvent actionEvent) {
        int count = equipmentTableView.getItems().size();
        messageLabel.setText("Report " + count + " equipment.");
    }


    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
        LocalDate start = StartDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();

        if (start == null || end == null) {
            messageLabel.setText("Please select both start and end dates.");
            return;
        }
        equipmentTableView.getItems().clear();

        for (EquipmentModel eq : equipmentList) {
            LocalDate maintenanceDate = eq.getLastMaintenanceDate();
            if ((maintenanceDate.isEqual(start) || maintenanceDate.isAfter(start)) &&
                    (maintenanceDate.isEqual(end) || maintenanceDate.isBefore(end))) {
                equipmentTableView.getItems().add(eq);
            }
        }

        messageLabel.setText("Filtered results shown.");
    }

}