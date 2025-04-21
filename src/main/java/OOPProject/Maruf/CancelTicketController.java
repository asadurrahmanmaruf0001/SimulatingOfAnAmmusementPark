package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CancelTicketController
{
    @javafx.fxml.FXML
    private Label refundMessageLab;
    @javafx.fxml.FXML
    private TextArea ticketDetailsArea;
    @javafx.fxml.FXML
    private TextField ticketIdField;

    @javafx.fxml.FXML
    public void initialize() {
        ticketDetailsArea.setText("");
        refundMessageLab.setText("");
    }

    @javafx.fxml.FXML
    public void cancelTicket(ActionEvent actionEvent) {
        String tciketId= ticketIdField.getText();
        if (tciketId==null || tciketId.isEmpty()){
            refundMessageLab.setText("Please enter a valid ticket ID");
            return;
        }
        ticketDetailsArea.setText("Ticket ID"+tciketId + "\n type:VIP\nDate: !8 April 2025");
        refundMessageLab.setText("Your ticket has been cancelled");
    }
}