package OOPProject.Maruf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SellOnlineTicketController
{
    @javafx.fxml.FXML
    private TableColumn<OnlineTicket, String> colPaymentStatus;
    @javafx.fxml.FXML
    private TableColumn<OnlineTicket, String> colName;
    @javafx.fxml.FXML
    private TableColumn<OnlineTicket, String> colTypeTicket;
    @javafx.fxml.FXML
    private Label lblOnlineStatus;
    @javafx.fxml.FXML
    private TableColumn<OnlineTicket,String> colDate;
    @javafx.fxml.FXML
    private TableView<OnlineTicket> tableOnlineticket;

    @javafx.fxml.FXML
    public void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colTypeTicket.setCellValueFactory(new PropertyValueFactory<>("ticketType"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("visitDate"));
        colPaymentStatus.setCellValueFactory(new PropertyValueFactory<>("PaymentConfirmed"));
        ObservableList<OnlineTicket> tickets=FXCollections.observableArrayList(new OnlineTicket("sadia","adult","2025-04-9",false),new OnlineTicket("Rafi","Child","2024-09-7",true));
        tableOnlineticket.setItems(tickets);


    }

    @javafx.fxml.FXML
    public void btnApproveOrder(ActionEvent actionEvent) {
        OnlineTicket selected= tableOnlineticket.getSelectionModel().getSelectedItem();
        if(selected == null){
            lblOnlineStatus.setText("Please select a ticket");
        } else {
            lblOnlineStatus.setText("Payment not confirmed");

        }
    }
}