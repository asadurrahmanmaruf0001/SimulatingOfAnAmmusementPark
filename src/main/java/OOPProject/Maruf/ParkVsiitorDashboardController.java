package OOPProject.Maruf;
import OOPProject.HelloApplication;
import OOPProject.Maruf.ParkVisitorDashboardModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ParkVsiitorDashboardController {
    @javafx.fxml.FXML
    private BorderPane pvBoarder;

    @javafx.fxml.FXML
    public void rideWaitTimeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/viewRideWaitTimes.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void entryRuleOnAction(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void myTicketOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/cancelTicket.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void buyTicketOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/BuyTicket.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void bookTableOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/BookRestaurantTable.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void parkMapOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/ViewParkMap.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void rideStatusOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/checkRideAvailability.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/SubmitFeedback.fxml"));
        Parent root = fxmlLoader.load();
        pvBoarder.setCenter(root);

    }

    public void setter(String maruf, String maruf123) {
    }
}
