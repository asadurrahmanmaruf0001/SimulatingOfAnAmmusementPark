package OOPProject.Akib;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import OOPProject.Akib.MaintenanceDesignModel;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MaintenanceDesign implements Initializable {
    @javafx.fxml.FXML
    private TableColumn<MaintenanceDesignModel, String> repairListTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceDesignModel, String> weekdayTableColumn;
    @javafx.fxml.FXML
    private TableView<MaintenanceDesignModel> WorkTableView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceHistoryModel, String> timeTableColumn;

    ArrayList<MaintenanceDesignModel> taskList = new ArrayList<>();

    @Deprecated
    public void initialize(URL url, ResourceBundle resourceBundle) {
        weekdayTableColumn.setCellValueFactory(new PropertyValueFactory<>("weekday"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        repairListTableColumn.setCellValueFactory(new PropertyValueFactory<>("repairList"));


        taskList.add(new MaintenanceDesignModel("Sunday", "09:00 AM", "Fix Lights"));
        taskList.add(new MaintenanceDesignModel("Tuesday", "11:00 AM", "Clean Filters"));
        taskList.add(new MaintenanceDesignModel("Thursday", "02:00 PM", "Roller Coaster Repair"));

        for (MaintenanceDesignModel task : taskList) {
            WorkTableView.getItems().add(task);
        }
    }
}