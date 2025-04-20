package OOPProject.Akib;

import OOPProject.Akib.SecurityDashboardDesignModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SecurityDashboardDesignController {
    @javafx.fxml.FXML
    private TableColumn<SecurityDashboardDesignModel, String> repairListTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SecurityDashboardDesignModel, String> weekdayTableColumn;
    @javafx.fxml.FXML
    private TableView<SecurityDashboardDesignModel> securityTableView;
    @javafx.fxml.FXML
    private TableColumn<SecurityDashboardDesignModel, String> timeTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
        // Connect table columns to the model class properties
        weekdayTableColumn.setCellValueFactory(new PropertyValueFactory<>("weekday"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        repairListTableColumn.setCellValueFactory(new PropertyValueFactory<>("repairList"));

        // Add some sample data using ArrayList
        ArrayList<SecurityDashboardDesignModel> scheduleList = new ArrayList<>();
        scheduleList.add(new SecurityDashboardDesignModel("Saturday", "10:00 AM - 2:00 PM", "Gate Check"));
        scheduleList.add(new SecurityDashboardDesignModel("Monday", "2:00 PM - 6:00 PM", "CCTV Repair"));
        scheduleList.add(new SecurityDashboardDesignModel("Wednesday", "12:00 PM - 4:00 PM", "Alarm Testing"));

        // Add data to TableView
        securityTableView.getItems().addAll(scheduleList);
    }
}







