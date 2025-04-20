package OOPProject.Maruf;

import OOPProject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TicketSellerDashboard
{
    @javafx.fxml.FXML
    private BorderPane TCBoarder;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyTicketOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/BuyTicket.fxml"));
        Parent root = fxmlLoader.load();
        TCBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void verifyTicketOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/VerifyTicket.fxml"));
        Parent root = fxmlLoader.load();
        TCBoarder.setCenter(root);

    }

    @javafx.fxml.FXML
    public void refundOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/RefundTicket.fxml"));
        Parent root = fxmlLoader.load();
        TCBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void modifyTicketOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Maruf/modifyTicket.fxml"));
        Parent root = fxmlLoader.load();
        TCBoarder.setCenter(root);
    }

    @javafx.fxml.FXML
    public void lostTicketOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onlineTicketOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void counterTicketOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void salesReportOnAction(ActionEvent actionEvent) {
    }
}