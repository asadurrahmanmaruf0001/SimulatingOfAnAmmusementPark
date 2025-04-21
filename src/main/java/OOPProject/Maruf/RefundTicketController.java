package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RefundTicketController
{
    @javafx.fxml.FXML
    private TextField txtTicketNum;
    @javafx.fxml.FXML
    private Label lblRefundStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnCheckRefund(ActionEvent actionEvent) {
        String ticketNum= txtTicketNum.getText();
        if(ticketNum.isEmpty()){
            lblRefundStatus.setText("Please enter ticket number");
        }else{
            boolean eligible=ticketNum.equals("T123");
            RefundTicket ticket= new RefundTicket(ticketNum, eligible);
            if(ticket.isIseligible()){
                lblRefundStatus.setText(ticket.getTicketNumber()+ "is canceled.Refund will be send");

                }else{
                lblRefundStatus.setText("This ticket is not eligible for refund");
            }
        }
    }

}