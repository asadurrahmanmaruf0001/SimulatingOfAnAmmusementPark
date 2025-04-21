package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ModifyTicketInfoController
{
    @javafx.fxml.FXML
    private TextField txtTicketNumber;
    @javafx.fxml.FXML
    private Label lblvisitorStatus;
    @javafx.fxml.FXML
    private TextField txtNewDate;
    @javafx.fxml.FXML
    private Label lblTicketInform;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnUpdate(ActionEvent actionEvent) {
        String newDate= txtNewDate.getText();
        if(newDate.isEmpty()){
            lblTicketInform.setText("Please enter a new date");
        }else;
        lblTicketInform.setText("Ticket updated successfully for"+newDate);
    }

    @javafx.fxml.FXML
    public void btnModifyTicket(ActionEvent actionEvent) {
        System.out.println("Modify ticket clicked");
        String ticketNumber= txtTicketNumber.getText();
        if (ticketNumber.equals("12345")){
            lblTicketInform.setText("Visitor:Maruf,Date:25-04-25");
        }else{
            lblTicketInform.setText(("Ticket not found"));
        }

    }
}