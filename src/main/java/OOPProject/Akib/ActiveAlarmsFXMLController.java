package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.ActiveAlarmsModel;
import OOPProject.Akib.PatrolHistoryModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalTime;
import java.util.ArrayList;

public class ActiveAlarmsFXMLController {
    @javafx.fxml.FXML
    private TableColumn<ActiveAlarmsModel, String> triggerTimeTableColumn;
    @javafx.fxml.FXML
    private TextField patrolDetailsTextField;
    @javafx.fxml.FXML
    private TableView<ActiveAlarmsModel> activeAlermsTableView;
    @javafx.fxml.FXML
    private TableView<PatrolHistoryModel> patrolHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn<ActiveAlarmsModel, String> typeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PatrolHistoryModel, String> endTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ActiveAlarmsModel, String> locationTablecolumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<PatrolHistoryModel, String> startTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PatrolHistoryModel, String> zoneTableColumn;

    private ArrayList<ActiveAlarmsModel> activeAlarmsList = new ArrayList<>();
    private ArrayList<PatrolHistoryModel> patrolHistoryList = new ArrayList<>();
    private String patrolStartTime = null;
    private String currentZone = null;

    @javafx.fxml.FXML
    public void initialize() {
        locationTablecolumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        triggerTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("triggerTime"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        zoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("zone"));
        startTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        endTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("endTime"));

        loadActiveAlarms();

    }
        private void loadActiveAlarms() {
            activeAlarmsList.add(new ActiveAlarmsModel("Zone A", "10:45 AM", "Fire"));
            activeAlarmsList.add(new ActiveAlarmsModel("Zone B", "11:00 AM", "Intrusion"));

            activeAlermsTableView.getItems().setAll(activeAlarmsList);
        }


    @javafx.fxml.FXML
    public void endPatrolButtonOnAction(ActionEvent actionEvent) {
        if (patrolStartTime == null || currentZone == null) {
            messageLabel.setText("No patrol is active.");
            return;
        }

        String patrolEndTime = LocalTime.now().toString().substring(0, 8);

        PatrolHistoryModel history = new PatrolHistoryModel(currentZone, patrolStartTime, patrolEndTime);
        patrolHistoryList.add(history);
        patrolHistoryTableView.getItems().setAll(patrolHistoryList);

        messageLabel.setText("Patrol ended at " + patrolEndTime);
        patrolStartTime = null;
        currentZone = null;

    }

    @javafx.fxml.FXML
    public void startPatrolButtonOnAction(ActionEvent actionEvent) {
        String details = patrolDetailsTextField.getText();
        if (details.isEmpty()) {
            messageLabel.setText("Please enter patrol details.");
            return;
        }
        ActiveAlarmsModel selectedAlarm = activeAlermsTableView.getSelectionModel().getSelectedItem();
        if (selectedAlarm == null) {
            messageLabel.setText("Please select an alarm to patrol.");
            return;
        }

        currentZone = selectedAlarm.getLocation();
        patrolStartTime = LocalTime.now().toString().substring(0, 8); // HH:mm:ss
        messageLabel.setText("Patrol started in " + currentZone + " at " + patrolStartTime);
        patrolDetailsTextField.clear();
    }
}

