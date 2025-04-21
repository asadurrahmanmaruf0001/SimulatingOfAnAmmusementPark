package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SelTicketInCounterController
{
    @javafx.fxml.FXML
    private TextField txtFldtype;
    @javafx.fxml.FXML
    private TextField txtFldVisitor;
    @javafx.fxml.FXML
    private TextField dateVisit;
    @javafx.fxml.FXML
    private Label lblCounter;
    @javafx.fxml.FXML
    private ComboBox<String> cmbPayment;

    @javafx.fxml.FXML
    public void initialize() {
        cmbPayment.getItems().addAll("cash","card");
    }

    @javafx.fxml.FXML
    public void btnConfirm(ActionEvent actionEvent) {
        String name= txtFldVisitor.getText();
        String type = txtFldtype.getText();
        String payment=cmbPayment.getValue();
        if(name.isEmpty()|| type.isEmpty()){
            lblCounter.setText("Fill all fields");

            };
        lblCounter.setText("Ticket Printed for name"+ name);
        }
    }
