package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class BuyTicketController
{
    @javafx.fxml.FXML
    private Label lblConfirmation;
    @javafx.fxml.FXML
    private Label lblconfirmation;
    @javafx.fxml.FXML
    private ComboBox <String>ticketTypeCombo;
    @javafx.fxml.FXML
    private Label availabilityLabel;
    @javafx.fxml.FXML
    private DatePicker visitDtaePicker;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private Label successLabel;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private TextField paymentField;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void nextButton(ActionEvent actionEvent) {
        LocalDate selectedDate = visitDtaePicker.getValue();
        if(selectedDate != null){
            availabilityLabel.setText("Tickets available");
        }else{
            availabilityLabel.setText("No tickets are available at this time.Please pick another date");
        }
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        if(paymentField.getText().isEmpty()){
            successLabel.setText("Please enter payment details.");
        }else{
            successLabel.setText("Ticket booked!.Check your email on my tickets");
        }
    }
}