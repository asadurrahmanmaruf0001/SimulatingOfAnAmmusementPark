package OOPProject.Santo;

import OOPProject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ParkAdminDashBoardController {

    @javafx.fxml.FXML
    private BorderPane paBoarder;
    @javafx.fxml.FXML
    private Label PaDashBoard;

    @javafx.fxml.FXML
    public void MonitorParkAttendanceOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/MonitorParkAttendance.fxml"));
        Parent root = fxmlLoader.load();
        paBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void ManageRideOperationsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/ManageRideOperations.fxml"));
        Parent root = fxmlLoader.load();
        paBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void ScheduleMaintenanceforRidesOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/ScheduleMaintenanceforRides.fxml"));
        Parent root = fxmlLoader.load();
        paBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void GenerateReportsonRidePerformanceOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/GenerateReportsonRidePerformance.fxml"));
        Parent root = fxmlLoader.load();
        paBoarder.setCenter(root);
    }


}
