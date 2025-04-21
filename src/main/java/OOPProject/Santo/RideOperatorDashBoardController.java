package OOPProject.Santo;

import OOPProject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class RideOperatorDashBoardController
{
    @javafx.fxml.FXML
    private Label RoDashBoard;
    @javafx.fxml.FXML
    private BorderPane RoBoarder;

    @javafx.fxml.FXML
    public void initialize() {
        RoDashBoard.setText("Welcome to the Ride Operator Dashboard!");

        // You can also perform any setup tasks here, such as loading initial data
        // For example, you might want to load the current ride status or availability
        loadInitialRideStatus();
    }

    private void loadInitialRideStatus() {
    }

    @javafx.fxml.FXML
    public void MonitorRideSafetyOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/MonitorRideSafety.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void UpdateRideAvailabilityStatusControllerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/UpdateRideAvailabilityStatusController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }


    @javafx.fxml.FXML
    public void AssistGuestsControllerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/AssistGuestsController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void StartStopRidesOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/StartStopRides.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void LogRideOperationsControllerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/LogRideOperationsController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void ManageQueueSystemControllerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/ManageQueueSystemController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void PerformEndOfDayChecklistsControllerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/PerformEndOfDayChecklistsController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void HandleEmergencyRideShutdownControllerOnaction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/HandleEmergencyRideShutdownController.fxml"));
        Parent root = fxmlLoader.load();
        RoBoarder.setCenter(root);
    }
}