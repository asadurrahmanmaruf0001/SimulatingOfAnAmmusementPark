package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import OOPProject.Akib.AccessLogsModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class AccessLogsFxmlController {
    @javafx.fxml.FXML
    private TableView<AccessLogsModel> accessLogsTableView;
    @javafx.fxml.FXML
    private TableColumn<AccessLogsModel, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccessLogsModel, String> entryTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccessLogsModel, String> locationTableColumn;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectLocationComboBox;

    ArrayList<AccessLogsModel> accessL= new ArrayList<>();

    public AccessLogsFxmlController() {
        accessL.add(new AccessLogsModel("Akib", LocalDateTime.of(2025, 4, 18, 9, 30), "Entrance"));
        accessL.add(new AccessLogsModel("Noor", LocalDateTime.of(2025, 4, 18, 10, 15), "Exit"));
        accessL.add(new AccessLogsModel("Hassan", LocalDateTime.of(2025, 4, 17, 14, 45), "Gate"));
    }

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        entryTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("entryTimeFormatted"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));

        updateTable(accessL);


        ArrayList<String> locations = new ArrayList<>();
        for (AccessLogsModel log : accessL) {
            if (!locations.contains(log.getLocation())) {
                locations.add(log.getLocation());
            }
        }
        selectLocationComboBox.getItems().addAll(locations);



    }
    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
        LocalDate selectedDate = selectDateDatePicker.getValue();
        String selectedLocation = selectLocationComboBox.getValue();

        ArrayList<AccessLogsModel> filteredLogs = new ArrayList<>();

        for (AccessLogsModel log : accessL) {
            boolean matchesDate = (selectedDate == null) || log.getEntryTime().toLocalDate().equals(selectedDate);
            boolean matchesLocation = (selectedLocation == null) || log.getLocation().equalsIgnoreCase(selectedLocation);

            if (matchesDate && matchesLocation) {
                filteredLogs.add(log);
            }
        }


        accessLogsTableView.getItems().clear();
        accessLogsTableView.getItems().addAll(filteredLogs);


        if (filteredLogs.isEmpty()) {
            messageLabel.setText("No records found for the selected filters.");
        } else {
            messageLabel.setText("");
        }
    }
    private void updateTable(ArrayList<AccessLogsModel> logs) {
        accessLogsTableView.getItems().clear();
        accessLogsTableView.getItems().addAll(logs);
    }

}
